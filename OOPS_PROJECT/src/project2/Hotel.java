package project2;

import java.util.Scanner;

public class Hotel {
	public static void main(String[] args) {
public static void room(){
		System.out.println("ENTER YOUR CHOICE");
		System.out.println("1.Luxury Double Room ");
		System.out.println("2.Deluxe Double Room");
		System.out.println("3.Luxury Single Room");
		System.out.println("4.Deluxe Single Room");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
	switch(choice){
	case(1):
		System.out.println("Number of double beds :11"+"/n"+"AC"+":"+"Yes"+"/n"+"Free breakfast : Yes"+"/n"+"Charge per day:4000 ");
		break;
	case(2):
		System.out.println("Number of double beds :10"+"/n"+"AC"+":"+"Yes"+"/n"+"Free breakfast : NO"+"/n"+"Charge per day:2000 ");
	break;
	case(3):
		System.out.println("Number of double beds :5"+"/n"+"AC"+":"+"No"+"/n"+"Free breakfast : NO"+"/n"+"Charge per day:1000 ");
	break;
	case(4):
		System.out.println("Number of double beds :7"+"/n"+"AC"+":"+"No"+"/n"+"Free breakfast"+" :"+" NO"+"/n"+"Charge per day:500");
	System.exit(0);
		 }
}
public static void menu() {
	System.out.println("\r\n" + 
			"Menu: \r\n" + "\r\n" + "1. Sandwich Rs.50\r\n" + "2. Pasta Rs.60\r\n" + "3. Noodles Rs.70\r\n" + "4. Coke Rs.30\r\n" + "");
	System.out.println("Enter your choice:\r\n " );
	
}
}
}
	