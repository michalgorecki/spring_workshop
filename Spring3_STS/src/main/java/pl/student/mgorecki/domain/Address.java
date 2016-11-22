package pl.student.mgorecki.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@Column
	private String city;
	private String street;
	private String postalCode;
	private int buildingNumber;
	private int flatNumber;
	
	@OneToMany(mappedBy="address")
	private List<User> userList;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}
	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}
	
	public int getId() {
		return id;
	}
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public int getBuildingNumber() {
		return buildingNumber;
	}
	public int getFlatNumber() {
		return flatNumber;
	}
	
	
		
}
