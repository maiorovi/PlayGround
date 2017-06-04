package app.restcontroller;

import app.dao.UserDao;
import app.domain.Book;
import app.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/")
public class DefaultRestController {

	@Autowired
	private UserDao userDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloRequest() {
		return "Hello World!";
	}

	@RequestMapping(value = "user", method = RequestMethod.GET, produces = {"application/xml", "application/json"})
	public User getUser() {
		Book book = new Book();
		book.setAuthor("Author");
		book.setBookName("bookName");

		User user = new User("Egor", 26);
		user.addBook(book);
		userDao.save(user);

		return user;
	}

	@RequestMapping(value = "users", method = RequestMethod.GET, produces = {"application/xml", "application/json"})
	public List<User> getAllUsers() {
		return userDao.findAll();
	}

}
