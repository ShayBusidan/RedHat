package lekach.microservice.application.internal.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import lekach.microservice.infrastructure.utils.UserStatusSingleton;
import lekach.microservice.interfaces.rest.dto.HeaderData;
import lekach.microservice.interfaces.rest.transform.RedHatResponse;

@Service
public class RedHatService {

	// Optional - isPresent() will return true and get() will return the value.
	public Optional<RedHatResponse> checkAuthentication(HeaderData headerData, UserStatusSingleton userStatusSingleton) {
		return null;

	}

	

	

}
