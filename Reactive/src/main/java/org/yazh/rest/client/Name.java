package org.yazh.rest.client;

public class Name {
  private String fName;
  private String lName;
  
  public String getFName(){
	return fName;
  }
  
  public void setFName(String fName){
	this.fName = fName;
  }
  
  public String getLName(){
	return lName;
  }
  
  public void setLName(String lName){
	this.lName = lName;
  }
  
  public void toUpperCase() {
	fName = fName.toUpperCase();
	lName = lName.toUpperCase();
	
  }
  
  @Override
	public String toString() {
		return fName + ',' + lName;
	}
  
  

}
