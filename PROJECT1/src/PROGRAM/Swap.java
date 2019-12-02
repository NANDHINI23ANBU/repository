package PROGRAM;

import java.util.Scanner;

public class Swap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	int m=sc.nextInt();
/*n=n+m;
m=n-m;
n=n-m;*/
	int c=m;
	m=n;
	n=c;
System.out.println(n);
System.out.println(m);

	}
}
