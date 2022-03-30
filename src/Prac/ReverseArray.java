package Prac;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int [] a = {9,10,3,4,5,6,7};
		int len = a.length;
		int max = a[0];
		int min = a[0];
		int secmin=a[0];
		for (int i =len-1;i>=0;i--)
		{
			if (a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		for (int i =len-1;i>=0;i--)
		{
			if (a[i]<secmin && a[i]!=min)
			{
				secmin=a[i];
			}
		}
		System.out.println(secmin);
	}

}

