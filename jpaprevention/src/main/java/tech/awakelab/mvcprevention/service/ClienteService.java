package tech.awakelab.mvcprevention.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.awakelab.mvcprevention.modelo.Cliente;
import tech.awakelab.mvcprevention.repository.IClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private IClienteRepository clienteRepository;

	public ClienteService() {
		
	}
	
	public List<Cliente> getAllCustomers(){
		return clienteRepository.findAll();
	}
	
}
