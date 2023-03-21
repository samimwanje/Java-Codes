/*
		
			Elevmail: mmm223kk@student.lnu.se
			
			Namn: Sami Mwanje.                     */
package mm223kk_lab2;

import java.util.Scanner;


public class NastStorsta {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		// Variabler för angivna tal, största och näststörstsa.
		
		int angivet = 0;
		
		int storsta = 0;
		
		int nastStorsta = 0;
		
		// Kontrollerar om det angivna är större än största, sparar även det senaste största.
		for( int i = 1; i < 11; i++) {
			
			System.out.println("Ange tal nummer "  +i +" :");
			
			angivet = input.nextInt();
			
			if(angivet > storsta) {
				
			nastStorsta = storsta;
			storsta = angivet;
			
			}
			
			if( angivet < storsta && angivet > nastStorsta ) {
				
			nastStorsta = angivet;
				
			}
		
		}
		

		// Printar ut det största.
		System.out.println("Det näststörsta talet är: " +nastStorsta);
		
		
		input. close();
	}
		
		
		
	}