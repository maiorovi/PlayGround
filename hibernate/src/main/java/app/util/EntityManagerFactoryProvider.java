package app.util;

import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryProvider {

    private static EntityManagerFactory entityManagerFactory;

    public static EntityManagerFactory provide() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("first");
            return entityManagerFactory;
        }

        return entityManagerFactory;
    }
}
