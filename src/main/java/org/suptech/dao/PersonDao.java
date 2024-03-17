package org.suptech.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.suptech.entities.Person;
import org.suptech.util.HibernateUtil;

public class PersonDao {

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private Session session = null;

    public Person addPerson(Person person) {
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }

        return person;
    }

}
