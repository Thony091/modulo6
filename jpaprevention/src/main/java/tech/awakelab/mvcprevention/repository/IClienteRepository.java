package tech.awakelab.mvcprevention.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.awakelab.mvcprevention.modelo.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}
