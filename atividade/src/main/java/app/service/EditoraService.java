package app.service;

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
		this.editoraRepository.save(editora);
		return "Editora salva com sucesso!";
	}
	
	public String update(Editora editora, long id) {
		editora.setId(id);
		this.editoraRepository.save(editora);
		return "Editora atualizada com sucesso!";
	}
	
	public List<Editora> findAll() {
		List<Editora> lista = this.editoraRepository.findAll();
		return lista;
	}
	
	public Editora findById(long id) {
		Editora editora = editoraRepository.findById(id).get();
		return editora;
	}
	
	public String delete(long id) {
		this.editoraRepository.deleteById(id);
		return "Erro ao deletar editora";
	}

}
