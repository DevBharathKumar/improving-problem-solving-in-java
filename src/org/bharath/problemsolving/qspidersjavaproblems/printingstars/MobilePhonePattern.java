package org.bharath.problemsolving.qspidersjavaproblems.printingstars;

public class MobilePhonePattern {

	public static void main(String[] args) 
	{
		int k = 1;
		
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==1||j==1||i==5||j==5||i==9)
				{
					System.out.print("*");
				}else if(i==6||i==7||i==8)
				{
					System.out.print(k++);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
