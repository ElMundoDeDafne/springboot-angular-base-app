package mx.com.mundodafne.angular.springboot.base.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class PruebaController {
	@GetMapping("/prueba")
	public String prueba() {
		return "hola";
	}
}
