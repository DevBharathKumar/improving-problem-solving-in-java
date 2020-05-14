package org.bharath.problemsolving.qspidersjavaproblems;

public class FindingTheEvenAndOddSum {

	public static void main(String[] args) 
	{
		int rangeFrom = 1;
		int rangeTo = 10;
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=rangeFrom; i<=rangeTo; i++)
		{
			if(i%2==0)
			{
				evenSum = evenSum +i;
			}else {
				oddSum = oddSum +i;
			}
		}
		
		System.out.println("The sum of even numbers is "+evenSum);
		System.out.println("The sum of odd numbers is "+oddSum);
	}

}
