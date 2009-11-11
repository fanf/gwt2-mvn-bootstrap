package org.test.data;

import org.joda.time.DateTime;

public class User {

	private String login;
	
	private DateTime birthDate;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public DateTime getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(DateTime birthDate) {
		this.birthDate = birthDate;
	}
	
	

}
