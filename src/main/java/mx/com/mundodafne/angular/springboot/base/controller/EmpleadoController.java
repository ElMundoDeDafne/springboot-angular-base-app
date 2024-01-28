package mx.com.mundodafne.angular.springboot.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.angular.springboot.base.entity.EmpleadoEntity;
import mx.com.mundodafne.angular.springboot.base.service.EmpleadoService;

@RestController
@RequestMapping("/api/v1")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService service;
	
	@GetMapping("/empleados")
	public List<EmpleadoEntity> listarTodosLosEmpleados(){
		return service.listarTodosLosEmpleados();
	}
}
