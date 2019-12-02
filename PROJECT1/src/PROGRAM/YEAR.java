package PROGRAM;

import java.util.Scanner;

public class YEAR {
 static String date="";
 static String solve(int year) {
	 if(year<1918) {
		 date+=(year%4==0)?"12.09." + year:"13.09." + year;
	 }
	 else if(year==1918) {
		 date+="26.09." + year;
	 }
	 else{
		 date+=(year%400==0)||((year%4)==0&&(year%100!=0))?"12.09." + year:"13.09." + year;
	 }
		  {
	 }
		return date;
 }
public static void main(String[] args)	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year:");
	int year=sc.nextInt();
	String result=solve(year);
	System.out.println(result);
}
}

