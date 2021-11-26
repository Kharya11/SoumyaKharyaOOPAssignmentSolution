package com.codingAssigment.deparments;

//AdminDepartment class is a child  for SuperDepartment class

public class AdminDepartment extends SuperDepartment {

	// Defining methods for Admin Department

	public String departmentName() {
		return "Welcome to Admin Department ";
	}

	public String getTodaysWork() {
		return "Complete your documents submission.";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
}
