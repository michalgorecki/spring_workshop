package pl.student.mgorecki.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pesel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	long PESEL;

	@OneToOne(mappedBy = "pesel")
	private User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getPESEL() {
		return PESEL;
	}

	public void setPESEL(long pESEL) {
		PESEL = pESEL;
	}
	

}
