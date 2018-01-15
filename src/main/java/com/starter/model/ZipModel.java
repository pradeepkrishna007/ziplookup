package com.starter.model;

import java.io.Serializable;

/**
 * @author PRADEEP KUMAR
 *
 */
public class ZipModel implements Serializable{

	private String zipcode;
	private String city;
	private String state;
	
	
	
	public ZipModel(String zipcode, String city, String state) {
		super();
		this.zipcode = zipcode;
		this.city = city;
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return zipcode + ":" + city + ":" + state;
	}
	
	
}
