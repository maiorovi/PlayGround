package app.util;

import org.springframework.beans.factory.FactoryBean;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryBean implements FactoryBean<EntityManagerFactory> {

	private String persistenceUnitName;
	private EntityManagerFactory entityManagerFactory;

	public EntityManagerFactoryBean(String persistenceUnitName) {
		this.persistenceUnitName = persistenceUnitName;
	}

	@Override
	public EntityManagerFactory getObject() throws Exception {
		if (entityManagerFactory != null) {
			return  entityManagerFactory;
		} else {
			if (entityManagerFactory == null) {
				entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
				return entityManagerFactory;
			}

			return entityManagerFactory;
		}
	}

	@Override
	public Class<?> getObjectType() {
		return EntityManagerFactory.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
