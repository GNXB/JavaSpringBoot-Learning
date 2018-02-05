package com.arms.app.user;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class UserEditForm {
	
	@NotNull
	private Integer userId;
	
	@NotEmpty
	private String name;
	
	private String email;
	
	@NotEmpty
	private String password;
}
