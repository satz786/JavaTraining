package week1.day2.assesment;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class PrintOddNumber {

	
	public static void main(String[] args) {
		
		for(int i=51; i<=77 ; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		
		
		
	}
	
	
	
	
}
