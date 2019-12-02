package PROGRAM;

public class Polymorphism {
void m1() {
	System.out.println("Parentclass");
	
}
void m2() {
	System.out.println("m2 method");
}
}
class Child extends Polymorphism{
	void m3() {
		System.out.println("m3 method");
	}
	void m1() {
		System.out.println("child class");
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.m1();
		c.m2();
		c.m3();
}
}
