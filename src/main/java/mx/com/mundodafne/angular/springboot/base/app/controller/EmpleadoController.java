package mx.com.mundodafne.angular.springboot.base.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	//sirve para guardar el empleado
	@PostMapping("/empleados")
	public EmpleadoEntity guardarEmpleado(@RequestBody EmpleadoEntity empleadoEntity) {
		return service.guardarEmpleado(empleadoEntity);
	}
	
	@GetMapping("/empleados/{idEmpleado}")
	public ResponseEntity<EmpleadoEntity> obtenerEmpleadoPorId(@PathVariable Long idEmpleado){
		return null;
	}
}
