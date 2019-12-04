package project2;

public class Inheritance {
	int width,length,area;
	public static void main(String[] args) {
			Derived dr=new Derived(20,60);
		}
}
class Derived extends Inheritance{
	Derived(int length, int width) {
		area=length*width;
		System.out.println(area);
	}
}


