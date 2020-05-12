package org.bharath.problemsolving.qspidersjavaproblems;

public class LeapYearOrNot 
{
	public static void main(String[] args) 
	{
		int year =2008;
		
		boolean isLeapYear = false;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					isLeapYear=true;
				}else {
					isLeapYear= false;
				}
			}else {
				isLeapYear = true;
			}
		}else {
			isLeapYear = false;
		}
		
		
		if(isLeapYear) {
			System.out.println("The year "+year+" is a leap year");
		}else {
			System.out.println("The year "+year+" is not a leap year");
		}
		
	}
}
