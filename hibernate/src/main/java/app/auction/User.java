package app.auction;

import javax.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue(generator = "ID_GENERATOR")
	private String id;
	@Column(name = "user_name")
	private String userName;

	public User(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
