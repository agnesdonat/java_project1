package project1;

public class lesson5 {

	public static void main(String[] args) {
		
		// Find second highest and second lowest price and print them to the console
		double price1 = 5.0;
		double price2 = 1.2;
		double price3 = 2.2;
		double price4 = 3.2;
		double price5 = 4.2;
		
		double highest = price1;
		
		if (highest < price2) {
			highest = price2;
		}
		
        if (highest < price3) {
        	highest = price3;
        }
        
        if (highest < price4) {
        	highest = price4;
        }
        
        if (highest < price5) {
        	highest = price5;
        }
        
        System.out.println(highest);
        
        double second_highest = price2;
        
        if (second_highest > highest) {
        	highest = second_highest;        	
        }
        
        if (second_highest < price3 && price3 < highest) {
        	second_highest = price3;
        }
        
        if (second_highest < price4 && price4 < highest) {
        	second_highest = price4;
        }
        if (second_highest < price5 && price5 < highest) {
        	second_highest = price5;
        }
        
        System.out.println(second_highest);
        
        double lowest = price1;
		
		if (lowest > price2) {
			lowest = price2;
		}
		
		if (lowest > price3) {
			lowest = price3;
		}
		
		if (lowest > price4) {
			lowest = price4;
		}
		
		if (lowest > price5) {
			lowest = price5;
		}
		
		System.out.println(lowest);
		
		double second_lowest = price1;
		
		if (second_lowest < lowest) {
			second_lowest = lowest;
		}
		
		if (second_lowest > price3 && price3 > lowest) {
			second_lowest = price3;
		}
		
		if (second_lowest > price4 && price4 > lowest) {
			second_lowest = price4;
		}
		
		if (second_lowest > price5 && price5 > lowest) {
			second_lowest = price5;
		}
		
		System.out.println(second_lowest);
	
	}
	
		

}
