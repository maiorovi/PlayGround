package app.auction;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;
@Embeddable
public final class Address {
	@Column(nullable = false)
	private String street;
	@Column(nullable = false)
	private String country;
	@Column(nullable = false)
	private String city;

	protected Address() {
	}

	public Address(String street, String country, String city) {
		this.street = street;
		this.country = country;
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}
}
