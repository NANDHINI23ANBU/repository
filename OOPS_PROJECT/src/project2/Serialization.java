package project2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable{
	private static final long serailversionUID=1L;
	int rollno;
	
	transient  String name;
	Serialization(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
public static void main(String[] args) throws IOException {
	Serialization s1=new Serialization(10,"anu");
	FileOutputStream fout=new FileOutputStream("nan.txt");
	ObjectOutputStream out=new ObjectOutputStream(out);
	out.writeObject(s1);
	out.flush();
	out.close();
	
	ObjectInputStream in=new ObjectInputStream(in);
	Serialization s=(Serialization)in.readObject();
	System.out.println(s.rollno+""+s.name);
	in.close();
}
}
