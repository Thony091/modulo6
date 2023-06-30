package tech.awakelab.springprevention.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import tech.awakelab.springprevention.modelo.Capacitacion;

@Service
public class CapacitacionDao implements ICapacitacionDao{
	
	
	@Override
	public List<Capacitacion> getAllTrainings() {
		ArrayList<Capacitacion> capacitaciones = new ArrayList<>();
		capacitaciones.add(new Capacitacion(1,"11.111.111-1","Lunes","16:00","Hospital Central","2 horas",20));
		capacitaciones.add(new Capacitacion(2,"22.222.222-2","Miercoles","12:00","Centro de capacitaciones","3 horas",50));
		capacitaciones.add(new Capacitacion(3,"33.333.333-3","Sabado","10:00","Hospital ASCH","1 horas",35));
		return capacitaciones;
	}

	@Override
	public boolean saveTrainings(Capacitacion capacitacion) {
		System.out.println(capacitacion);
		return false;
	}

}
