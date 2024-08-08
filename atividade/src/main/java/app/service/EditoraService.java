package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Editora;
import app.repository.EditoraRepository;

@Service
public class EditoraService {
	
	@Autowired
	private EditoraRepository editoraRepository;
	
	public String save(Editora editora) {
		return "Editora salva com sucesso!";
	}
	
	public String update(Editora editora, long id) {
		return "Editora atualizada com sucesso!";
	}
	
	public List<Editora> findAll() {
		List<Editora> lista = new ArrayList<>();
		
		lista.add(new Editora(1, "Editora 1", "Rua 1"));
		lista.add(new Editora(2, "Editora 2", "Rua 2"));
		lista.add(new Editora(3, "Editora 3", "Rua 3"));
		lista.add(new Editora(4, "Editora 4", "Rua 4"));
		lista.add(new Editora(5, "Editora 5", "Rua 5"));

		return lista;
	}
	
	public Editora findById(long id) {
		List<Editora> lista = this.findAll();
		
		for (Editora editora : lista) {
			if(editora.getId() == id) {
				return editora;
			}
		}
		return null;
	}
	
	public String delete(long id) {
		List<Editora> lista = this.findAll();
		
		for(Editora editora : lista) {
			if(editora.getId() == id) {
				return "Editora " + editora.getNome()+ " deletada com sucesso";
			}
		}
		return "Erro ao deletar editora";
	}

}
