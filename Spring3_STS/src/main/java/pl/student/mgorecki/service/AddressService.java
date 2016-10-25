package pl.student.mgorecki.service;

import java.util.List;

import pl.student.mgorecki.domain.Address;

public interface AddressService {

	public void addAddress(Address address);
	public void editAddress(Address address);
	public List<Address> listAddress();
	public void removeAddress (int id);
	public Address getAddress(int id);
}
