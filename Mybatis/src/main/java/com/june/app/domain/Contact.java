package com.june.app.domain;

import java.io.Serializable;

public class Contact extends Page implements Serializable{

	private static final long serialVersionUID = 8751282105532159742L;
	
	private int contact_id;
	private String contact_email;
	private String contact_name;
	private String contact_phone;
	
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public String getContact_email() {
		return contact_email;
	}
	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}
	public String getContact_name() {
		return contact_name;
	}
	public void setContact_name(String contact_name) {
		this.contact_name = contact_name;
	}
	public String getContact_phone() {
		return contact_phone;
	}
	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
}
