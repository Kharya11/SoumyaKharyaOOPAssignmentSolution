package com.codingAssigment.main;

import com.codingAssigment.deparments.*;

//Main class

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Created object for all Departments

		AdminDepartment obj1 = new AdminDepartment();
		HrDepartment obj2 	 = new HrDepartment();
		TechDepartment obj3  = new TechDepartment();

		// Invoking methods using objects

		System.out.println("Welcome to " +obj1.departmentName());
		System.out.println(obj1.getTodaysWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());

		System.out.println("\n*************************\n");

		System.out.println("Welcome to "obj2.departmentName());
		System.out.println(obj2.doActivity());
		System.out.println(obj2.getTodaysWork());
		System.out.println(obj2.getWorkDeadline());
		System.out.println(obj2.isTodayAHoliday());

		System.out.println("\n*************************\n");

		System.out.println("Welcome to "obj3.departmentName());
		System.out.println(obj3.getTodaysWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInformation());
		System.out.println(obj3.isTodayAHoliday());

	}
}
