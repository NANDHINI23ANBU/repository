package project2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("anu");
	al.add(null);
	al.add("ani");
	System.out.println(al);
	al.add(1,"abi");
	System.out.println(al);
	
	al.remove(null);
	System.out.println(al);
	al.remove(0);
	System.out.println(al);
	for(String str:al) {
	System.out.println(str);
	
}
}


}


