package PROGRAM;

import java.util.Scanner;

public class ARRAY_MAX {
	public static void main(String[] args) {
		int n,max,i;
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter number of array:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array values:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
					}
		max=a[0];
		for(i=0;i<n;i++)
		{
			
		if(max<a[i]) 
		{
				max=a[i];
				System.out.println("MAXIMUM NUMBER IS:"+max);
			}
		}
	}

}
