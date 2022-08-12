package week1.day2.assesment;

public class Car {

	public void printCarBrand()
	{
		System.out.println("BMW");
	}
	
	public String getCarColor()
	{
		String color = "Red";
		return color;
	}
	
	public int getCarEngineNumber()
	{
		int enginenumber = 33342342;
		return enginenumber;
	}
	
	public int subractnumber(int a, int b)
	{
		int c=a-b;
		return c;
		
	}
	
	public int multipleNumber()
	{
		int a = 10;
		int b = 20;
		int c = a*b;
		return c;
	}
	
	public double divideNumber(int a, int b)
	{
		int c = a/b;
		return c;
	}
	
	
	public static void main(String[] args) {
		
		Car Q6 = new Car();
		Q6.printCarBrand();
		System.out.println(Q6.getCarColor());
		System.out.println(Q6.getCarEngineNumber());
		
		System.out.println(Q6.subractnumber(10, 7));
		System.out.println(Q6.multipleNumber());
		System.out.println(Q6.divideNumber(7, 2));
		
	}
	
}
