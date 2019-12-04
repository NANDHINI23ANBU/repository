package project2;

public class Synchronize {

	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d,"sai");
		MyThread t2 = new MyThread(d,"ram");
		MyThread t3 = new MyThread(d,"sam");
		MyThread t4 = new MyThread(d,"ajay");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
class MyThread extends Thread {
    Display d;
    String s;
    MyThread(Display d,String s) {
   	 this.d=d;
   	 this.s=s;
    }
    public void run() {
   	 try {
   		 d.greet(s);
   	 }
   	 catch(InterruptedException e) {
   		 e.printStackTrace();
   	 }
    }
}
 class Display {
	  synchronized void greet(String s) throws InterruptedException{
		  for(int i=0;i<10;i++) {
			  System.out.println("Hello "+s);
			  Thread.sleep(10);
		  }
	  }
 }

