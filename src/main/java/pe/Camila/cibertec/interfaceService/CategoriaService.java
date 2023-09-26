package pe.Camila.cibertec.interfaceService;

import java.util.List;
import java.util.Optional;

import pe.Camila.cibertec.entity.categorias;

public interface CategoriaService {
	public List<categorias> listar();
	public Optional<categorias> buscar(int id);
	public categorias agregar(categorias categoria);
}
