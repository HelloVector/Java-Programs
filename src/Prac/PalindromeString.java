package Prac;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		String org = "kumar";
		String rev ="";
		for (int i =org.length()-1; i>=0;i--)
		{
			rev = rev + org.charAt(i);
		}
		System.out.println(rev);
		if (rev==org)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
