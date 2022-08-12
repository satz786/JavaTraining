package week1.day2.assesment;

public class CalculatorMethods {

	
	//(a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
	
	public int addition(int num1 , int num2, int num3)
	{
		int c = num1+num2+num3;
		return c;
	}
	
	
	
	//(b) sub(int num1, int num2), it should return subtraction of of num1-num2
	public int subract(int a, int b)
	{
		int c = a-b;
		return c;
	}
	
	//(c) mul(double num1, double num2), it should return product of num1 * num2
	public double multiply(double num1, double num2)
	{
		double c = num1*num2;
		return c;
		
	}
	
	
	
	//(d) divide(float num1, float num2), it should return division of num1 / num2
	
	public float divide(float num1, float num2)
	{
		float c = num1/num2;
		return c;
	}
	
	
	
}
