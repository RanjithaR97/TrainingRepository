package com.beans;

public class PetHelpLineService 
{
private String helpLineNumber;
private PetHelpLineService()
{
this.helpLineNumber="9988544567";
}


public static PetHelpLineService service=new PetHelpLineService();
public static PetHelpLineService getDefaultInstance()
{
return service;
}

public String getHelpLineNumber() {
return helpLineNumber;
}
public void setHelpLineNumber(String helpLineNumber) {
this.helpLineNumber = helpLineNumber;
	
}
}
