package project2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
public class CopyFile {
public static void main(String[] args)throws IOException{
	FileInputStream fi=new FileInputStream("D:\\New folder\\n.txt");
	FileOutputStream fo=new FileOutputStream("D:\\iprime prodapt\\New folder\\nan.txt");
	int val;
	while((val=fi.read())!=-1){
		fo.write(val);
		
	}
	fo.close();
	fi.close();
}
}