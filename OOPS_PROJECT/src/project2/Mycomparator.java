package project2;

import java.util.Comparator;

public class Mycomparator implements Comparator {
		public int compare(Object o1, Object o2) {
			Integer I1 =(Integer)o1;
			   Integer I2 =(Integer)o2;	
				
			
				if(I1<I2)
					return 1;// sorts data in descending order..
				else if(I1>I2)
					return -1;
				else
					return 0;
			}
		}
	