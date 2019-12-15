package com.example.demo.models.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IEmpleadoDao;
import com.example.demo.models.entity.Empleado;

//implementación de algunos de los métodos de CrudRepository
@Service
public class EmpleadoServiceImplements implements IEmpleadoService{

	@Autowired
	private IEmpleadoDao empleadoDao;
	
	@Override
	@Transactional(readOnly = true) // solo de lectura y no escritura
	public List<Empleado> findAll() {
		return (List<Empleado>) empleadoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Empleado findById(Long id) {
		
		return empleadoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional // método de escritura y lectura
	public Empleado save(Empleado empleado) {
		return empleadoDao.save(empleado);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		empleadoDao.deleteById(id);
		
	}

}
