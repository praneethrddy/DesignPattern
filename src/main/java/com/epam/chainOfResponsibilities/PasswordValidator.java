package com.epam.chainOfResponsibilities;

public class PasswordValidator {
	private UserDb user_db;
	
	public PasswordValidator() {
		this.user_db = new UserDb();
	}
	
	public Boolean isMappedTo(String Name_User, String password) {
			return this.user_db.SignWithEmailAndPassword(Name_User, password);
	}
}
