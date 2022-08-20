package org.system;

public class Desktop extends Computer{

	public void desktopsize()
	{
		System.out.println("Monitor Size is 21 inch");
	}
	
	
	public static void main(String[] args) {
		
		Desktop dell = new Desktop();
		dell.computermodel();
		dell.desktopsize();
		
		
		
	}
	
	
}
