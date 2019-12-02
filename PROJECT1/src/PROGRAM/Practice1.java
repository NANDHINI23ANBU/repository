package PROGRAM;

import java.util.Scanner;

public class Practice1 {
	



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        
	    if(N%2==0){
	        if((N>=2&&N<=5)||(N>20)){
	System.out.println("print not weird");
	        }
	        else if(N>=6&&N<=20){
	            System.out.println("print weird");
	        }
	    }
	    else{
	        System.out.println("print weird");
	    }
	
	}
	        
	    
	}


