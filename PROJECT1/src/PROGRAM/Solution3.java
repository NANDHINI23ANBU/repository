package PROGRAM;


	import java.util.*;
	import java.io.*;

	public class Solution3 {
	    public static void main(String []argh)
	    {
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	for(int i=1;i<=n;i++) {
	    		for(int j=n;j>=i;j--) {
	    			System.out.print("*");
	    			
	    		}
	    		
	    		System.out.println("");
	    	}
	    	
	    }
	}