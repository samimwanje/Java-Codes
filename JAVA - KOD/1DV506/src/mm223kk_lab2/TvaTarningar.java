/*
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */

package mm223kk_lab2;

	import java.util.ArrayList;

	import java.util.*;

	public class TvaTarningar {

	public static void main(String[] args) {
		
		
		
	// Array som ska hålla i summan av kasten.
		
	ArrayList<Integer> kastArray = new ArrayList<Integer>(); 
	
	// Tärning 1 och 2.
	

	int T1;
	
	int T2;
	
	// Flagga  och Array för vilken siffra vi letar efter i slutet.
	
	int a = 2;
	
	int[] numArr = {2,3,4,5,6,7,8,9,10,11,12};
	
	// Flagga för för tärning 1 och 2.
		
	int current = 0;
	
	// Skapar slumpmässiga siffror mellan 1 och 6, 1000 gånger. Adderar sedan dessa.
	
	for(int i = 0; i < 10000; i ++) {
	
	T1 = (int) (Math.random() * 6 + 1);
	
	T2 = (int) (Math.random() * 6 + 1);
	
	current = T1 + T2;
	
	// Summan av tärning ett och två förs in i en array.
	
	kastArray.add(current);
	
		
	}
	
	int x = 0;
	
	System.out.println("Frequency table (sum,count) for rolling two dices 10000 times");
	
	
	
	for(int i = 2; i <= 12; i++) {
		
	for(int y : kastArray) {
		
	if(i == y) {
		
	x++;
	}
		
		
	}
		
		
	System.out.println(i +"    " +x);
			
	x = 0;
		
	}
	
	System.out.println("-------------------------------------------------------------");
	
	
	
	// Undersöker array efter en viss siffra och printar ut hur många gångder denna förekommer.
	
	// Upprepas numArr.length gånger då det är så många olika siffror.
	
	for (int i = 0; i < numArr.length; i++) {
	

	System.out.println(+a +"    " +Collections.frequency(kastArray,a));
	
	a++;	
	}
		
	
		
	}

}
