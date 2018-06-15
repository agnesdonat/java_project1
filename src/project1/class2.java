package project1;

public class class2 {

	public static void main(String[] args) {
		// 'int' is 32 bits, it can hold the maximum value of 2147483647
		int a = 1;
		System.out.println(Integer.MAX_VALUE);
        System.out.println(a);
        
        // When we need to assign a number that is larger than 2147483647 we use 'long'
        // 'long' can hold much more values
        // We need to specify the data type adding 'L' to the end
        long b = 2147483648L;
        System.out.println(Long.MAX_VALUE);
        System.out.println(b);
        
	}

}
