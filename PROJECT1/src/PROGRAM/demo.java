package PROGRAM;

import java.util.Scanner;

public class demo {
	
	public static void main(String[] args) {
		int n1,n2,sum,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n1:");
		n1=sc.nextInt();
		System.out.println("enter n2:");
		n2=sc.nextInt();
		sum=n1+n2;	
		if(sum<=8) {
			n3=8-sum;
			System.out.println("output:"+n3);
		}
		else {
			n3=2*(sum-8);
			System.out.println("output:"+n3);
		}
	}

}
