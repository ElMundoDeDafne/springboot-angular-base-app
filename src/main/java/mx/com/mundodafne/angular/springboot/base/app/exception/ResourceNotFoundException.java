package mx.com.mundodafne.angular.springboot.base.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5437290200200395855L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
