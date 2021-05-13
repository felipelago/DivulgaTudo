package br.com.divulgatudo.service;

import java.util.List;

import br.com.divulgatudo.model.Cliente;

public interface ClienteService {

	/*
	 * Cadastra um novo Cliente
	 * 
	 * @param aluno, O cliente que será criado
	 * 
	 * @return O cliente que foi cadastrado
	 * 
	 * @throws Se existir um cliente com o mesmo cpf retorna uma mensagem de
	 * erro
	 * 
	 */
	public Cliente salvar(Cliente cliente);

	/*
	 * Deletar um Cliente
	 * 
	 * @param idCliente, O cliente que será deletado
	 * 
	 */
	public void deletar(Long idCliente);

	/*
	 * Listar os clientes
	 * 
	 * @return a lista de anuncios.
	 * 
	 */
	public List<Cliente> listar();

	/*
	 * Editar um Cliente
	 * 
	 * @param cliente, O cliente que será editado
	 * 
	 * @return O cliente que foi editado
	 * 
	 */
	public Cliente editar(Cliente anuncio);

}
