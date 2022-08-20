package org.methodoverriding;

public class Axisbank extends BankInfo{

	public void deposit()
	{
		System.out.println("Deposit can be done in Axis bank");

	}
	
	public static void main(String[] args) {
		Axisbank account1 = new Axisbank();
		account1.deposit();
	}
	
	
}
