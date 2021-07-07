package com.test.lps;

import lombok.Data;

@Data
public class Address { 
	public int SequenceNo;
	public int Abodenumber;
	public String BuildingNo;
	public String BuildingName;
	public String Street;
	public String SubStreet;
	public String Town;
	public String District;
	public int StartMonth;
	public int StartYear;
	public String EndMonth;
	public String EndYear;
	public String PostCode;
	public String AddressType;
}
