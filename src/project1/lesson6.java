package project1;

public class lesson6 {

	public static void main(String[] args) {
		
		int x = 1;
		
		String sampleString = "This is a string";
		
		String a1 = "This is " + x;
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
		// Returns true or false
		
		System.out.println(sampleString == "This is a string");
		// Returns true
		
		System.out.println(sampleString == new String("This is a string"));
		// Checks if it is the same exact Object; not if the values are the same
		// Returns false
		
		System.out.println(sampleString.replaceAll(" is", " is not"));
		// Replaces some contents of the string
		
		System.out.println(sampleString.replaceAll(" is", " is not").replaceAll("a string", "a boolean"));
		// Chaining methods together
		
		/** Create a program that take these five strings
		and returns a new string with the first and last letters of the five original strings.
		String result = "hhhhwiyogp";
		**/
		
		String a,b,c,d,e;
		
		a = "hi";
		b = "hey";
		c = "hello";
		d = "hows it going";
		e = "whats up";
				
	    String result = "" + a.charAt(0) + b.charAt(0) + c.charAt(0) + d.charAt(0) + e.charAt(0)
	     + a.charAt(a.length() - 1) + b.charAt(b.length() - 1) + c.charAt(c.length() - 1) + d.charAt(d.length() - 1) + e.charAt(e.length() - 1);
	    
	    System.out.println(result);
	}

}
