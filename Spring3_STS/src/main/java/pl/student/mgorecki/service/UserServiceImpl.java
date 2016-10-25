package pl.student.mgorecki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.student.mgorecki.dao.UserDAO;
import pl.student.mgorecki.domain.*;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDAO userDAO;
	
	@Transactional
	public void addUser(User user) {
		userDAO.addUser(user);
	}
	
	@Transactional
	public void editUser(User user) {
		userDAO.editUser(user);
	}

	@Transactional
	public List<User> listUser() {
		
		return userDAO.listUser();
	}

	@Transactional
	public void removeUser(int id) {
		userDAO.removeUser(id);
	}
	
	@Transactional
	public User getUser(int id) {
		return userDAO.getUser(id);
	}
}
