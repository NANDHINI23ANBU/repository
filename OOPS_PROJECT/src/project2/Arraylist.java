package project2;
import java.util.ArrayList;
import java.util.ListIterator;
public class Arraylist {
public static void main(String args[]) {
ArrayList al=new ArrayList();
for(int i=1;i<=100;i++) {
al.add(i);
}
ListIterator it=al.listIterator();
int temp=0;
while(it.hasNext()) {
int number = (int) it.next();
if(number%2==0) {

temp=temp+number;
}
}
System.out.println(temp);
}
}


