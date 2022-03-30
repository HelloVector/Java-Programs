package Prac;

public class NosOfPrimeNumber 
{
	public static void main(String[] args)
	{
		int range = 100;
		for(int i=1;i<=range;i++)
		{
			boolean flag = true;
			if (i>1)
			{
				for (int j = 2 ; j<i;j++)
				{
					if (i%j==0)
					{
						flag=false;
					}
				}
			}
			else
			{
				flag = false;
			}
			if(flag)
			{
				System.out.print(i+" ");
			}
		}
		
	}

}
