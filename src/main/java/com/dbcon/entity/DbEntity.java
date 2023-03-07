package com.dbcon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dbcon")
public class DbEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // automated by DB
	private long id;

	@Column(nullable = false, unique = true, length = 100) // primary key
	private String email;

	@Column(nullable = false, length = 50)
	private String firstname;

	@Column(nullable = false, length = 50)
	private String lastname;

	@Column(nullable = false, length = 50)
	private String phonenumber;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "User [fname=" + firstname + ", lname=" + lastname + ", email=" + email + ", phone number=" + phonenumber
				+ "]";
	}

}
