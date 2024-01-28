package mx.com.mundodafne.angular.springboot.base.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.mundodafne.angular.springboot.base.app.entity.EmpleadoEntity;
import mx.com.mundodafne.angular.springboot.base.app.service.EmpleadoService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200/")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService service;
	
	@GetMapping("/empleados")
	public List<EmpleadoEntity> listarTodosLosEmpleados(){
		return service.listarTodosLosEmpleados();
	}
}
