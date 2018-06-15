package project1;

public class class2 {

	public static void main(String[] args) {
		// 'int' is 32 bits, it can hold the maximum value of 2147483647
		int a = 1;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
        System.out.println(a);
        
        // When we need to assign a number that is larger than 2147483647 we use 'long'
        // 'long' can hold much more values: 9223372036854775807
        // We need to specify the data type adding 'L' to the end
        long b = 2147483648L;
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(b);
        
        // 'short' holds less than an 'int': 32767
        short c = 12;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(c);
        
        // 'byte' is the last integer data type and it has an even smaller maximum value of 127 
        byte d = 126;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(d);
	}

}
