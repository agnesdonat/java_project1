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
        
        // Numbers with decimal points.
        // 'Double' has maximum exponents, meaning 0.1234 takes up the same amount of memory as 1234.0
        // It has the total of 1023 values, be it on the left or the right side of the decimal point
        double e = 12.0;
        System.out.println(Double.MAX_EXPONENT);
        System.out.println(e);
        
        // 'Float' is much like a double but holds less values
        float f = 12.34F;
        System.out.println(Float.MAX_EXPONENT);
        System.out.println(f);
        
        // Variable format: data type + name + assignment operator + value
        // Value has to be the same as data type, i.e. float a = 34.123F etc.
        // Name can be a combination of numbers and letters but it can't be just a number and it can't start with a number
	}

}
