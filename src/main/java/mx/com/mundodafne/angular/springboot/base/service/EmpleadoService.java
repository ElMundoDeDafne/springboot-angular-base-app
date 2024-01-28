package mx.com.mundodafne.angular.springboot.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.mundodafne.angular.springboot.base.dao.IEmpleadoRepository;
import mx.com.mundodafne.angular.springboot.base.entity.EmpleadoEntity;

@Service
public class EmpleadoService {
	
	@Autowired
	private IEmpleadoRepository repo;
	
	public List<EmpleadoEntity> listarTodosLosEmpleados(){
		return (List<EmpleadoEntity>) repo.findAll();
	}
}
