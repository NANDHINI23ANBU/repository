package project2;


	interface Evenf{

		public String EvenNumber(int num1);

		}
public class Lambda {

		public static void main(String[] args) {
			
		Evenf Even=(num1)->((num1%2==0)? "Even Number": "Odd Number");
		System.out.println(Even.EvenNumber(9));
		}
			

		}
		
