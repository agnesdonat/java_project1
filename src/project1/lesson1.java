package project1;

public class lesson1 {

	public static void main(String[] args) {
		System.out.println("Hello, World!");
		printer("Hello World", 10);

	}

	public static void printer(String name, int times) {
		for (int i = 0; i < times; i++) 
			System.out.println(name);
	}
	
	
}


