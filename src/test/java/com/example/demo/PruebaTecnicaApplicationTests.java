package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.controllers.EmpleadoRestController;
import com.example.demo.models.dao.IEmpleadoDao;
import com.example.demo.models.entity.Empleado;
import com.example.demo.models.services.EmpleadoServiceImplements;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(value=EmpleadoRestController.class)
class PruebaTecnicaApplicationTests {


	@Autowired 
	private MockMvc mockMvc;
	

	@MockBean
	private EmpleadoServiceImplements empleadoService;
	
	/* @Test
	public void TestCrearEmpleado() throws Exception{
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1988);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		Date date = cal.getTime();
		
		Empleado empleado = new Empleado();
		
		empleado.setId((long) 5);
		empleado.setApellido("San Martin");
		empleado.setEmail("tavo@gmail.com");
		empleado.setNombre("Gustavo");
		empleado.setCreateAt(date);
		
		String inputInJson = this.mapToJson(empleado);
		String URI = "/api/empleados";
		Mockito.when(empleadoService.save(Mockito.any(Empleado.class)))
		.thenReturn(empleado);
		RequestBuilder requestBuilder  = MockMvcRequestBuilders.post(URI).accept(MediaType.APPLICATION_JSON)
				.content(inputInJson).contentType(MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = result.getResponse();
		String outputInJson= response.getContentAsString();
		assertThat(outputInJson).isEqualTo(inputInJson);
		assertEquals(HttpStatus.OK.value(), response.getStatus());
	}


	
	@Test
	public void testObtenerEmpleadoPorId() throws Exception{
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2019);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DAY_OF_MONTH, 10);
		Date date = cal.getTime();
		
		Empleado empleado = new Empleado();
		
		empleado.setId((long) 5);
		empleado.setApellido("San Martin");
		empleado.setEmail("paola@gmail.com");
		empleado.setNombre("Paola");
		empleado.setCreateAt(date);
		
		Mockito.when(empleadoService.findById(Mockito.anyLong()))
		.thenReturn(empleado);
		String uri = "/api/empleados/5";
		RequestBuilder requestBuilder  = MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		String expected= this.mapToJson(empleado);
		String outputInJson= result.getResponse().getContentAsString();
		assertThat(outputInJson).isEqualTo(expected);	
		
	}
	
	@Test
	public void testObtenerEmpleados() throws Exception{
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		cal.set(Calendar.DAY_OF_MONTH, 22);
		Date date = cal.getTime();
		
		Empleado empleado = new Empleado();
		
		empleado.setId((long) 7);
		empleado.setApellido("San Martin");
		empleado.setEmail("jorge@gmail.com");
		empleado.setNombre("jorge");
		empleado.setCreateAt(date);
		
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2019);
		cal2.set(Calendar.MONTH, Calendar.AUGUST);
		cal2.set(Calendar.DAY_OF_MONTH, 11);
		Date date2 = cal2.getTime();
		
		Empleado empleado2 = new Empleado();
		
		empleado2.setId((long) 9);
		empleado2.setApellido("Guerrero");
		empleado2.setEmail("guerrero@gmail.com");
		empleado2.setNombre("Matias");
		empleado2.setCreateAt(date2);
		
		List<Empleado> empleados = new ArrayList<>();
		empleados.add(empleado);
		empleados.add(empleado2);
		
		Mockito.when(empleadoService.findAll()).thenReturn(empleados);
		
		String URI = "/api/empleados";
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(URI)
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		String expectedJson = this.mapToJson(empleados);
		String outputInJson = result.getResponse().getContentAsString();
		assertThat(outputInJson).isEqualTo(expectedJson);
	}

	private String mapToJson(Object object) throws JsonProcessingException{
		ObjectMapper objectMapper = new ObjectMapper();
		 return objectMapper.writeValueAsString(object);
	}*/
}
