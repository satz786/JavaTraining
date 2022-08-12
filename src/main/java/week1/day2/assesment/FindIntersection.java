package week1.day2.assesment;

import org.checkerframework.checker.units.qual.Length;

public class FindIntersection {

	public static void main(String[] args) {
		
		int i[] = {3,2,11,4,6,7};
		int j[] = {1,2,8,4,9,7};
		
		for(int a = 0; a<=j.length-1; a++)
		{
			for(int b=0; b<= j.length-1 ; b++)
			{
				if(i[a]==j[b])
				{
					System.out.println("Both are same "+i[a]);
				}
			}
		}
	}
	
	
	
}
