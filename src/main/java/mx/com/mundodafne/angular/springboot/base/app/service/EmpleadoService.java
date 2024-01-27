package mx.com.mundodafne.angular.springboot.base.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.mundodafne.angular.springboot.base.app.entity.EmpleadoEntity;
import mx.com.mundodafne.angular.springboot.base.dao.EmpleadoRepository;

@Service
public class EmpleadoService {
	@Autowired
	private EmpleadoRepository repo;
	
	public List<EmpleadoEntity> listarTodosLosEmpleados(){
		return (List<EmpleadoEntity>) repo.findAll();
	}
}
