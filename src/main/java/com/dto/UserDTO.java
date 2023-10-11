package com.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

	private int id;
	private String username;
	private String password;
	private String email;
	private String role;

	private String name;

	private Long number;
	private String address;

}
