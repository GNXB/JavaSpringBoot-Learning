package com.arms.app.user;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class UserAddForm {
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String password;
	
}
