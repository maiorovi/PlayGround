package app.basic;

import app.util.EntityManagerFactoryProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.corba.EncapsInputStreamFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.validation.ConstraintViolationException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentPersistenceTest {
	private EntityManagerFactory entityManagerFactoryProvider;

	@BeforeEach
	void setUp() {
		entityManagerFactoryProvider = EntityManagerFactoryProvider.provide();
	}

	@Test
	void userIsPersistedAndThenLoadedSuccessfully() {
		EntityManager em = entityManagerFactoryProvider.createEntityManager();
		Student student = new Student("Default name");

		em.getTransaction().begin();

		em.persist(student);

		em.getTransaction().commit();
		em.close();

		EntityManager em1 = entityManagerFactoryProvider.createEntityManager();

		em1.getTransaction().begin();

		Student loadedStudent = em1.createQuery("from Student where id = 1", Student.class).getResultList().get(0);

		assertThat(loadedStudent).isEqualTo(student);
	}

	@Test
	void throwsExceptionWhenUserWithNullNameIsProvidedForInsertion() {
		EntityManager em = entityManagerFactoryProvider.createEntityManager();
		Student student = new Student(null);

		em.getTransaction().begin();

		Throwable exception = assertThrows(ConstraintViolationException.class, () -> {
			em.persist(student);
			em.getTransaction().commit();
		});

		em.close();
	}
}
