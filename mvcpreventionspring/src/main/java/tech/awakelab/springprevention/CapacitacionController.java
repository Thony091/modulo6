package tech.awakelab.springprevention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.springprevention.dao.CapacitacionDao;

@Controller
public class CapacitacionController {
	@Autowired
	CapacitacionDao capacitacion;
	
	@RequestMapping(path ="/capacitacion/new", method = RequestMethod.GET)
	public ModelAndView getTrainingForm() {
		return new ModelAndView("crear-capacitacion","","");
	}
	
	@RequestMapping(value ="/capacitaciones", method = RequestMethod.GET)
	public ModelAndView showAllTrainings() {
		return new ModelAndView("listar-capacitaciones","capacitaciones",capacitacion.getAllTrainings());
	}
	
}
