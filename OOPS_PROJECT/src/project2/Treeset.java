package project2;

import java.util.HashMap;
import java.util.TreeSet;

public class Treeset {
public static void main(String[] args) {
	TreeSet<String> tr=new TreeSet<String>();
	HashMap<Integer, String> tm=new HashMap<Integer, String>();
	tr.add("null");
	tr.add("anu");
	tr.add("nimi");
	tr.add("ani");
	System.out.println(tr);
	
	tm.put(225,"null");
	tm.put(24,"anu");
	tm.put(12,"nimi");
	tm.put(1,"ani");
	System.out.println(tm);
}
}
