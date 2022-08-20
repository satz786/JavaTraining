package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentname()
	{
		System.out.println("StudentName :  Sathish");
	}
	
	public void studentid()
	{
		System.out.println("Student -ID : 811");
	}
	
	
	
	public static void main(String[] args) {
		
		Student sathish = new Student();
		sathish.collegecode();
		sathish.CollegeName();
		sathish.collegeRank();
		sathish.departmentname();
		sathish.studentid();
	}
	
	
	
}
