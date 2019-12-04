package project2;


public class Maximum implements Interface{
	
	public void max(int a) {
		
	/*if(a>b) {
		System.out.println("a is maximum:" +a);
	}
	else {
		System.out.println("b is maximum:" +b);
	}
	}*/
		if(a%2==0) {
			System.out.println("EVEN NUMBER");
		}
		else {
			System.out.println("ODD NUMBER");
		}
	}


	public static void main(String[] args) {
		Maximum m=new Maximum();
		m.max(123);
	}
}

