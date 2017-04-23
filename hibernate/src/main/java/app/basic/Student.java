package app.basic;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "STUDENT")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "student_name")
	@NotNull
	@Size(min = 2,
			max = 40,
			message = "length must be between 2 and 40")
	private String name;

	public Student(String name) {
		this.name = name;
	}

	protected Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// collections compared by identity(using ==)
	//objects compared by equality(using equals)
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Student student = (Student) o;

		if (id != student.id) return false;
		return name != null ? name.equals(student.name) : student.name == null;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
