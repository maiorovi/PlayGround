package app.auction;

import app.auction.enums.AuctionType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.tuple;

@ContextConfiguration("classpath:META-INF/test-context.xml ")
@ExtendWith(SpringExtension.class)
public class ItemPersistenceTest {
	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@BeforeEach
	void setUp() {

	}

	@Test
	void persistsItemsWithBids() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Item item = new Item("Porshe Carrera");
		Bid bid1 = new Bid(20000, item);
		Bid bid2 = new Bid(25000, item);
		Bid bid3 = new Bid(45000, item);

		entityManager.getTransaction().begin();

		entityManager.persist(item);

		entityManager.getTransaction().commit();

		entityManager.getTransaction().begin();

		Item loadedItem = entityManager
							.createQuery("from Item where name=:name", Item.class)
							.setParameter("name", "Porshe Carrera")
							.getSingleResult();

		Set<Bid> bids = loadedItem.getBids();
		System.out.println(loadedItem.getAverageBidAmount());

		for(Bid bid : bids) {
			System.out.println(bid);
		}

		assertThat(loadedItem).isNotNull();
		assertThat(loadedItem.getName()).isEqualTo("Porshe Carrera");
		assertThat(loadedItem.getBids())
				.hasSize(3)
				.contains(bid1, bid2, bid3);

		assertThat(loadedItem.getAuctionType()).isEqualTo(AuctionType.HIGHEST_BID);
//		assertThat(loadedItem.getAverageBidAmount()).isEqualTo(30000.0);
	}
}
