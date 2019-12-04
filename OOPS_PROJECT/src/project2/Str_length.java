package project2;

import java.awt.List;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

/*public class Str_length {
public static void main(String[] args) {
	Lambda1 Length=str->(str.length());
	System.out.println(Length.S("HI WELCOME"));
}
}*/
class Str_length
{
 public static void main(String args[])
 { 
    String s1 = "Hello";
    String s2 = new String(s1);
    String s3 = "HELLO";
    System.out.println(s1.equals(s2) + " " + s2.equals(s3));
 }
}