package com.test.lps;

import lombok.Data;

@Data
public class IdentityCheckRequest { 
	public String Header;
	public String IDCheckXML;
	public CustomerDetails CustomerDetails;
	public String ProcessIDCheckRequestType;
	public String BespokeDetails;
}