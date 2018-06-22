package project1;

import java.util.Scanner;

public class lesson10 {

	public static void main(String[] args) {
		// new is the constructor
		Scanner r = new Scanner(System.in);
				
		int a = (int)(Math.random() * 40);
		
		System.out.println("Enter number");
		
		int b = r.nextInt();
		
		System.out.println(a + " + " + b + " equals to " + (a + b) + ".");
	}

}
