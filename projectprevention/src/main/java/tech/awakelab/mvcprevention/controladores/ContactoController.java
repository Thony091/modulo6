package tech.awakelab.mvcprevention.controladores;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tech.awakelab.mvcprevention.modelo.Contacto;

@Controller
public class ContactoController {
	
	@RequestMapping(path = "/contacto", method = RequestMethod.GET)
	public ModelAndView getContactoForm() {
		return new ModelAndView("contacto", "", "");
	}
	
	@RequestMapping(value = "/contacto/save", method = RequestMethod.POST)
	public String saveTraining(HttpServletRequest request) {
		
		String nombreCompleto = request.getParameter("nombreCompleto");
		String email = request.getParameter("email");
		String asunto = request.getParameter("asunto");
		String mensaje = request.getParameter("mensaje");
		
		Contacto newContacto = new Contacto(nombreCompleto, email, asunto, mensaje);
		System.out.println(newContacto.toString());
		
	    return "redirect:/"; // Redirigir al usuario al inicio
	}
	
}