package app.auction;

import javax.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue(generator = "ID_GENERATOR")
	private String id;
	@Column(name = "user_name")
	private String userName;
	@Access(AccessType.PROPERTY)
	private int age;
	@Embedded
	private Address homeAddress;

	public User(String userName, int age) {
		this.userName = userName;
		this.age = age;
		this.homeAddress = new Address("Unknown", "Unknown", "Unknown");
	}

	public User(String userName, int age, Address homeAddress) {
		this.userName = userName;
		this.age = age;
		this.homeAddress = homeAddress;
	}

	public String getUserName() {
		System.out.println("getUserName is called");
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		System.out.println("getAge is called!");
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
