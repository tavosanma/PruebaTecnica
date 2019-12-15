package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.demo.models.entity.Empleado;
import com.example.demo.models.services.IEmpleadoService;



@Controller
public class EmpleadoController {
	@Autowired
	private IEmpleadoService empleadoService;
	
	
	//Model se usa para pasar datos a la vista
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String listar(Model model) {
		
		
		List<Empleado> empleados = empleadoService.findAll();
		model.addAttribute("titulo", "empleados");
		model.addAttribute("empleados", empleados);

		
		return "index"; //significa que buscará el archivo index.html en este caso 
	}
}
