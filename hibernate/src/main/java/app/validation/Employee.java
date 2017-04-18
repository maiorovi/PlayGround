package app.validation;

import javax.validation.constraints.NotNull;

public class Employee {

	@NotNull
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
