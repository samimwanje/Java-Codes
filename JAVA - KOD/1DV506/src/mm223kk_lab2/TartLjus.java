/*
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */


package mm223kk_lab2;



public class TartLjus {

	public static void main(String[] args) {
		
		
		
		char[] text = { 't', 't', 'ä', 'l', ' ', 'r', 'a', 'v', ' ', 'a', 't', 't', 'e', 'D' };
		
		// Skapar en String med alla variabler från text. och Printar text.
		
		String copyb = String.valueOf(text);
		System.out.println(text);
		
		// For-lopp där i/j räknar från text.length och bakåt/frmåt. Alltså 14 till 0. J räknar 0 till 14.
		
		for(int i = text.length-1, j = 0; j < text.length && i >= 0; i--, j++) {
		
		// Element i ersätts med värdet på elment j i copyb.
			
		text[i] = copyb.charAt(j);
		
			
		}
			
		// Printar ut inverterad text.
		System.out.println(text);
		
	}
		
		
}
		
		