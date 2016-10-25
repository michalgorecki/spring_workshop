package pl.student.mgorecki.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pl.student.mgorecki.domain.User;

public interface UserService {

	public void addUser(User user);
	public void editUser(User user);
	public List<User> listUser();
	public void removeUser (int id);
	public User getUser(int id);
	
}
