package tech.awakelab.mvcprevention.controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.mvcprevention.modelo.Capacitacion;
import tech.awakelab.mvcprevention.service.CapacitacionService;

@Controller
public class CapacitacionController {
	
	@Autowired
	CapacitacionService cs;
	
	@RequestMapping(path ="/capacitacion/new", method = RequestMethod.GET)
	public ModelAndView getTrainingForm() {
		return new ModelAndView("crear-capacitacion","","");
	}
	
	@RequestMapping(value="/capacitaciones", method = RequestMethod.GET)
	public ModelAndView showAllTrainings() {
		List<Capacitacion> capacitaciones = cs.getAllTrainings();
		return new ModelAndView("listar-capacitaciones", "capacitaciones", capacitaciones);
	}
	
	@RequestMapping(value = "/capacitacion/save", method = RequestMethod.POST)
	public String saveTraining(HttpServletRequest request) {
		
		String rutcliente = request.getParameter("rutCliente");
		String dia = request.getParameter("dia");
		String hora = request.getParameter("hora");
		String lugar = request.getParameter("lugar");
		String duracion = request.getParameter("duracion");
		int cantasistentes = Integer.parseInt(request.getParameter("cantAsistentes"));
		
		Capacitacion newCapacitacion = new Capacitacion(rutcliente, dia, hora, lugar, duracion,cantasistentes);
		
	    cs.saveTrainings(newCapacitacion); 
	    return "redirect:/capacitaciones"; // Redirigir al usuario a la lista de capacitaciones
	}
	
}
