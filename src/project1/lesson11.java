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
				
		if (c.equals("add")) {
			System.out.println(a + " + " + b + " equals to " + (a + b));
		} else if (c.equals("subtract")) {
			System.out.println(a + " - " + b + " equals to " + (a - b));
		} else {
			System.out.println("Invalid command");
		}
		// The assignment operator was not working for strings
		// equals() method had to be used to compare user input with operations
		
		/**switch(c) {
		case "add":
			System.out.println(a + b);
			break;
		case "subtract":
			System.out.println(a - b);
			break;
		default:
			System.out.println("Invalid command");
		}**/

	}

}
