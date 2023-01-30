package com.springcore.standalone.collections;

import java.util.List;

public class Person {
   
	 private String nameString;
	 private String addressString;
	 private List<String> friendStrings;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getAddressString() {
		return addressString;
	}
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}
	public List<String> getFriendStrings() {
		return friendStrings;
	}
	public void setFriendStrings(List<String> friendStrings) {
		this.friendStrings = friendStrings;
	}
	
	@Override
	public String toString() {
		return "Person [nameString=" + nameString + ", addressString=" + addressString + ", friendStrings="
				+ friendStrings + "]";
	}
	 
	 
}
