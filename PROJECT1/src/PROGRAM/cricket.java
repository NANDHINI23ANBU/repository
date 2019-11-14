package PROGRAM;

import java.util.Scanner;

class cricket {
	
	public static void main(String[] args) {
		int x,y,z,total;
		float percentage,diff;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x:");
		x=sc.nextInt();
		System.out.println("enter y:");
		y=sc.nextInt();
		System.out.println("enter z:");
		z=sc.nextInt();
		total=(4*y)+(6*z);
		diff=x-total;
		percentage=(diff*100)/x;
		System.out.println("total is:"+total);
		System.out.println("difference is:"+diff);
		System.out.println("percentage is:"+percentage);
		
	}

}
