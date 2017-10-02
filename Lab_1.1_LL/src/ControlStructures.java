//Author: Lily Li
//Name: Lab 1.1
//Date Created: 9/18/2017
//Date Completed: 9/27/2017

public class ControlStructures {
	public static void main(String[] args)
	{
		fooBarBaz();
		primePrinter();
	}
	
	public static void fooBarBaz()
	{   
		System.out.println("fooBarBaz");
		
		int[] modBy = new int[] {3,7,10};
		int size = modBy.length;
		String[] toBePrinted = {"foo","Bar","Baz"};
		
		for(int counter = 1; counter <= 500; counter++)
		{	
			System.out.print("\n" + counter+ (": "));
			for(int i = 0; i < size; i++)
			{
				int modResult = counter % modBy[i];
				if(modResult == 0)
				{	
					System.out.print(toBePrinted[i]);
				}
			}
		}
	}
	
	 public static void primePrinter() 
	{
		System.out.println("\n\nPrime Printer");
		
		int count = 1;
		
		while(count<=50)
		{
			for(int num = 2; num > 1; num++)
			{
				if(isPrime(num))
				{
					System.out.print("\n#" + count + " " + num);
					count++;
					if(count == 51)
					{
						num = 0;
					}
				}
			}
		}
	}

	public static boolean isPrime(int num)
	{
		int limit = num / 2;
		
		if((num == 2) || (num == 3))
		{
			return true;
		}
		else 
		{
			for(int factors = 2; factors <= limit; factors++)
			{
				if((num % factors) == 0)
				{
					return false;
				}
			}
			return true;
		}
	}
}
