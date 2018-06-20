package project1;

public class lesson6 {

	public static void main(String[] args) {
		
		int a = 1;
		
		String sampleString = "This is a string";
		
		String a1 = "This is " + a;
		System.out.println(a1);
		
		System.out.println(sampleString.charAt(8));
		// It prints the 8th character of the string
		// charAt is method of the String class
		
		System.out.println(sampleString.substring(4, 8));
		// Substring starts at the 4th character (included) and prints every character up to the 8th (not included)
        
		System.out.println(sampleString.length());
		// Prints length of the string
		
		System.out.println(sampleString.equals("This is not a string"));
		// Compares sampleString value to the string in parentheses 
	}

}
