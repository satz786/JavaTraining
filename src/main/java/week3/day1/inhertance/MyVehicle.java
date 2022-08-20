package week3.day1.inhertance;

public class MyVehicle {
	
	public static void main(String[] args) {
		Audi mycar = new Audi();
		mycar.brake();
		mycar.horn();
		
		Bmw mycar1 = new Bmw();
		mycar1.brake();
		mycar1.horn();
		
		Auto myauto = new Auto();
		myauto.brake();
		myauto.horn();
		
	}

}
