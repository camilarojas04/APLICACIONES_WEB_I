package pe.Camila.cibertec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.Camila.cibertec.entity.categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<categorias, Integer>{

}
