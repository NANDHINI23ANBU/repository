package PROGRAM;

import java.util.Scanner;

public class ARITHMETIC {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		a=sc.nextInt();
		System.out.println("enter b:");
		b=sc.nextInt();
		System.out.println("enter c:");
		c=sc.nextInt();
		if((a+b)==c) {
			System.out.println("addition");
			if((a*b)==c) {
				System.out.println("multiplication");
		}
		}
		else if((a-b)==c){
			System.out.println("subtraction");
		}
		else if((a*b)==c) {
			System.out.println("multiplication");
		}
		else if((a/b)==c){
			System.out.println("division");
		}
		else {
			System.out.println("not possible");
		}

}
	
}

