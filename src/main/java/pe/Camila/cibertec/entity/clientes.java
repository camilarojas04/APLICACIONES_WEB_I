package pe.Camila.cibertec.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Clientes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class clientes {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String nomb;
	
	@Size(min = 3, max = 30)
	private String Apelli;
	
	@Email
	private String Emails;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechNaci;
	
	@Size(min = 8, max = 8)
	private String DNI;
}
