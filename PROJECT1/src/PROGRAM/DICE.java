package PROGRAM;
import java.util.Scanner;

public class DICE {
	public static void main(String[] args)
	{
		int v1,v2,v3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value1:");
		v1=sc.nextInt();
		System.out.println("enter value2:");
		v2=sc.nextInt();
		

	if(v1<=6&&v2<=6) {
		if(v1==v2) {
			v3=2*(v1+v2);
			System.out.println("output is:"+v3);
			
		}
		else {
			v3=v1+v2;
			System.out.println("output is:"+v3);
		}
	}
	}
	
}
