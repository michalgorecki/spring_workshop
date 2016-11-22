package pl.student.mgorecki.service;

import java.util.List;

import pl.student.mgorecki.domain.Pesel;

public interface PeselService {

	public void addPesel(Pesel pesel);
	public void editPesel(Pesel pesel);
	public List<Pesel> listPesel();
	public void removePesel (int id);
	public Pesel getPesel(int id);
	
}
