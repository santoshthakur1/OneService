package com.test.lps;

import lombok.Data;

@Data
public class PersonalDetails { 
	public String Title;
	public String Forename;
	public String MiddleName;
	public String Surname;
	public String FormerSurname;
	public int DOBDay;
	public int DOBMonth;
	public int DOBYear;
	public String Email;
	public String ResidenceType;
}