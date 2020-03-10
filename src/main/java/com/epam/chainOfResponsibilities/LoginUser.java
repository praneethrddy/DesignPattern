package com.epam.chainOfResponsibilities;

public class LoginUser {
	private final String Name_User;
	private final String Name_Password;

	public LoginUser(final String Name_User, final String Name_Password) {
		this.Name_User = Name_User;
		this.Name_Password = Name_Password;
		LoginUser(Name_User, Name_Password);
	}

	private void LoginUser(final String Name_User2, final String userPass2) {
		validateCredentials(Name_User, Name_Password);
	}

	private void validateCredentials(final String Name_User, final String Name_Password) {

		if (Name_User.isEmpty())
			System.out.println("Please enter Name_User\n");

		final UserDb user_db = new UserDb();

		if (user_db.userExists(Name_User)) {
			validatePassword(Name_User, Name_Password);
		} else
			System.out.println("User ID not found!");
	}

	private void validatePassword(final String Name_User, final String password) {
		final PasswordValidator passwordValidator = 
				new PasswordValidator();
		if(passwordValidator.isMappedTo(Name_User, password))
			System.out.println("LoginUser succesfull! to "+Name_User);
		else
				System.out.println("Invalid password!");
	}
}
