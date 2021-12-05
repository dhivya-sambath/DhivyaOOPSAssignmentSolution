package com.management.main;
import com.management.department.*;

public class Driver {
    public static void main(String args[]) {
    	AdminDepartment admin = new AdminDepartment();
    	HRDepartment hr = new HRDepartment();
    	TechDepartment tech = new TechDepartment();
    	
    	//admin department
    	System.out.println("Welcome to "+ admin.departmentName());
    	System.out.println(admin.getTodaysWork());
    	System.out.println(admin.getWorkDeadline());
    	System.out.println(admin.isTodayAHoliday());
    	
    	//HR Department
    	System.out.println("\n"+"Welcome to "+ hr.departmentName());
    	System.out.println(hr.doActivity());
    	System.out.println(hr.getTodaysWork());
    	System.out.println(hr.getWorkDeadline());
    	System.out.println(hr.isTodayAHoliday());
    	
    	//Tech Department
    	System.out.println("\n"+ "Welcome to "+ tech.departmentName());
    	System.out.println(tech.getTechStackInformation());
    	System.out.println(tech.getTodaysWork());
    	System.out.println(tech.getWorkDeadline());
    	System.out.println(tech.isTodayAHoliday());

    }
}
