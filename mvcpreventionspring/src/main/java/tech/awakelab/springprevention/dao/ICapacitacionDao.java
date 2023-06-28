package tech.awakelab.springprevention.dao;

import java.util.List;

import tech.awakelab.springprevention.modelo.Capacitacion;

public interface ICapacitacionDao {
	public List<Capacitacion> getAllTrainings();
	public boolean saveTrainings(Capacitacion capacitacion);
}
