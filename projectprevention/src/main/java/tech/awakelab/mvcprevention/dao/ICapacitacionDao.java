package tech.awakelab.mvcprevention.dao;

import java.util.List;

import tech.awakelab.mvcprevention.modelo.Capacitacion;

public interface ICapacitacionDao {
	public List<Capacitacion> getAllTrainings();
	public void saveTrainings(Capacitacion capacitacion);
}
