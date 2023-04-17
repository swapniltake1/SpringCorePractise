package com.springcore.autowiring;

public class Address {
          private String street;
          private String city;
          private String Dist;
          private String state;
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getDist() {
			return Dist;
		}
		public void setDist(String dist) {
			Dist = dist;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		@Override
		public String toString() {
			return "Address [street=" + street + ", city=" + city + ", Dist=" + Dist + ", state=" + state + "]";
		}
		
          
		
}
