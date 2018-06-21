package project1;

public class lesson9 {

	public static void main(String[] args) {
		
		// Random values between 0 and 1
		double t = Math.random();
		System.out.println(t);
		
		// Random values between 0 and 60
		double u = Math.random() * 60;
		System.out.println(u);
		
		// Random values between 0 and 60 rounded to integers
		// First multiply random value then cast it to integer
		double v = (int)(Math.random() * 60);
		System.out.println(v);
		
		// Algorithm for random value from a value (5, minimum) to a value (10, maximum)
		double w = 5 + (int)(Math.random() * ((10 - 5) + 1));
		System.out.println(w);
		
	}

}
