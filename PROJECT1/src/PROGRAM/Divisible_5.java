package PROGRAM;

import java.util.Scanner;

public class Divisible_5 {
public static void main(String[] args) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  the number");
	int n=sc.nextInt();
	int[] a=new int[n];
	
	System.out.println("enter the values:");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		if(a[i]%5==0) {
			sum=sum+a[i];
		}
	}
	System.out.println("output"+sum);
}
}
