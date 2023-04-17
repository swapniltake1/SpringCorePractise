package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Institute {
    
	private String collagename;
	private List<String> staffname;
	private Map<String, Integer> feesstrucher;
	private Properties properties;
	
	public String getCollagename() {
		return collagename;
	}
	public void setCollagename(String collagename) {
		this.collagename = collagename;
	}
	public List<String> getStaffname() {
		return staffname;
	}
	public void setStaffname(List<String> staffname) {
		this.staffname = staffname;
	}
	public Map<String, Integer> getFeesstrucher() {
		return feesstrucher;
	}
	public void setFeesstrucher(Map<String, Integer> feesstrucher) {
		this.feesstrucher = feesstrucher;
	}
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Institute() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Institute(String collagename, List<String> staffname, Map<String, Integer> feesstrucher,
			Properties properties) {
		super();
		this.collagename = collagename;
		this.staffname = staffname;
		this.feesstrucher = feesstrucher;
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Institute [collagename=" + collagename + ", staffname=" + staffname + ", feesstrucher=" + feesstrucher
				+ ", properties=" + properties + "]";
	}
	
	
	
	
}
