package mx.com.mundodafne.angular.springboot.base.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.mundodafne.angular.springboot.base.app.entity.EmpleadoEntity;

@Repository
public interface IEmpleadoRepository extends CrudRepository<EmpleadoEntity, Long>{

}
