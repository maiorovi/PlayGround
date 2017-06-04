package app.dao;

import app.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserDao extends CrudRepository<User, Long> {

	List<User> findAll();
	User findUserByName(String name);
}
