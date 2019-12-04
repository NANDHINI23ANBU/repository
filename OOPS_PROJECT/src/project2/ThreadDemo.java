package project2;
public class ThreadDemo{
	public static void main(String[] args) throws InterruptedException {
		Cubes t1 = new Cubes();
		Squares t2 = new Squares();
		t1.start();
		t2.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("i value is :"+i);
			Thread.sleep(10);
		}
	}
}

 class Cubes extends Thread{

	
	public static void cubes() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("Cube of i is: "+Math.pow(i, 3));
			Thread.sleep(10);
		}
	}
	
	public void run() {
			try {
				cubes();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}

	

}

 class Squares extends Thread{

	public static void 	Squares() throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.println("Squares of i is: "+Math.pow(i, 2));
			Thread.sleep(10);
		}
	}
	
	public void run() {
			try {
				Squares();
				wait(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}
}