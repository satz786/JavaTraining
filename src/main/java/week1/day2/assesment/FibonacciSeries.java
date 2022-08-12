package week1.day2.assesment;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int firstnum = 0;
		int secondnum = 1;
		int sum = 0;
		
		System.out.print(firstnum+" "+secondnum);
		int i = 0;
		while(i<=8)
		{
			sum = firstnum + secondnum;
			System.out.println(" "+sum);
			
			firstnum = secondnum;
			secondnum = sum;
			i++;
		}
	
	}	
}
