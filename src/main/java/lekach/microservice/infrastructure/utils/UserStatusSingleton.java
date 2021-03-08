package lekach.microservice.infrastructure.utils;

import java.util.HashMap;
import java.util.Map;

public class UserStatusSingleton {

	private static UserStatusSingleton uniqueInstance;

	private Map<String, Integer> consts;

	private UserStatusSingleton() {
		this.consts = new HashMap<String, Integer>();
		this.consts.put("Success", 0);
		this.consts.put("ACTIVE", 1);
		this.consts.put("SUSPENDED", 2);
		this.consts.put("LOCKED", 3);
		this.consts.put("CANCELED", 4);
		this.consts.put("NOT_ACTIVE", 5);
		this.consts.put("Manager_Id_Not_Exists", 31);
		this.consts.put("User_Id_Not_Exists", 41);
		this.consts.put("Ip_Address_Access_Denied", 50);
		this.consts.put("Manager_And_User_Not_Declare", 60);
		this.consts.put("User_Status_SUSPENDED", 62);
		this.consts.put("User_Status_LOCKED ", 63);
		this.consts.put("User_Status_CANCELLED", 64);
		this.consts.put("User_Status_NOTACTIVE", 65);
		this.consts.put("Type_Of_Query_Not_Certified", 71);
	}

	public static synchronized UserStatusSingleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new UserStatusSingleton();
		}
		return uniqueInstance;
	}

	public Map<String, Integer> getConsts() {
		return this.consts;
	}

}
