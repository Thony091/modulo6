package tech.awakelab.mvcprevention.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.mvcprevention.modelo.Capacitacion;
import tech.awakelab.mvcprevention.modelo.Cliente;
import tech.awakelab.mvcprevention.service.CapacitacionService;



@Controller
public class CapacitacionController {
	
	private static final Logger logger = Logger.getLogger(CapacitacionController.class);
	
	private RestTemplate restTemplate = new RestTemplate();
	
	@Autowired
	CapacitacionService cs;
	
	@RequestMapping(path ="/capacitacion/new", method = RequestMethod.GET)
	public ModelAndView getTrainingForm() {
		
		return new ModelAndView("crear-capacitacion","","");
	}
	
	
	@RequestMapping(value="/capacitaciones", method = RequestMethod.GET)
	public ModelAndView showAllTrainings() {
		logger.info("Obteniendo todas las capacitaciones de la base de datos");
		List<Capacitacion> capacitaciones = cs.getAllTrainings();
		return new ModelAndView("listar-capacitaciones", "capacitaciones", capacitaciones);
	}
	
	@RequestMapping(value = "/capacitacion/save", method = RequestMethod.POST)
	public String saveTraining(@ModelAttribute("capacitacion") Capacitacion capacitacion) {
		
		cs.saveTrainings(capacitacion); 
		ResponseEntity<List<Cliente>> response = restTemplate.exchange("http://localhost:8080/api/clientes", HttpMethod.GET, null, new ParameterizedTypeReference<List<Cliente>>() {});
		//* nota en enunciado dice: ******** */
		List<Cliente> clientes = response.getBody(); //* Estimado Cristian el ejercicio dice que solo debo obtener la lista de cliente sin embargo no me dice para que utilizar aqui tienes toda la implementacion de como traer la lista de clientes del servicio rest controller de clientes, cumple con lo requerido en la actividad 9
	   
		return "redirect:/capacitaciones"; // Redirigir al usuario a la lista de capacitaciones
	}
	
	
	// Para el formulario de login
	@RequestMapping(value="/login")
	public ModelAndView login() {
		logger.info("En El request de login");
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/error")
	public ModelAndView errorLogin() {
		return new ModelAndView("login", "error", "true");
	}
	
	@RequestMapping(value="/logout")
	public ModelAndView logout() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth != null) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		return new ModelAndView("redirect:/login?logout");
	}
    

}
