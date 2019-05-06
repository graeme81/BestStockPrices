package facebook47;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	
		static int lowest = 0;
		static int highest = 0;
		static int diff = 0;
		
	public static void main(String[] args) {
		int[] nums = {9, 11, 8, 5, 7, 10};
//		int[] nums2 = {12, 4, 9, 7, 15, 2, 10};
		
		
		IntStream prices = Arrays.stream(nums);
		prices.forEach( x -> calculate(x));
		
		System.out.println("Greatest return = " + diff);
		
	}
	
	private static void calculate(int x) {
		
		if(lowest == 0) lowest = x ;
		
		if(x < lowest) { 
			lowest = x;
		}else if(lowest != 0) {
			int tempDiff = x - lowest;
			if(tempDiff > diff) diff = tempDiff;
		}
		
	};

}


