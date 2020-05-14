package org.bharath.problemsolving.qspidersjavaproblems;

public class FindingEvenNumbersWithinARange 
{
	public static void main(String[] args)
	{
		int rangeFrom = 1;
		int rangeTo = 10;
		
		System.out.println("The list of even numbers are given below ");
		
		for(int i=rangeFrom; i<=rangeTo; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
