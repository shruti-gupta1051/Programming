package Programs;

import java.util.*;
class Pattern
{
	public static void main(String args[])
	{
		int i,j,space=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number of lines");
		int num = sc.nextInt();
		for(i=0;i<=num;i++)
		{
				for(space=num;space>i;space--)
				{
					System.out.print(" ");
				}
				for(j=0;j<=i;j++)
		        {
				 System.out.print("*");
				}
			System.out.println();
		}
	}
}