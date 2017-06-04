package app.dao;

import app.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(path = "data-rest-users", rel="/data-rest-users")
public interface UserDao extends CrudRepository<User, Long> {

	List<User> findAll();
	User findUserByName(String name);
}
