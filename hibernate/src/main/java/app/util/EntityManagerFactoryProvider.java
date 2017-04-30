package app.util;

import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * deprecated use FactoryBean instead
 */
@Deprecated
public class EntityManagerFactoryProvider {

    private static EntityManagerFactory entityManagerFactory;

    public static EntityManagerFactory provide(String persistenceUnit) {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnit);
            return entityManagerFactory;
        }

        return entityManagerFactory;
    }
}
