package org.bharath.problemsolving.qspidersjavaproblems;

public class AmstrongNumber 
{
	static int multipledResult(int number,int times)
	{
		int result = 1;
		for(int i=0;i<times;i++) {
			result = result * number;
		}
		return result;
	}
	
	
	public static void main(String[] args) 
	{
		int checkNum = 54748;
		int num = checkNum;
		int sum = 0;
		
		int times = String.valueOf(checkNum).length();
		
		while(num>0)
		{
			int n = num%10;
			sum = sum + multipledResult(n,times);
			num = num/10;
		}
		
		if(sum==checkNum) {
			System.out.println(checkNum+" is an amstrong number ");
		}else {
			System.out.println(checkNum+" is not an amstrong number ");
		}
		
	}
}
