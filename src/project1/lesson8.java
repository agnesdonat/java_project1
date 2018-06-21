package project1;

public class lesson8 {

	public static void main(String[] args) {
		// Check whether or not the number is divisible by 10 using Switch statements
		
		int a = 87;
		
		switch(a) {
		case 10:
		case 20:
		case 30:
		case 40:
		case 50:
		case 60:
		case 70:
		case 80:
		case 90:
		case 100:
			System.out.println("a is divisible by 10");
			break;
		default:
			System.out.println("a is either under 100 or not divisible by 10");
		}

	}

}
