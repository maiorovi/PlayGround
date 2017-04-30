package app.auction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ContextConfiguration("classpath:META-INF/test-context.xml ")
@ExtendWith(SpringExtension.class)
public class UserPersistenceTest {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Test
	void persistsRegularUser() {
		User user = new User("Egor");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(user);

		entityManager.getTransaction().commit();
	}
}
