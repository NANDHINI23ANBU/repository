package PROGRAM;

public class Car {
	  int amount;
	  String carname;
	private int model;
	  public Car(String carname,int amount) {
		  this.amount=amount;
		  this.carname=carname;
	  }
	  public Car(int model) {
		  this.model=model;
	  }
	  public static void main(String[] args) {
		  Car cr=new Car("audi",100000);
		  Car cr1=new Car(2016);
		  System.out.println(cr.amount+" "+cr.carname+" "+cr1.model);
	  }
}