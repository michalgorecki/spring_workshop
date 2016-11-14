package pl.student.mgorecki.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.student.mgorecki.domain.User;
import pl.student.mgorecki.domain.UserRole;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	public List<User> listUser() {

		return sessionFactory.getCurrentSession().createQuery("from User order by id").list();
	}

	public void removeUser(int id) {
		User user = (User) sessionFactory.getCurrentSession().load(User.class, id);
		if (null != user) {
			sessionFactory.getCurrentSession().delete(user);
		}

	}

	public User getUser(int id) {

		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	public void editUser(User user) {

		sessionFactory.getCurrentSession().update(user);
	}

	@SuppressWarnings("unchecked")
	public User findByLogin(String login) {
		List<User> users = new ArrayList<User>();

		users = sessionFactory.getCurrentSession().createQuery("from User where login=?").setParameter(0, login).list();

		if (users.size() > 0) {
			return users.get(0);
		} else {
			return null;
		}
	}

	public void addRole(UserRole userRole) {
		sessionFactory.getCurrentSession().save(userRole);
	}

	public List<UserRole> listUserRole() {
		return sessionFactory.getCurrentSession().createQuery("from UserRole order by id").list();
	}

	public void removeUserRole(int id) {
		UserRole userRole = (UserRole) sessionFactory.getCurrentSession().load(UserRole.class, id);
		if (null != userRole) {
			sessionFactory.getCurrentSession().delete(userRole);
		}
	}

	public UserRole getUserRole(int id) {
		return (UserRole) sessionFactory.getCurrentSession().get(UserRole.class, id);
	}

	@SuppressWarnings("unchecked")
	public UserRole findRoleByName(String role) {

		List<UserRole> userRole = new ArrayList<UserRole>();

		userRole = sessionFactory.getCurrentSession().createQuery("from UserRole where role=?").setParameter(0, role)
				.list();

		if (userRole.size() > 0) {
			return userRole.get(0);
		} else {
			return null;
		}
	}
}
