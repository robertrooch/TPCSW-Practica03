/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.tpcsw.practica03;

import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author roberto
 */
public class TPCSWPractica03 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Empleado empleado = new Empleado();
        //empleado.setClave(10);
        empleado.setNombre("David");
        empleado.setDireccion("Av 2");
        empleado.setTelefono("282");

//        Departamento departamento = new Departamento();
//        departamento.setNombre("Administricacion");
        
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t=session.beginTransaction();
        
//        session.save(departamento);
        Departamento dep = session.get(Departamento.class,1L);
//        
        if (dep != null){
            System.out.println("Clave:" + dep.getClave()+" Nom:"+dep.getNombre());
            Set<Empleado> lstEmplado = dep.getEmpleados();
            for (Empleado empleado1 : lstEmplado){
                System.out.println("clave: "+empleado1.getNombre());
            }
//            empleado.setDepto(dep);
//            session.save(empleado);
        }
//        
        t.commit();
    }
}
