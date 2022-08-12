package week1.day2.assesment;

public class Calculator {

	public static void main(String[] args) {
		
		CalculatorMethods calc = new CalculatorMethods();
		int addition = calc.addition(10, 10, 20);
		float divide = calc.divide(10.0F, 3.1f);
		int subract = calc.subract(100, 25);
		double multiply = calc.multiply(10.0, 7.0);
		
		System.out.println("The Addition value is  "+addition);
		System.out.println("The divided value is  "+divide);
		System.out.println("The Subracted value is  "+subract);
		System.out.println("The Multiplied value is  "+multiply);
	}
	
	
}
