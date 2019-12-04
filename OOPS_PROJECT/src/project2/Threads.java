package project2;

public class Threads extends Thread{
public void run() {
	try {
		System.out.println("Threads:"+Thread.currentThread().getId());
	}
	catch(Exception e){
		System.out.println("CAUGHT THREADS");
	}
}
public static void main(String[] args) {
	for(int i=0;i<10;i++) {
		Threads obj=new Threads();
		obj.start();
	}
}
}
