package com.test.lps;

import lombok.Data;

@Data
public class LPSData { 
	public int ProposalNumber;
	public int ProposalVersion;
	public int SalesPartnerProposal;
	public int SalesPartnerVersion;
	public int INPNumber;
	public int OperatingCompany;
	public String EnvironmentAccess;
	public String CountryCode;
	public double FromLPSTimeStamp;
	public String ToLPSTimeStamp;
}