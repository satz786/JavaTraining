package org.methodoverloading;

public class Student {

	
	public void getstudentinfo(int id)
	{
		System.out.println("Student id is "+id);
	}
	
	public void getstudentinfo (int id , String name)
	{
		System.out.println("Student id is   "+id+"   Student Name is  "+name);
	}
	
	public void getstudentinfo(String email, long mobilenumber)
	{
		System.out.println("Student email is   "+email+"   Student mobilenumber is  "+mobilenumber);
	}
	
	public static void main(String[] args) {
		Student sathish = new Student();
		
		sathish.getstudentinfo(416);
		sathish.getstudentinfo(416, "Sathish");
		sathish.getstudentinfo("Sathish@gmail.com", 805688888);
		
	}
	
	
	
}
