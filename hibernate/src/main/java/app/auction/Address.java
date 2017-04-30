package app.auction;

import javax.persistence.Entity;
import javax.persistence.Table;

public final class Address {

	private String street;
	private String country;
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
