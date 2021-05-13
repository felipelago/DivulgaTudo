package br.com.divulgatudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.divulgatudo.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	boolean existsByCpf(String cpf);
}
