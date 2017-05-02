package app.auction;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Item {

	@Id
	@GeneratedValue(generator = "ID_GENERATOR")
	private String id;
	private String name;
	@Formula(value = "(select avg(b.amount) from bid b where b.item_id=id)")
	private double averageBidAmount;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "item", cascade = CascadeType.ALL)
	private Set<Bid> bids = new HashSet<>();

	protected Item(){}

	public Item(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Bid> getBids() {
		return new HashSet<>(bids);
	}

	public void addBid(Bid bid) {
		bids.add(bid);
	}

	public double getAverageBidAmount() {
		return averageBidAmount;
	}
}
