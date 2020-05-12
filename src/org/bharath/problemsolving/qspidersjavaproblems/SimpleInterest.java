package org.bharath.problemsolving.qspidersjavaproblems;

public class SimpleInterest {

	public static void main(String[] args) 
	{
		double principle = 20000.00;
		int noOfYears = 1;
		double rateOfInterest = 12.8;
		
		double simpleInterest = (principle * noOfYears * rateOfInterest)/100;
		
		System.out.println("The simple Interest for principle "+principle+" for "+noOfYears+" year with "+rateOfInterest
				+ " rate of interest  is "+simpleInterest);
	}

}
