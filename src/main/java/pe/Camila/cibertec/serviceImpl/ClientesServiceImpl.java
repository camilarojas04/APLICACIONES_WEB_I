package pe.Camila.cibertec.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.Camila.cibertec.entity.clientes;
import pe.Camila.cibertec.interfaceService.ClientesService;
import pe.Camila.cibertec.repository.ClientesRepository;

@Service
public class ClientesServiceImpl implements ClientesService{

	@Autowired
	private ClientesRepository clienteRepository;

	@Override
	public List<clientes> Listar() {
		
		return clienteRepository.findAll();
	}

	@Override
	public clientes Grabar(clientes clientes) {
		
		return clienteRepository.save(clientes);
	}
}
