package net.be_my.model;

import lombok.Data;

@Data
public class User {
	private Integer id;
	private String email;
	private String password;
	private Integer birthYear;
	private Integer birthMonth;
	private Integer birthDay;
	private String firstName;
	private String lastName;
	private String photo;
	private Boolean sex;
}
