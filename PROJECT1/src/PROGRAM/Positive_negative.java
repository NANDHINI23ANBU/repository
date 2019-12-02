package PROGRAM;

import java.util.Scanner;

public class Positive_negative {
public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter:");
	int n=sc.nextInt();
	if(n<0) {
		System.out.println("negative");
	}
	else {
		System.out.println("positive");
	}
}
}
