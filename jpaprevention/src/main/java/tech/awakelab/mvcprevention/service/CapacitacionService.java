package tech.awakelab.mvcprevention.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.mvcprevention.modelo.Capacitacion;
import tech.awakelab.mvcprevention.repository.ICapacitacionRepository;

@Service
public class CapacitacionService {
	
	@Autowired
	private ICapacitacionRepository capacitacionRepository;
	
	public CapacitacionService() {
		
	}

	public List<Capacitacion> getAllTrainings() {
		return capacitacionRepository.findAll();
	}

	public void saveTrainings(Capacitacion capacitacion) {
		capacitacionRepository.save(capacitacion);
	}
}