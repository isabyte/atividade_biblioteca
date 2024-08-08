package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Livro;
import app.repository.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;

	public String save(Livro livro) {
		this.livroRepository.save(livro);
		return "Livro salvo com sucesso!";
	}
	
	public String update(Livro livro, long id) {
		livro.setId(id);
		this.livroRepository.save(livro);
		return "Livro atualizado com sucesso!";
	}
	
	public List<Livro> findAll() {
		List<Livro> lista = this.livroRepository.findAll();
		return lista;
	}
	
	public Livro findById(long id) {
		Livro livro = this.livroRepository.findById(id).get();
		return livro;
		
	}
	
	public String delete(long id) {
		this.livroRepository.deleteById(id);
		return "Erro ao deletar livro";
	}
	
}
