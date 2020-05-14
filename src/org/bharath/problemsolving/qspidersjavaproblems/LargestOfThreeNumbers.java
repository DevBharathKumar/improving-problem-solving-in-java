package org.bharath.problemsolving.qspidersjavaproblems;

public class LargestOfThreeNumbers 
{
	
	static int findLargestNumber(int [] numbers)
	{
		int largest = 0;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i] > largest)
			{
				largest = numbers[i];
			}
		}
		return largest;
	}
	
	static int i=0;
	static int largest = 0;
	
	static int findLargestNumberUsingRecursion(int [] numbers)
	{
		if(i<numbers.length) {
			
			if(numbers[i] > largest) {
				largest = numbers[i];
			}
			
			i++;
			findLargestNumberUsingRecursion(numbers);
		}
		return largest;
	}
	
	//geeksforgeeks recursion example 
	//https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
	
	static int findLargestNumberUsingRecursionMethod2(int [] elements,int number)
	{
		if(number == 1) {
			return elements[0];
		}
		
		return Math.max(elements[number -1], findLargestNumberUsingRecursionMethod2(elements, number-1));
	}
	

	public static void main(String[] args) 
	{
		//Using loops 
		System.out.println("The largest number is "+findLargestNumber(new int [] {9,-98,-9}));
		
		System.out.println("*********** Without usig loops ************");
		
		//Without using loops
		int a = 10;
		int b = 30;
		int c = 20;
		
		if(a>b && a>c) {
			System.out.println("The laragest number is "+a);
		}else if(b>a && b>c) {
			System.out.println("The laragest number is "+b);
		}else if(c>a && c>b) {
			System.out.println("The laragest number is "+c);
		}
		
		System.out.println("*********** Using recursion ************");
		System.out.println("The largest number is "+findLargestNumberUsingRecursion(new int [] {1,2,4}));
		
		System.out.println("*********** Geeks for geeks method for using recursion ************");
		int [] elements = new int [] {1,2,9};
		System.out.println("The largest number is "+findLargestNumberUsingRecursionMethod2(elements,elements.length));
	}
}
