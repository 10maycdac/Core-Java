package com.app.core;

import java.util.Date;

public class Student {
	private String prn, name, email, marks;
	private Date dob;
	private Course course;

	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", email=" + email + ", marks=" + marks + ", dob=" + dob
				+ "]";
	}

	public Student(String prn, String name, String email, String marks, Date dob, Course course) {
		super();
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.dob = dob;
		this.course = course;
	}

	public Student(String searchPRN) {
		// this.prn = searchPRN;
		this(searchPRN, null, null, null, null, null);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student)
			// return this.prn == ((Student)obj).prn;
			return prn.equalsIgnoreCase(((Student) obj).prn);
		return false;
	}
}
