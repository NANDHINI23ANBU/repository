package PROGRAM;

import java.util.Scanner;

public class Sumofodd_even {
public static void main(String[] args) {
	int n,sumo=0,sume=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of array:");
	n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter  the array values:");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		if(a[i]%2==0) {
			sume=sume+a[i];
		}
		else {
			sumo=sumo+a[i];
		}
	}
	
	System.out.println("sum of odd num:"+sumo);
	System.out.println("sum of even num:"+sume);
}
}
