package br.com.divulgatudo.service;

import java.util.List;

import br.com.divulgatudo.model.Anuncio;

public interface AnuncioService {

	/*
	 * Cadastra um novo Anuncio
	 * 
	 * @param aluno, O anuncio que será criado
	 * 
	 * @return O anuncio que foi cadastrado
	 * 
	 * @throws Se existir um anuncio com o mesmo cliente retorna uma mensagem de
	 * erro
	 * 
	 */
	public Anuncio salvar(Anuncio anuncio);

	/*
	 * Deletar um anuncio
	 * 
	 * @param idAluno, O anuncio que será deletado
	 * 
	 */
	public void deletar(Long idPacote);

	/*
	 * Listar os anuncios
	 * 
	 * @return a lista de anuncios.
	 * 
	 */
	public List<Anuncio> listar();

	/*
	 * Editar um Anuncio
	 * 
	 * @param anuncio, O anuncio que será editado
	 * 
	 * @return O anuncio que foi editado
	 * 
	 */
	public Anuncio editar(Anuncio anuncio);

}
