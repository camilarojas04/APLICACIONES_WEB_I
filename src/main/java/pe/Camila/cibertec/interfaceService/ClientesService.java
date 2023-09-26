package pe.Camila.cibertec.interfaceService;

import java.util.List;

import pe.Camila.cibertec.entity.clientes;

public interface ClientesService {
	public List<clientes> Listar();
	public clientes Grabar(clientes clientes);
}
