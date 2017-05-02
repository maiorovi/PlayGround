package app.auction;

import javax.persistence.*;

@Entity
public class Bid {

	@Id
	@GeneratedValue(generator = "ID_GENERATOR")
	private String id;
	private final double amount;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ITEM_ID", nullable = false)
	private final Item item;

	public Bid(double amount, Item item) {
		this.amount = amount;
		this.item = item;
		item.addBid(this);
	}

	public double getAmount() {
		return amount;
	}

	public Item getItem() {
		return item;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Bid{" +
				"id='" + id + '\'' +
				", amount=" + amount +
				", item=" + item +
				'}';
	}
}
