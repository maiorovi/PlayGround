package app.basic;

import app.util.EntityManagerFactoryProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.validation.ConstraintViolationException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StudentPersistenceTest {
	private EntityManagerFactory entityManagerFactoryProvider;


	@BeforeEach
	void setUp() {
		entityManagerFactoryProvider = EntityManagerFactoryProvider.provide("derby-embedded");

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

		Student loadedStudent = em1.createQuery("from Student where id = 2", Student.class).getResultList().get(0);

		em1.getTransaction().commit();
		em1.close();

		assertThat(loadedStudent).isEqualTo(student);


	}

	@Test
	void throwsExceptionWhenUserWithNullNameIsProvidedForInsertion() {
		EntityManager em = entityManagerFactoryProvider.createEntityManager();
		Student student = new Student(null);

		em.getTransaction().begin();

//		Throwable exception = assertThrows(ConstraintViolationException.class, () -> {
//			em.persist(student);
//			em.getTransaction().commit();
//		}); this is junit approach to exception verifying

		//this is one is assertJ

		assertThatThrownBy(() -> {
			em.persist(student);
			em.getTransaction().commit();
		}).isExactlyInstanceOf(ConstraintViolationException.class);


		em.close();
	}

	@Test
	void findStudentViaNamedQueryOnAPackageLevel() {
		EntityManager em = entityManagerFactoryProvider.createEntityManager();
		Student student = new Student("Default name");

		em.getTransaction().begin();

		em.persist(student);

		em.getTransaction().commit();
		em.close();

		EntityManager em1 = entityManagerFactoryProvider.createEntityManager();

		em1.getTransaction().begin();

		Student loadedStudent = em1.createNamedQuery("findStudentById", Student.class).getResultList().get(0);
		em1.getTransaction().commit();
		em1.close();

		assertThat(loadedStudent).isEqualTo(student);
	}

	@AfterEach
	void tearDown() {
		EntityManager em = entityManagerFactoryProvider.createEntityManager();
		em.getTransaction().begin();
		em.createNativeQuery("truncate table STUDENT").executeUpdate();
		em.getTransaction().commit();
		em.close();
	}
}
