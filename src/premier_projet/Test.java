package premier_projet;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Test {

	public static void findMinMax() {

		int ints[] = {51, 24, 1999, 5, -2, 37, 76, 61, 99, 101, 36, -3};
		int i = 0;
		int tempMin = Integer.MIN_VALUE;
		int tempMax = Integer.MAX_VALUE;
	
		for(i = 0; i < ints.length; i++){
	         if(ints[i] < tempMax)
	        	 tempMax = ints[i];
	         if(ints[i] > tempMin)
	        	 tempMin = ints[i];
	         
	       }
		
		System.out.println("Température min =" + tempMax);
		System.out.println("Température max =" + tempMin);
  
       // Max et min plus simple
       OptionalInt max = Arrays.stream(ints).max();
       //ou
       OptionalInt max2 = IntStream.of(ints).max();

       OptionalInt min = Arrays.stream(ints).min();
       //ou
       OptionalInt min2 = IntStream.of(ints).min();
       System.out.print("\nValeur minimale = " + min.getAsInt());
       System.out.print("\nValeur maximale = " + max.getAsInt());
       System.out.print("\nValeur minimale = " + min2.getAsInt());
       System.out.print("\nValeur maximale = " + max2.getAsInt());
       
      
	}
}
