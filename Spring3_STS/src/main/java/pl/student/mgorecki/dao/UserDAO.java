package pl.student.mgorecki.dao;

import java.util.List;

import pl.student.mgorecki.domain.User;

public interface UserDAO {

	public void addUser(User user);
	public List<User> listUser();
	public void removeUser (int id);
	public User getUser(int id);
	public void editUser(User user);
	
}
