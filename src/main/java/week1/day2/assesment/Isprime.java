package week1.day2.assesment;

public class Isprime {

	
		public Boolean checkprime(int a)
		{
		
			 if(a%2==0)
			{
				return false;
			}
			else
			{
				
				return true;
			}
			
		
		}
	
		
		public static void main(String[] args) {
			Isprime obj = new Isprime();
			obj.checkprime(4);
		}
		
		
}
