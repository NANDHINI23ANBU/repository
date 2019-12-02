package PROGRAM;

import java.util.Scanner;

public class ATM {
public static void main(String[] args) {
	int balance=10000,deposit,withdraw,n;
	Scanner sc=new Scanner(System.in);
	int pinnum=1234,pin;
	System.out.println("enter your pin");
	pin=sc.nextInt();
	
	
	if(pin==pinnum) {
		
		System.out.println("enter your choice");
		System.out.println("enter 1 for balance:");
		System.out.println("enter 2 for withdraw");
		System.out.println("enter 3 for deposit");
	}
	while(true) {
	n=sc.nextInt();
			switch(n) {
		case 1:
			System.out.println("balance is"+balance);
			break;
		case(2):
			System.out.println("enter withdraw amount:");
		withdraw=sc.nextInt();
			if(balance<withdraw) {
				System.out.println("insufficient balance:");
			}
			else {
				balance=balance-withdraw;
				System.out.println("amount withdraw successfully");
			}
			break;
		case(3):
			System.out.println("enter deposit amount:");
		deposit=sc.nextInt();
			balance=balance+deposit;
			System.out.print("amount deposited");
			break;
		case(4):
			System.out.println("Thank you for visiting");
			System.out.println("exit");
		System.exit(0);
		}
	}
}
}