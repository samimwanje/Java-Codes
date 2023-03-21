/**
 * Lnu-username: mm223kk
 * @Author: Sami Mwanje
 * @Date: 23/08/2020
 */

package mm223kk_assign4_6_TimeMeasurements;

public class TimeMain {
	
	static long start;
	static long endTime;
	static int count = 0;
	static String str;
	long sortTIme = 0;
	static long currentAverageTime = 0;
	static long currentAverageLength = 0;
	static long Averageconcatenations = 0;
	static long AverageEndTime;
	static long loops = 0;
	static long loadTime = 0;
	static long warmUp;

	static Runtime runtime = Runtime.getRuntime();
	public static void main(String[] args) {

	
			//Using the plus operator you can construct a long string by constantly increasing the length as:

			// Adding short strings containing only one character.
			
			System.out.println("Adding short strings containing only one character:---------------------------------------------------------\n ");
			loops = 65000;
			warmUp = 1000;
			for(int x = 0; x < 10; x++) {
			shortOneCharString();
			runtime.gc();// Clear memory
			}
		
			
		 	System.out.println("\nAdding long strings containing  only 80 characters:--------------------------------------------------------\n");
		 	loops = 5200;
			for(int x = 0; x < 10; x++) {
			long80CharString();
				runtime.gc();// Clear memory
			}
		 		 	
			System.out.println("\nSHORT stringBuilder. Adding short strings containing one char:--------------------------------------------------------\n");
			loops = 160000000;
			for(int x = 0; x < 10; x++) {
				shortOneCharStringBuilder();
				runtime.gc();// Clear memory
			}
		 
			System.out.println("\nLONG stringBuilder. Adding long strings containing 80 char:--------------------------------------------------------\n");
			loops = 8589999;
			for(int x = 0; x < 10; x++) {
			long80CharStringBuilder(); 
			runtime.gc();// Clear memory
			}
		 	
		
	
				}
		
	
			
			// One char Concatenations.
			private static void shortOneCharString() {
				
				
					warmUp=250;											// Used to warm up.
			 		count++;												// Used for a nice outprint.
			 		start = System.currentTimeMillis();						// Get current time.
			 		for(int x = 0; x < loops; x ++)							// Loop until around 1000 ms. ( Loops is measured by the user ).
					str += "a";												// Add "a" to the string.							
					endTime = System.currentTimeMillis();					// Get current time after loop.
					
					
					loadTime = endTime - start;								// Save time to go through loop.
				
				if(loadTime > 1000 )										// ADJUSTING AMOUNT OF THE LOOPS TO GE A CORRECT VALUE.
				loops -= warmUp;
				else if(loadTime < 950 )
				loops += warmUp;
					
	 			System.out.print("Time to execute: " +( loadTime) +" ms ");
	 			
				System.out.print(",    Concatenations " +(count) +": " +str.length());
				
				System.out.println(" ,    Length after 1 sec: " +str.length());		
				
				currentAverageLength += str.length();
				Averageconcatenations += str.length();
				AverageEndTime += (endTime - start);
				
				
				// Used to get a nice print and of the status.
				if(count == 10) {
				System.out.println("Average load time: " +AverageEndTime/(double)10);
				System.out.println("Average length adding one char:   " +currentAverageLength/(double)10);
				System.out.println("Average concatenations adding one char:   " 		+Averageconcatenations/(double)10);
				currentAverageLength = 0; 		// Reset 
				Averageconcatenations = 0;
				AverageEndTime = 0;
				count = 0;
				runtime.gc();// Clear memory
					}	
				str = ""; 
					}
	
	
		

			// 80  Concatenations
			private static void long80CharString() {
				
					count++;
					warmUp=100;	
					start = System.currentTimeMillis();
					for(int x = 0; x < loops; x ++)
					str += "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
						endTime = System.currentTimeMillis();
						
						loadTime = endTime-start;
							if(loadTime > 1150 )										// ADJUSTING AMOUNT OF THE LOOPS TO GE A CORRECT VALUE.
								loops -= warmUp;
									else if(loadTime < 950 )
											loops += warmUp;
								
				
					
					System.out.print("Time to execute: " +( loadTime ) +" ms ");
					
					System.out.print("Concatenations: " +str.length()/(double)80);
					
					System.out.println(",    Length after 1 sec: " +str.length());
					
					currentAverageLength += str.length();
					Averageconcatenations += str.length();
					AverageEndTime += (endTime - start);
					if(count == 10) {
						System.out.println("Average load time: " +AverageEndTime/(double)10);
						System.out.println("Average length, adding string with 80 chars:   " +currentAverageLength/((double)10));										
							System.out.println("Average concatenations adding string with 80 chars:   " 		+Averageconcatenations/( (double)10*80));
				
					currentAverageLength = 0;
					Averageconcatenations = 0;
					AverageEndTime = 0;
					count = 0;
					runtime.gc();// Clear memory
					 } 
					
					str = "";
					
					
									}	
					
		
		
		
	
			// STRING BUILDER	One char at the time.
			private static void shortOneCharStringBuilder() {
						warmUp = 10000;
						count++;
						StringBuilder sB = new StringBuilder();	
						start = System.currentTimeMillis();

						for(int x = 0; x < loops; x ++)
						sB.append("a");
						endTime = System.currentTimeMillis();	
						
						loadTime = endTime-start;
						if(loadTime > 1150 )										// ADJUSTING AMOUNT OF THE LOOPS TO GE A CORRECT VALUE.
							loops -= warmUp;
								else if(loadTime < 950 )
										loops += warmUp;
							
						
						
						System.out.print("Time to execute: " +(loadTime) +" ms "); 
						
						System.out.print("Concatenations: " +sB.toString().length());
						
						System.out.println(",    Length after 1 sec: " +sB.toString().length());
						
						currentAverageLength += sB.toString().length();
						Averageconcatenations += sB.toString().length();
						AverageEndTime += (endTime - start);
						if(count == 10) {
							System.out.println("Average load time: " +AverageEndTime/(double)10);
								System.out.println("Average length, appending stringBuilderConcatenations one char:   " +currentAverageLength/(double)10);
									System.out.println("Average Concatenations appending stringBuilderConcatenations one char:   " 		+Averageconcatenations/(double)10);
						currentAverageLength = 0;
						Averageconcatenations = 0;
						AverageEndTime = 0;
						count = 0;
						runtime.gc();// Clear memory
							}
								}
				
				
				
					// STRING BUILDER	One char at the time.
			private static void long80CharStringBuilder() {

					count++;
					
				 	StringBuilder sB = new StringBuilder();	
						
					start = System.currentTimeMillis();	
					for(int x = 0; x < loops; x ++) {
					sB.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"); 
					}
					endTime = System.currentTimeMillis();	
					
					loadTime = 	endTime - start;
					System.out.print("Time to execute: " +(loadTime) +" ms ");
		 			 																														
					System.out.print("Concatenations: " +sB.toString().length()/(double)80);
					
					System.out.println(",    Length: " +sB.toString().length());
					
					currentAverageLength += sB.toString().length();
					Averageconcatenations += ( sB.toString().length() );
					AverageEndTime += (endTime - start);
					runtime.gc();// Clear memory
					if(count == 10) {
						System.out.println("Average load time: " +AverageEndTime/(double)10);
							System.out.println("Average length after appending StringBuilde 80:   " +currentAverageLength/(double)10);
								System.out.println("Average Concatenations appending StringBuilder 80:   " +Averageconcatenations/((double)10*80));
					currentAverageLength = 0;
					Averageconcatenations = 0;
					AverageEndTime = 0;
					count = 0;
					}
				
					}
	
			
					
				}

