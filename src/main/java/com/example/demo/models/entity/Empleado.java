package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;



@Entity //marca esta clase como una entidad para luego verse reflejado como una tabla en la db
@Table(name="empleados") // cambiar el nombre de la tabla en la db
public class Empleado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// indicarle a este atributo que es el identificador y que es incremental al crearse un nuevo empleado.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(nullable=false) // indica que el atributo no debe ser nullo al crear un nuevo empleado
	@NotEmpty(message = "no puede estar vacío") // indica que el atributo no puede estar vacío
	@Size(min=4, max=12, message="debe estar conformado entre 4 a 12 carácteres") // indica que el atributo debe estar compuesto de un tamaño específico
	private String nombre;
	
	@NotEmpty(message = "no puede estar vacío")
	private String apellido;
	
	@Column(nullable=false, unique=true)
	@NotEmpty(message = "no puede estar vacío")
	private String email;
	
	//atributo para mostrar la fecha de creación de un empleado
	@Column(name="create_at")
	@Temporal(TemporalType.DATE) //mapear la fecha con la db simplemente, descartando la hora en este caso, solo muestra la fecha.
	private Date createAt;
	

	@PrePersist // se debe llamar al método antes de insertar la entidad a la db.
	public void prePersist() {
		createAt = new Date();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
}
