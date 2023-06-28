package tech.awakelab.mvcprevention.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.mvcprevention.dao.CapacitacionDAOImpl;
import tech.awakelab.mvcprevention.modelo.Capacitacion;

@Service
public class CapacitacionService {
	
	@Autowired
	CapacitacionDAOImpl capacitacionDAO;
	
	public CapacitacionService() {
		
	}

	public List<Capacitacion> getAllTrainings() {
		return capacitacionDAO.getAllTrainings();
	}

	public void saveTrainings(Capacitacion capacitacion) {
		capacitacionDAO.saveTrainings(capacitacion);
	}
}