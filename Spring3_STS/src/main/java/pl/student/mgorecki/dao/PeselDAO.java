package pl.student.mgorecki.dao;

import java.util.List;

import pl.student.mgorecki.domain.Pesel;

public interface PeselDAO {

	public void addPesel(Pesel pesel);
	public List<Pesel> listPesel();
	public void removePesel (int id);
	public Pesel getPesel(int id);
	public void editPesel(Pesel pesel);
	
}
