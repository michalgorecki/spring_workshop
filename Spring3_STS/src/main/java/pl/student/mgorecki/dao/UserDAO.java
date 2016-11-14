package pl.student.mgorecki.dao;

import java.util.List;

import pl.student.mgorecki.domain.User;
import pl.student.mgorecki.domain.UserRole;

public interface UserDAO {

	public void addUser(User user);
	public List<User> listUser();
	public void removeUser (int id);
	public User getUser(int id);
	public void editUser(User user);
	public User findByLogin(String login);
	
	public void addRole(UserRole userRole);
	public List<UserRole> listUserRole();
	public void removeUserRole(int id);
	public UserRole getUserRole(int id);
	public UserRole findRoleByName(String role);
	
}
