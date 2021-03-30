package com.nt.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UserDomain {
	
	
	private String name;
	private String pws;
	private String email;
	private long phn;
	@Override
	public String toString() {
		return "UserDomain [name=" + name + ", pws=" + pws + ", email=" + email + ", phn=" + phn + "]";
	}

}
