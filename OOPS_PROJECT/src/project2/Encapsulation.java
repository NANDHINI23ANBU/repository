package project2;

public class Encapsulation {
private long accno;
private int pswd;
public  long getaccno() {
	return accno;
	
}
public int getpswd() {
	return pswd;
}
public void setaccno(long accno) {
	this.accno=accno;
}
public void setpswd(int pswd) {
	this.pswd=pswd;
}

}
class account{
public static void main(String[] args) {
	Encapsulation ec=new Encapsulation();
ec.setaccno(50154782);
ec.setpswd(2548);
System.out.println(ec.getaccno()+" "+ec.getpswd());

}
}
