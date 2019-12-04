package project2;
import java.util.*;
public class String_Tokens {
	
public static void main(String[] args) {
	StringTokenizer st=new StringTokenizer("HELLO WORLD");
	System.out.println(st.nextToken(" "));
	System.out.println(st.nextToken(" "));
}
}
