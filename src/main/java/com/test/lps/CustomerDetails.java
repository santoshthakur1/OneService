package com.test.lps;

import lombok.Data;

@Data
public class CustomerDetails { 
	public PersonalDetails PersonalDetails;
	public Address Address;
	public String RoleType;
	public String identityValidationId;
}