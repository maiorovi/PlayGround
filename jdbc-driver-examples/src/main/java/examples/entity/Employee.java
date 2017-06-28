package examples.entity;

public class Employee {
	private String name;
	private Integer age;
	private Integer salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Employee employee = (Employee) o;

		if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
		if (age != null ? !age.equals(employee.age) : employee.age != null) return false;
		return salary != null ? salary.equals(employee.salary) : employee.salary == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (age != null ? age.hashCode() : 0);
		result = 31 * result + (salary != null ? salary.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				", salary='" + salary + '\'' +
				'}';
	}
}
