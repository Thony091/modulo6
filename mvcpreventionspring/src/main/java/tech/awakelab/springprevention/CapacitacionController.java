package tech.awakelab.springprevention;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.springprevention.dao.CapacitacionDao;
import tech.awakelab.springprevention.modelo.Capacitacion;

@Controller
public class CapacitacionController {
	
	private static final Logger logger = Logger.getLogger(CapacitacionController.class);
	
	@Autowired
	CapacitacionDao capacitacion;
	
	@RequestMapping(path ="/capacitacion/new", method = RequestMethod.GET)
	public ModelAndView getTrainingForm() {
		return new ModelAndView("crear-capacitacion","","");
	}
	
	@RequestMapping(value ="/capacitaciones", method = RequestMethod.GET)
	public ModelAndView showAllTrainings() {
		List<Capacitacion> capacitaciones = capacitacion.getAllTrainings();
		return new ModelAndView("listar-capacitaciones","capacitaciones",capacitaciones);
	}
	
	@RequestMapping(value = "/capacitacion/save", method = RequestMethod.POST)
	public String saveTraining(HttpServletRequest request) {
		logger.info("Creando una nueva capacitacion");
		int id = Integer.parseInt(request.getParameter("id"));
		String rutcliente = request.getParameter("rutCliente");
		String dia = request.getParameter("dia");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		String duracion = request.getParameter("duracion");
		int cantasistentes = Integer.parseInt(request.getParameter("cantAsistentes"));
		
		Capacitacion newCapacitacion = new Capacitacion(id, rutcliente, dia, hora, lugar, duracion,cantasistentes);
	    capacitacion.saveTrainings(newCapacitacion);
	    return "redirect:/"; // Redirigir al usuario a la lista de capacitaciones
	}
}
