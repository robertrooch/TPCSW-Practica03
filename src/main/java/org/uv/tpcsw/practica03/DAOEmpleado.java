
package org.uv.tpcsw.practica03;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOEmpleado implements IDAOGeneral<Empleado, Long> {

    @Override
    public boolean save(Empleado pojo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t = session.beginTransaction();
        session.save(pojo);
        t.commit();
        return true;
    }

    @Override
    public boolean delete(Long pojo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t = session.beginTransaction();
        Empleado emp = session.get(Empleado.class, pojo);
        if (emp != null) {
            session.delete(emp);
            t.commit();
            return true;
        }
        t.rollback();
        return false;
    }

    @Override
    public boolean update(Empleado pojo, Long id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t = session.beginTransaction();
        Empleado emp = session.get(Empleado.class, id);
        if (emp != null) {
            emp.setNombre(pojo.getNombre());
            emp.setDireccion(pojo.getDireccion());
            emp.setTelefono(pojo.getTelefono());
            session.update(emp);
            t.commit();
            return true;
        }
        t.rollback();
        return false;
    }

    @Override
    public List<Empleado> findAll() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t = session.beginTransaction();
        Query<Empleado> query = session.createQuery("from Empleado", Empleado.class);
        List<Empleado> empleados = query.list();
        t.commit();
        return empleados;
    }

    @Override
    public Empleado findById(Long id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t = session.beginTransaction();
        Empleado emp = session.get(Empleado.class, id);
        t.commit();
        return emp;
    }
    
}
