package pl.student.mgorecki.dao;

import java.util.List;

import pl.student.mgorecki.domain.Address;
import pl.student.mgorecki.domain.User;

public interface AddressDAO {
	public void addAddress(Address address);
	public List<Address> listAddress();
	public void removeAddress (int id);
	public Address getAddress(int id);
	public void editAddress(Address address);
}
