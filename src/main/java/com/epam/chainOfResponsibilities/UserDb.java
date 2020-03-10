package com.epam.chainOfResponsibilities;

import java.util.HashMap;

public class UserDb {
	protected HashMap<String,String> userDb;
	public UserDb(){
		userDb = new HashMap<String,String>();
		userDb.put("prakash","prakash123");
		userDb.put("abcd","abcd978");
	}
	public Boolean SignWithEmailAndPassword(String uname, String upass) {
		if( upass == (userDb.get(uname)))
			return true;
		return false;
	}
	public Boolean userExists(String user) {
		return userDb.containsKey(user);
	}
}
