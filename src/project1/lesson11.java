package project1;

import java.util.Scanner;

public class lesson11 {

	public static void main(String[] args) {
		// Create a mini calculator
		// Ask user to input two numbers
		// Ask user to "add" or "subtract" the numbers
		
		Scanner r = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = r.nextInt();
		System.out.println("Enter a number");
		int b = r.nextInt();
		r.nextLine();
		System.out.println("Enter add or subtract");
		String c = r.nextLine();
		//System.out.println(c);
		//System.out.println(c.equals("add"));
		
		/**if (c == "add") {
			System.out.println(a + " + " + b + " equals to " + (a + b));
		} else if (c == "subtract") {
			System.out.println(a + " - " + b + " equals to " + (a - b));
		} else {
			System.out.println("Invalid command");
		}**/
		
		switch(c) {
		case "add":
			System.out.println(a + b);
			break;
		case "subtract":
			System.out.println(a - b);
			break;
		default:
			System.out.println("Invalid command");
		}

	}

}
