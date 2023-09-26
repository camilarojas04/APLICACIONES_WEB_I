package pe.Camila.cibertec.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.Camila.cibertec.entity.categorias;
import pe.Camila.cibertec.interfaceService.CategoriaService;
import pe.Camila.cibertec.repository.CategoriasRepository;

@Service
public class CategoriasServiceImpl implements CategoriaService{
	
	@Autowired
	private CategoriasRepository categoriaRepository;

	@Override
	public List<categorias> listar() {
		
		return categoriaRepository.findAll();
	}

	@Override
	public Optional<categorias> buscar(int id) {
		
		return categoriaRepository.findById(id);
	}

	@Override
	public categorias agregar(categorias categoria) {
		
		return categoriaRepository.save(categoria);
	}
}
