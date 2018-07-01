package net.my.be.model;

import lombok.Data;

import javax.inject.Named;

@Data
public class User {
	private Integer id;
	private String firstName;
	private String lastName;
}
