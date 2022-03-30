package Prac;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
	
	int num = 29;
	int count=0;
	if (num>1)
	{
		for (int i =1; i<=num;i++)
		{
			if (num%i==0)
			count++;
		}
		if (count==2)
		{
			System.out.println("number is PRIME");
			System.out.println(count);
		}
		else
		{
			System.out.println("number is NOT PRIME");
		}
	}
	else 
	{
		System.out.println("Natural no. or negative num");
	}
	}			

}
