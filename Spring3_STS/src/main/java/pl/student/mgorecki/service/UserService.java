package pl.student.mgorecki.service;

import java.util.List;

import pl.student.mgorecki.domain.User;
import pl.student.mgorecki.domain.UserRole;

public interface UserService {

	public void addUser(User user);

	public void editUser(User user);

	public List<User> listUser();

	public void removeUser(int id);

	public User getUser(int id);

	public String hashPassword(String password);

	public void addUserRole(UserRole userRole);

	public List<UserRole> listUserRole();

	public void removeUserRole(int id);

	public UserRole getUserRole(int id);
}
