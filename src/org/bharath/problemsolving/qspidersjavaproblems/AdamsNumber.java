package org.bharath.problemsolving.qspidersjavaproblems;

public class AdamsNumber 
{

	static int reverseNumber(int num)
	{
		String reversedNo = "";
		while(num>0)
		{
			reversedNo = reversedNo + num%10;
			num = num/10;
		}
		return Integer.parseInt(reversedNo);
	}
	
	static int squaredResult(int num)
	{
		return num*num;
	}
	
	public static void main(String[] args) 
	{
		int checkNum = 201;
		int reversedNo = reverseNumber(squaredResult(checkNum));
		int reversedSqaureNo = squaredResult(reverseNumber(checkNum));
		
		if(reversedNo == reversedSqaureNo) {
			System.out.println("The number "+checkNum+" is a adam's number ");
		}else {
			System.out.println("The number "+checkNum+" is not a adam's number ");
		}
	}

}
