package app.service;

import java.util.ArrayList;
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
		return "Biblioteca salva com sucesso!";
	}
	
	public String update(Biblioteca biblioteca, long id) {
		return "Biblioteca atualizada com sucesso!";
	}
	
	public List<Biblioteca> findAll() {
		List<Biblioteca> lista = new ArrayList<>();
		
		lista.add(new Biblioteca(1, "Rua 1", "45 9 9999-9999"));
		lista.add(new Biblioteca(2, "Rua 2", "45 9 9999-9999"));
		lista.add(new Biblioteca(3, "Rua 3", "45 9 9999-9999"));
		lista.add(new Biblioteca(4, "Rua 4", "45 9 9999-9999"));
		lista.add(new Biblioteca(5, "Rua 5", "45 9 9999-9999"));
		
		return lista;
	}
	
	public Biblioteca findById(long id) {
		List<Biblioteca> lista = this.findAll();
		
		for(Biblioteca biblioteca : lista) {
			if(biblioteca.getId() == id) {
				return biblioteca;
			}
		}
		return null;
	}
	
	public String delete(long id) {
		List<Biblioteca> lista = this.findAll();
		
		for(Biblioteca biblioteca : lista) {
			if(biblioteca.getId() == id) {
				return "Endereço da biblioteca deletada: " + biblioteca.getEndereco();
			}
		}
		return "Biblioteca não encontrada";
	}

}
