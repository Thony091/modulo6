package tech.awakelab.mvcprevention.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.awakelab.mvcprevention.modelo.Cliente;
import tech.awakelab.mvcprevention.service.ClienteService;

@RestController
public class RestClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value="/api/clientes", headers = "Accept=application/json")
	public List<Cliente> getCustomers(){
		return clienteService.getAllCustomers();
	}
}
