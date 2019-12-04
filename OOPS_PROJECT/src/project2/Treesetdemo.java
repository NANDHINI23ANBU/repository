package project2;

import java.util.TreeSet;

public class Treesetdemo {
public static void main(String[] args)
{
TreeSet<String>ts1 = new TreeSet<String>();
ts1.add("ram");
ts1.add("sum");
ts1.add("hmm");
TreeSet<String> ts2 = new TreeSet<String>(ts1);// moves ts1 values to ts2
//sorts data only in ascending order
System.out.println(ts1);
System.out.println(ts2);
TreeSet<Integer> ts3 = new TreeSet<Integer>(new Mycomparator());
ts3.add(3);
ts3.add(2);
ts3.add(8);

System.out.println(ts3);
}
}
