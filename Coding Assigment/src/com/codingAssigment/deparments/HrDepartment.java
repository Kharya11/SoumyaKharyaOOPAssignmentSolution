package com.codingAssigment.deparments;

//HrDepartment class is a child  for SuperDepartment class

public class HrDepartment extends SuperDepartment {

	//// Defining methods for HR Department

	public String departmentName() {
		return "Welcome to HR Department ";
	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD  ";
	}

	public String doActivity() {
		return "Team Lunch";
	}

}
