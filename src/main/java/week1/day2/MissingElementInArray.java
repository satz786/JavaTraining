package week1.day2;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int j = arr.length;
		Arrays.sort(arr);
		
		for(int i=0; i <=arr.length-1 ; i++)
		{
			int b = i+1;
			//System.out.println(arr[i]);
			//System.out.println(b);
			if(arr[i]!=b)
			{
				System.out.println(b);
				break;
			}
		
			
			
		}
		
		
		

	}

}
