@org.hibernate.annotations.NamedQueries({
		@org.hibernate.annotations.NamedQuery(
				name="findStudentById",
				query="from Student where id = 1"
		)
})
package app.basic;

