package PROGRAM;

import java.util.Scanner;

public class Bank {
public static void main(String[] args) {
	float x,si;
	int y,z,threshold;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter amount:");
	x=sc.nextFloat();
	System.out.println("enter rate of interest:");
	y=sc.nextInt();
	System.out.println("enter threshold:");
	threshold=sc.nextInt();
	si=threshold-x;
	z=(int)((si*100)/(x*y));
	
	System.out.println("no.of.years is"+z);
}
}
