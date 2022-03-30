package Prac;

public class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int num = 1253;
		int rev = 0;
		while (num > 0)
		{
			rev = rev*10 + num%10;
			num=num/10;
		}
		System.out.println(rev);
		if (rev==num)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("not a palindrome number");
		}
	}

}
