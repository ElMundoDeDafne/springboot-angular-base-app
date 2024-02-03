package mx.com.mundodafne.angular.springboot.base.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import mx.com.mundodafne.angular.springboot.base.app.dao.IEmpleadoRepository;
import mx.com.mundodafne.angular.springboot.base.app.entity.EmpleadoEntity;
import mx.com.mundodafne.angular.springboot.base.app.exception.ResourceNotFoundException;

@Service
public class EmpleadoService {
	
	@Autowired
	private IEmpleadoRepository repo;
	
	public List<EmpleadoEntity> listarTodosLosEmpleados(){
		return (List<EmpleadoEntity>) repo.findAll();
	}
	
	public EmpleadoEntity guardarEmpleado(EmpleadoEntity empleadoEntity) {
		return repo.save(empleadoEntity);
	}
	
	public ResponseEntity<EmpleadoEntity> obtenerEmpleadoPorId(Long id) {
		EmpleadoEntity entity = repo.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Empleado con id "+id+" no existe"));
		return ResponseEntity.ok(entity);
	}
}
