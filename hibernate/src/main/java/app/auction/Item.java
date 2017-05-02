package app.auction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Item {

	@Id
	@GeneratedValue(generator = "ID_GENERATOR")
	private String id;
	private String name;
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
}
