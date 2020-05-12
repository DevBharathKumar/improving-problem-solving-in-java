package org.bharath.problemsolving.qspidersjavaproblems;

public class SwappingTheVariables 
{
	public static void main(String[] args) {
		
		System.out.println("*************");
		
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;
		
		n3 = n1;
		n2 = n3;
		n1 = n2;
		
		System.out.println("n1 value is "+n1);
		System.out.println("n2 value is "+n2);
		System.out.println("n3 value is "+n3);
		
		System.out.println("*************");
		
	}
}
