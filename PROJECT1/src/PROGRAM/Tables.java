package PROGRAM;

import java.util.Scanner;

public class Tables {
public static void main(String[] args) {
	int n,m,output;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the multiple:");
	n=sc.nextInt();
	System.out.println("enter the number:");
	m=sc.nextInt();
	for(int i=1;i<=m;i++) {
	output=n*i;
	System.out.println(+n+"*"+i+"="+output);
	}
	
}
}
