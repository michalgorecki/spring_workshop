package pl.student.mgorecki.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import pl.student.mgorecki.domain.Address;
import pl.student.mgorecki.domain.User;

@Repository
public class AddressDAOImpl implements AddressDAO {

	@Autowired
    SessionFactory sessionFactory;
	
	@Transactional
	public void addAddress(Address address) {
		sessionFactory.getCurrentSession().save(address);
	}

	@Transactional
	public List<Address> listAddress() {
		  return sessionFactory.getCurrentSession().createQuery("from Address order by id").list();
	}

	@Transactional
	public void removeAddress(int id) {
		Address address = (Address) sessionFactory.getCurrentSession().load(
                User.class, id);
        if (null != address) {
            sessionFactory.getCurrentSession().delete(address);
        }
	}

	@Transactional
	public Address getAddress(int id) {
    	return (Address)sessionFactory.getCurrentSession().get(Address.class, id);

	}

	@Transactional
	public void editAddress(Address address) {
		sessionFactory.getCurrentSession().update(address);

	}

}
