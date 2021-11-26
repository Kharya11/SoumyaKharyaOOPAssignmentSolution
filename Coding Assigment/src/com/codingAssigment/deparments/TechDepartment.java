package com.codingAssigment.deparments;

//TechDepartment class is a child  for SuperDepartment class

public class TechDepartment extends SuperDepartment {

	// Defining methods for Tech Department

	public String departmentName() {
		return "Welcome to Tech Department ";
	}

	public String getTodaysWork() {
		return "Complete coding of module 1";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String getTechStackInformation() {
		return "Core Java";

	}
}
