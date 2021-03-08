package lekach.microservice.interfaces.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lekach.microservice.application.internal.services.RedHatService;
import lekach.microservice.infrastructure.utils.UserStatusSingleton;
import lekach.microservice.interfaces.rest.dto.HeaderData;

@RestController 
@RequestMapping("/lekach")
public class RedHatController {

	@Value("${api.version}") 
	private String version;
	
	@Autowired
	private RedHatService checkAuthenticationService;
	
	// singelton of constans to population check.
	UserStatusSingleton userStatusSingelton = UserStatusSingleton.getInstance();
	
	@GetMapping("/checkAuthentication")
	@ResponseBody
	public ResponseEntity<?> CheckAuthenticationByHeaderData(@RequestBody HeaderData headerData) {

			return checkAuthenticationService.checkAuthentication(headerData, userStatusSingelton)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.badRequest().build());
	}
	
}



