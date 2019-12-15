package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.Empleado;

//Interfaz con los metodos crud que se implementan en el ServiceImplements
public interface IEmpleadoService {

	public List<Empleado> findAll();
	
	public Empleado findById(Long id);
	
	public Empleado save(Empleado empleado);
	
	public void delete (Long id);
}
