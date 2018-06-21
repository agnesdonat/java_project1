package project1;

public class lesson7 {

	public static void main(String[] args) {
		
		//Which number is the highest?
		int a,b,c;
		
		a = 18*76;
		b = 98*73;
		c = 87*65;
		
		if (a > b && a > c) {
			System.out.println("a = " + a + " is the highest");
		} else if (b > a && b > c) {
			System.out.println("b = " + b + " is the highest");
		} else if ( c > a && c > b) {
			System.out.println("c =" + c + " is the highest");
		} else {
			System.out.println("At least two values are equal");
		}
		
	}

}
