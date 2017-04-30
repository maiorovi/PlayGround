package app.auction;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

	//the database identity is exposed to java application with field annotated with Id property
	@Id
//	@GeneratedValue(generator = "ID_GENERATOR")
	protected Long id;

	public Long getId() {
		return id;
	}

}
