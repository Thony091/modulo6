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
	
	
}
