package com.management.department;

public class HRDepartment extends SuperClass{
	public String departmentName(){
		return "HR department";
	}
	
	public String getTodaysWork(){
		return "Fill today’s timesheet and mark your attendance";
	}
	
	public String getWorkDeadline(){
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "Team lunch";
	}


}
