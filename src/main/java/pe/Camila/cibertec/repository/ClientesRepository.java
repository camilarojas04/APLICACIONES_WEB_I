package pe.Camila.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.Camila.cibertec.entity.clientes;

@Repository
public interface ClientesRepository extends JpaRepository<clientes, Integer>{

}
