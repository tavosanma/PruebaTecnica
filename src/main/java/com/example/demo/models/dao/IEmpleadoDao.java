package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Empleado;

//Interfaz con CrudRepository que provee métodos automáticamente para ser utilizados.
public interface IEmpleadoDao extends CrudRepository<Empleado, Long>{

}
