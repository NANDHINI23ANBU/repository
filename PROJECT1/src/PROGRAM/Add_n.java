package PROGRAM;

import java.util.Scanner;

public class Add_n {
	 static void add(int ...a) {
		int sum = 0;
		for(int i:a) {
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		add(2,4,7);
		add(24,45);
		add(1000,12);
		
		/*Add_n ar=new Add_n();
		ar.add(2,4,7);
		ar.add(5,7);*/

	}
		
}



