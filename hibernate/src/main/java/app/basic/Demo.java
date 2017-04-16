package app.basic;

import app.util.EntityManagerFactoryProvider;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Demo {
    public static void main(String[] args) {
        EntityManagerFactory emf = EntityManagerFactoryProvider.provide();

        EntityManager em = emf.createEntityManager();

        Student student = new Student("Egor");

        em.getTransaction().begin();

        em.persist(student);

        em.getTransaction().commit();

        em.close();
    }
}
