/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.tpcsw.practica03;

import java.util.List;
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
        //Buscar por ID
        if (dep != null){
            System.out.println("Clave:" + dep.getClave()+" Nom:"+dep.getNombre());
            Set<Empleado> lstEmplado = dep.getEmpleados();
            for (Empleado empleado1 : lstEmplado){
                System.out.println("clave: "+empleado1.getNombre());
            }
//            empleado.setDepto(dep);
//            session.save(empleado);
        }
        
        //Actualizar empleado
        Empleado empleadoEncontrado = session.get(Empleado.class, empleado.getClave());
        if (empleadoEncontrado != null) {
            empleadoEncontrado.setNombre("David Actualizado");
            session.update(empleadoEncontrado);
            System.out.println("Empleado actualizado: " + empleadoEncontrado.getNombre());
        }
        
        // ELIMINAR un empleado
        if (empleadoEncontrado != null) {
            session.delete(empleadoEncontrado);
            System.out.println("Empleado eliminado: " + empleadoEncontrado.getNombre());
        }
        
        // BUSCAR TODOS los empleados
        List<Empleado> listaEmpleados = session.createQuery("from Empleado").list();
        System.out.println("Lista de todos los empleados:");
        for (Empleado emp : listaEmpleados) {
            System.out.println("Nombre: " + emp.getNombre() + ", Teléfono: " + emp.getTelefono());
        }
        
        
//        
        t.commit();
    }
}
