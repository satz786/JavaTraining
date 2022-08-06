package week1.day1;

public class TwoWheeler {

	int noOfWheels = 4;
	short noOfMirrors = 4;
	long chassisNumber = 545545458568L;
	boolean isPunctured = false;
	String bikeName = "FZS";
	double runningKM = 23500.50;
	

public static void main(String[] args) {
	
TwoWheeler fz = new TwoWheeler();

System.out.println(fz.bikeName);
System.out.println(fz.noOfWheels);
System.out.println(fz.chassisNumber);
System.out.println(fz.noOfMirrors);
System.out.println(fz.runningKM);
System.out.println(fz.isPunctured);


} 
}
