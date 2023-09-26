package pe.Camila.cibertec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Categorias")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class categorias {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String nomb;
}
