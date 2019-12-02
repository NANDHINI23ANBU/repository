package PROGRAM;

import java.util.*;

public class Rangedivisible_5 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n");
	int n=sc.nextInt();
	System.out.println("enter m");
	int m=sc.nextInt();
	for(int i=n;i<=m;i++)
	{
		
		if(i%5==0) 
		{
			System.out.println(i);
			
		}
	}
		
	}
}
