package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "student")
public class Student {

	@Id
	@Column(name = "id_student")
	private Integer cStudent;

	@Column(name = "s_name")
	private String sName;

	@Column(name = "s_lname")
	private String lName;

	@Column(name = "s_age")
	private Integer sAge;

	@Column(name = "b_active")
	private Boolean bActivo;

	public Student() {
	}

	public Student(Integer cStudent, String sName, String lName, Integer sAge, Boolean bActivo) {
		this.cStudent = cStudent;
		this.sName = sName;
		this.lName = lName;
		this.sAge = sAge;
		this.bActivo = bActivo;
	}

	public String getActivoDelegate() {
		if (this.bActivo == null) {
			return "";
		} else {
			return bActivo == true ? "Activo" : "Inactivo";
		}
	}

	public Integer getcStudent() {
		return cStudent;
	}

	public void setcStudent(Integer cStudent) {
		this.cStudent = cStudent;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Integer getsAge() {
		return sAge;
	}

	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}

	public Boolean getbActivo() {
		return bActivo;
	}

	public void setbActivo(Boolean bActivo) {
		this.bActivo = bActivo;
	}

}
