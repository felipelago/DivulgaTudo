package br.com.divulgatudo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.divulgatudo.model.Anuncio;
import br.com.divulgatudo.repository.AnuncioRepository;

@Service // Para o SpringBoot entender que essa classe de serviço
@Transactional // Para transações de banco de dados
public class AnuncioServiceImpl implements AnuncioService {

	@Autowired
	AnuncioRepository repository;

	public AnuncioServiceImpl(AnuncioRepository r) {
		this.repository = r;
	}

	@Override
	public Anuncio salvar(Anuncio anuncio) {
		return repository.save(anuncio);
		}
	

	@Override
	public void deletar(Long idAnuncio) {
		repository.deleteById(idAnuncio);
		System.out.println("Anuncio deletado com sucesso !");
	}

	@Override
	public List<Anuncio> listar() {
		return repository.findAll();

	}

	@Override
	public Anuncio editar(Anuncio anuncio) {
		return repository.save(anuncio);
	}

}
