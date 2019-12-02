package PROGRAM;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n,sum=0,t1=0,t2=1;
	n=sc.nextInt();
	System.out.print(t1+" ");
	System.out.print(t2+" ");
	for(int i=1;i<n;i++) {
		
		sum=t1+t2;
		t1=t2;
		t2=sum;
		System.out.print(sum+" ");
		
	}
}
}
