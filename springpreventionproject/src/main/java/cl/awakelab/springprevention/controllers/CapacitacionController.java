package cl.awakelab.springprevention.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CapacitacionController {
	
	@GetMapping({"capacitacion/new"})
	public String crearCapacitacionForm() {
		return "crear-capacitacion";
	}
	
	@GetMapping({"listarCapacitaciones"})
	public String showAllTraining() {
		return "listar-capacitaciones";	
	}
	
}
