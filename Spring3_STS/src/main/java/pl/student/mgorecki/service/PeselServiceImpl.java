package pl.student.mgorecki.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pl.student.mgorecki.dao.PeselDAO;
import pl.student.mgorecki.domain.Pesel;

@Service
@Transactional
public class PeselServiceImpl implements PeselService{

	@Autowired
	PeselDAO peselDAO;
	
	@Transactional
	public void addPesel(Pesel pesel) {
		peselDAO.addPesel(pesel);
	}
	
	@Transactional
	public void editPesel(Pesel pesel) {
		peselDAO.editPesel(pesel);
	}

	@Transactional
	public List<Pesel> listPesel() {
		
		return peselDAO.listPesel();
	}

	@Transactional
	public void removePesel(int id) {
		peselDAO.removePesel(id);
	}
	
	@Transactional
	public Pesel getPesel(int id) {
		return peselDAO.getPesel(id);
	}
}
