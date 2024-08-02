package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Livro;

@Service
public class LivroService {

	public String save(Livro livro) {
		return "Livro salvo com sucesso!";
	}
	
	public String update(Livro livro, long id) {
		return "Livro atualizado com sucesso!";
	}
	
	public List<Livro> findAll() {
		List<Livro> lista = new ArrayList<>();
		
		lista.add(new Livro(1, "Livro 1", 2001, "Autor 1"));
		lista.add(new Livro(2, "Livro 2", 2002, "Autor 2"));
		lista.add(new Livro(3, "Livro 3", 2003, "Autor 3"));
		lista.add(new Livro(4, "Livro 4", 2004, "Autor 4"));
		lista.add(new Livro(5, "Livro 5", 2005, "Autor 5"));

		return lista;
	}
	
	public Livro findById(long id) {
		List<Livro> lista = this.findAll();
		
		for (Livro livro : lista) {
			if(livro.getId() == id) {
				return livro;
			}
		}
		
		return null;
		
	}
	
	public String delete(long id) {
		List<Livro> lista = this.findAll();
		
		for(Livro livro : lista) {
			if(livro.getId() == id) {
				return "Livro " + livro.getTitulo()+ " deletado com sucesso!";
			}
		}
		return "Erro ao deletar livro";
	}
	
}
