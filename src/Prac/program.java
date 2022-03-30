package Prac;

import org.testng.annotations.Test;

public class program 
{
	@Test
	public void array()
	{
		int mark [] = {89,9,34,67,20};
		int num = 21;
		boolean isInArray = false;
		for (int element:mark)
		{
			if (num==element)
			{
				isInArray=true;
				break;
			}
		}
		if (isInArray)
		{
			System.out.println("element present");
		}
		else
		{
			System.out.println("element not present");
		}
	}
}
