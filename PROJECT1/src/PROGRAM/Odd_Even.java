package PROGRAM;

import java.util.Scanner;

public class Odd_Even {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter  the number:");
	int n=sc.nextInt();
	if(n%2==0) {
		System.out.println("even number");
	}
	else {
		System.out.println("odd number");
	}
}
}
