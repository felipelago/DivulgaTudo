package br.com.divulgatudo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.divulgatudo.error.ResourceNotFoundException;
import br.com.divulgatudo.model.Cliente;
import br.com.divulgatudo.repository.ClienteRepository;

@Service // Para o SpringBoot entender que essa classe de serviço
@Transactional // Para transações de banco de dados

public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository repository;

	public ClienteServiceImpl(ClienteRepository r) {
		this.repository = r;
	}

	@Override
	public Cliente salvar(Cliente cliente) {
		if (repository.existsByCpf(cliente.getCpf())) {
			throw new ResourceNotFoundException("Cliente Já existente");			
		} else {
	return repository.save(cliente);
		}
	}
	@Override
	public void deletar(Long idCliente) {
		repository.deleteById(idCliente);
		System.out.println("Cliente deletado com sucesso !");
	}

	@Override
	public List<Cliente> listar() {
		return repository.findAll();

	}

	@Override
	public Cliente editar(Cliente cliente) {
		return repository.save(cliente);
	}

}
