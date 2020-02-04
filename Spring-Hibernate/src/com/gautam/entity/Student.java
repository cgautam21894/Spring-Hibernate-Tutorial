package com.gautam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "system-increment")
	@GenericGenerator(name="system-increment",strategy="increment")
	private Integer ID;

	@Column(name = "name")
	private String NAME;

	@Column(name = "email")
	private String EMAIL;

	@Column(name = "address")
	private String ADDRESS;

	@Column(name = "gender")
	private String GENDER;

	@Column(name = "hobbies")
	private String HOBBIES;

	@Column(name = "city")
	private String CITY;

	@Column(name = "dateofbirth")
	private String DATEOFBIRTH;

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getHOBBIES() {
		return HOBBIES;
	}

	public void setHOBBIES(String hOBBIES) {
		HOBBIES = hOBBIES;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public String getDATEOFBIRTH() {
		return DATEOFBIRTH;
	}

	public void setDATEOFBIRTH(String dATEOFBIRTH) {
		DATEOFBIRTH = dATEOFBIRTH;
	}

}
