package PROGRAM;

import java.util.Scanner;

public class dice2 {
	public static void main(String[] args) {
		int v1,v2,v3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter v1:");
		v1=sc.nextInt();
		System.out.println("enter v2:");
		v2=sc.nextInt();
		if(v1>=6|| v2>=6) {
			System.out.println("invalid");
		}
		else {
			v3=v1+v2;
			System.out.println("output is:"+v3);
		}
	}
	
	

}
