package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Biblioteca;
import app.repository.BibliotecaRepository;

@Service
public class BibliotecaService {
	
	@Autowired
	private BibliotecaRepository bibliotecaRepository;
	
	public String save(Biblioteca biblioteca) {
		this.bibliotecaRepository.save(biblioteca);
		return "Biblioteca salva com sucesso!";
	}
	
	public String update(Biblioteca biblioteca, long id) {
		biblioteca.setId(id);
		this.bibliotecaRepository.save(biblioteca);
		return "Biblioteca atualizada com sucesso!";
	}
	
	public List<Biblioteca> findAll() {
		List<Biblioteca> lista = this.bibliotecaRepository.findAll();
		return lista;
	}
	
	public Biblioteca findById(long id) {
		Biblioteca biblioteca = this.bibliotecaRepository.findById(id).get();
		return biblioteca;
	}
	
	public String delete(long id) {
		this.bibliotecaRepository.deleteById(id);
		return "Biblioteca não encontrada";
	}

}
