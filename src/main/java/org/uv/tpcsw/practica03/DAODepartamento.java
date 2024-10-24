/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.tpcsw.practica03;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author roberto
 */
public class DAODepartamento implements IDAOGeneral<Departamento,Long> {

    @Override
    public boolean save(Departamento pojo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();  // Abrimos una nueva sesión
        Transaction t = session.beginTransaction();  // Iniciamos la transacción
        try {
            session.save(pojo);
            t.commit();  // Confirmamos la transacción
            return true;
        } catch (Exception e) {
            if (t != null) {
                t.rollback();  // Revertimos en caso de error
            }
            e.printStackTrace();
            return false;
        } finally {
            session.close();  // Cerramos la sesión
        }
    }

    @Override
    public boolean delete(Long pojo) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        try {
            Departamento departamento = session.get(Departamento.class, pojo);
            if (departamento != null) {
                session.delete(departamento);
                t.commit();
                return true;
            }
            t.rollback();
            return false;
        } catch (Exception e) {
            if (t != null) {
                t.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    @Override
    public boolean update(Departamento pojo, Long id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        try {
            Departamento dep = session.get(Departamento.class, id);
            if (dep != null) {
                dep.setNombre(pojo.getNombre());
                dep.setEmpleados(pojo.getEmpleados());
                session.update(dep);
                t.commit();
                return true;
            }
            t.rollback();
            return false;
        } catch (Exception e) {
            if (t != null) {
                t.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Departamento> findAll() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        try {
            Query<Departamento> query = session.createQuery("from Departamento", Departamento.class);
            List<Departamento> departamentos = query.list();
            t.commit();
            return departamentos;
        } catch (Exception e) {
            if (t != null) {
                t.rollback();
            }
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    public Departamento findById(Long id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        try {
            Departamento departamento = session.get(Departamento.class, id);
            t.commit();
            return departamento;
        } catch (Exception e) {
            if (t != null) {
                t.rollback();
            }
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
    
}
