package app.basic;

import app.util.EntityManagerFactoryProvider;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Demo {
    public static void main(String[] args) {
        EntityManagerFactory emf = EntityManagerFactoryProvider.provide();

        EntityManager em = emf.createEntityManager();

        Student student = createStudent();

        em.getTransaction().begin();

        em.persist(student);

        em.getTransaction().commit();

        em.close();
    }

    private static Student createStudent() {
        Student student = new Student(null);

        return student;
    }
}
