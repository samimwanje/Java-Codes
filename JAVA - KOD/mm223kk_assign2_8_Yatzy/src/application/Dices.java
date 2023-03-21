/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package application;

import java.util.Arrays;
import java.util.List;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Dices extends Main {
	
	
	//Dots for each dice (small circles).
	public Circle c1, c2, c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21;		// Creates 21 dots for 6 different numbers.
	
	private List<Circle> dots;		 // List that holds current dots. Used for recreating the structure of each dice.
		
	public	Dices(){
		
		//Create number one-dot and Set Y for 1.
		c1 = new Circle(4,4,4,Color.BLACK);
		c1.setCenterY(80);
		
		
		//Create number two-dots and Set Y for 2.
		c2 = new Circle(4,4,4,Color.BLACK);
		c3 = new Circle(4,4,4,Color.BLACK);
		c2.setCenterY(65); c3.setCenterY(95);
		
		//Create number three-dots and Set Y for 3.
		c4 = new Circle(4,4,4,Color.BLACK);
		c5 = new Circle(4,4,4,Color.BLACK);
		c6 = new Circle(4,4,4,Color.BLACK);
		c6.setCenterY(65); c5.setCenterY(80); c4.setCenterY(95); 
		
		
		//Create number four dots and Set Y for 4.
		c7 = new Circle(4,4,4,Color.BLACK);
		c8 = new Circle(4,4,4,Color.BLACK);
		c9 = new Circle(4,4,4,Color.BLACK);
		c10 = new Circle(4,4,4,Color.BLACK);
		c7.setCenterY(65); c8.setCenterY(95); c9.setCenterY(65); c10.setCenterY(95);
		
		// Create number five-dots and Set Y for 5.
		c11 = new Circle(4,4,4,Color.BLACK);
		c12 = new Circle(4,4,4,Color.BLACK);
		c13 = new Circle(4,4,4,Color.BLACK);
		c14 = new Circle(4,4,4,Color.BLACK);
		c15 = new Circle(4,4,4,Color.BLACK);
		c11.setCenterY(65); c12.setCenterY(95); c13.setCenterY(65); c14.setCenterY(95); c15.setCenterY(80);
		
		
		//Create number six-dots and Set Y for 6.
		c16 = new Circle(4,4,4,Color.BLACK);
		c17 = new Circle(4,4,4,Color.BLACK);
		c18 = new Circle(4,4,4,Color.BLACK);
		c19 = new Circle(4,4,4,Color.BLACK);
		c20 = new Circle(4,4,4,Color.BLACK);
		c21 = new Circle(4,4,4,Color.BLACK);
		c16.setCenterY(65); c17.setCenterY(95); c18.setCenterY(65); c19.setCenterY(95); c20.setCenterY(80); c21.setCenterY(80);
		
	}
	
	
			// Set X-coordinate for dot(s) on each dice.
			// Example: if the number is 2, then place the dots for  "TWO-DICE" on dice 1 and so on..
			// Also add the needed dots in dots-array. These will be used when creating a dice. Example a dice of two need two dots on a specific location.
			// The structure of these dots will be saved in a array, that will be used when adding the dots on the Scene.
			// This array will be returned.
			public List<Circle> handleDice1(int number, Group build2) {

				switch(number) {
				
				case 1:	c1.setCenterX(40);  build2.getChildren().addAll(c1); dots = Arrays.asList(c1); break;
					
				case 2:	c2.setCenterX(55); c3.setCenterX(25); build2.getChildren().addAll(c2,c3); dots = Arrays.asList(c2,c3);  break;
					
				case 3:  c4.setCenterX(25); c5.setCenterX(40); c6.setCenterX(55); build2.getChildren().addAll(c4,c5,c6); dots = Arrays.asList(c3,c5,c6); break;
	
				case 4:	c7.setCenterX(25); c8.setCenterX(25); c9.setCenterX(55); c10.setCenterX(55); build2.getChildren().addAll(c7,c8,c9,c10); dots = Arrays.asList(c8,c9,c10); break;
	
				case 5: c11.setCenterX(25); c12.setCenterX(25); c13.setCenterX(55); c14.setCenterX(55); build2.getChildren().addAll(c11,c12,c13,c14); dots = Arrays.asList(c11,c12,c13,c14);break;
				
				case 6: c16.setCenterX(25); c17.setCenterX(25); c18.setCenterX(55); c19.setCenterX(55); c20.setCenterX(25); c21.setCenterX(55); build2.getChildren().addAll(c16,c17,c18,c19,c20,c21); dots = Arrays.asList(c16,c17,c18,c19,c20,c21); break;
				
				default: c1.setCenterX(40); build2.getChildren().addAll(c1); dots = Arrays.asList(c1); break;  
				
				}


				return dots;


	}

	
				public List<Circle>  handleDice2(int number, Group build2 ) {
						
					
					switch(number) {
					
					case 1:	 c1.setCenterX(110);   build2.getChildren().addAll(c1); dots = Arrays.asList(c1); break;
						
					case 2:	 c2.setCenterX(125); c3.setCenterX(95); build2.getChildren().addAll(c2,c3); dots = Arrays.asList(c2,c3); break;
						
					case 3:  c4.setCenterX(95); c5.setCenterX(110); c6.setCenterX(125); build2.getChildren().addAll(c4,c5,c6); dots = Arrays.asList(c4,c5,c6); break;
		
					case 4:	 c7.setCenterX(95); c8.setCenterX(95); c9.setCenterX(125); c10.setCenterX(125);  build2.getChildren().addAll(c7,c8,c9,c10); dots = Arrays.asList(c7,c8,c9,c10); break;
		
					case 5:  c11.setCenterX(95); c12.setCenterX(95); c13.setCenterX(125); c14.setCenterX(125); c15.setCenterX(110); build2.getChildren().addAll(c11,c12,c13,c14,c15); dots = Arrays.asList(c11,c12,c13,c14); break;
					
					case 6:  c16.setCenterX(95); c17.setCenterX(95); c18.setCenterX(125); c19.setCenterX(125); c20.setCenterX(95); c21.setCenterX(125); build2.getChildren().addAll(c16,c17,c18,c19,c20,c21); dots = Arrays.asList(c16,c17,c18,c19,c20,c21); break;
					
					default: c2.setCenterX(125); c3.setCenterX(95); build2.getChildren().addAll(c2,c3); dots = Arrays.asList(c2,c3); break;
					
					}
					
					
					return dots;
			
				}
			
			
			
					public List<Circle> handleDice3(int number, Group build2 ) {

						switch(number) {
						
						case 1:	 c1.setCenterX(180);  build2.getChildren().addAll(c1); dots = Arrays.asList(c1); break;
							
						case 2:	 c2.setCenterX(195); c3.setCenterX(165); build2.getChildren().addAll(c2,c3); dots = Arrays.asList(c2,c3); break;
							
						case 3:  c4.setCenterX(165); c5.setCenterX(180); c6.setCenterX(195); build2.getChildren().addAll(c4,c5,c6); dots = Arrays.asList(c4,c5,c6); break;
			
						case 4:	 c7.setCenterX(165); c8.setCenterX(165); c9.setCenterX(195); c10.setCenterX(195); build2.getChildren().addAll(c7,c8,c9,c10); dots = Arrays.asList(c7,c8,c9,c10); break;
			
						case 5:  c11.setCenterX(165); c12.setCenterX(165); c13.setCenterX(195); c14.setCenterX(195); c15.setCenterX(180); 	build2.getChildren().addAll(c11,c12,c13,c14,c15);  dots = Arrays.asList(c11,c12,c13,c14,c15); break;
						
						case 6:  c16.setCenterX(165); c17.setCenterX(165); c18.setCenterX(195); c19.setCenterX(195); c20.setCenterX(165); c21.setCenterX(195);  build2.getChildren().addAll(c16,c17,c18,c19,c20,c21);  dots = Arrays.asList(c16,c17,c18,c19,c20,c21); break;
						
						default: c4.setCenterX(195); c5.setCenterX(180); c6.setCenterX(165); build2.getChildren().addAll(c4,c5,c6); dots = Arrays.asList(c4,c5,c6); break;  
						
						}
			
						return dots;
			
					}
			
			
			
			
						public List<Circle> handleDice4(int number, Group build2 ) {
							
						

							switch(number) {
							
							case 1:	 c1.setCenterX(250); build2.getChildren().addAll(c1);  dots = Arrays.asList(c1); break;
								
							case 2:	c2.setCenterX(265); c3.setCenterX(235); build2.getChildren().addAll(c2,c3); dots = Arrays.asList(c2,c3); break;
								
							case 3: c4.setCenterX(235); c5.setCenterX(250); c6.setCenterX(265); build2.getChildren().addAll(c4,c5,c6); dots = Arrays.asList(c4,c5,c6); break;
				
							case 4:	c7.setCenterX(235); c8.setCenterX(235); c9.setCenterX(265); c10.setCenterX(265); build2.getChildren().addAll(c7,c8,c9,c10); dots = Arrays.asList(c7,c8,c9,c10); break;
				
							case 5: c11.setCenterX(235); c12.setCenterX(235); c13.setCenterX(265); c14.setCenterX(265); c15.setCenterX(250); build2.getChildren().addAll(c11,c12,c13,c14,c15); dots = Arrays.asList(c11,c12,c13,c14,c15); break;
							
							case 6: c16.setCenterX(235); c17.setCenterX(235); c18.setCenterX(265); c19.setCenterX(265); c20.setCenterX(235); c21.setCenterX(265);  build2.getChildren().addAll(c16,c17,c18,c19,c20,c21); dots = Arrays.asList(c16,c17,c18,c19,c20,c21); break;
							
							default: c7.setCenterX(235); c8.setCenterX(235); c9.setCenterX(265); c10.setCenterX(265); build2.getChildren().addAll(c7,c8,c9,c10); dots = Arrays.asList(c7,c8,c9,c10); break; 
							
							}
							
							return dots;
			
						}
						
						
			
							public List<Circle> handleDice5(int number, Group build2 ) {

								switch(number) {
								
								case 1:	c1.setCenterX(320); build2.getChildren().addAll(c1); dots = Arrays.asList(c1); break;
									
								case 2:	c2.setCenterX(335); c3.setCenterX(305); build2.getChildren().addAll(c2,c3); dots = Arrays.asList(c2,c3); break;
									
								case 3: c4.setCenterX(305); c5.setCenterX(320); c6.setCenterX(335); build2.getChildren().addAll(c4,c5,c6); dots = Arrays.asList(c4,c5,c6); break;
					
								case 4:	c7.setCenterX(305); c8.setCenterX(305); c9.setCenterX(335); c10.setCenterX(335); build2.getChildren().addAll(c7,c8,c9,c10); dots = Arrays.asList(c7,c8,c9,c10); break;
					
								case 5: c11.setCenterX(305); c12.setCenterX(305); c13.setCenterX(335); c14.setCenterX(335); c15.setCenterX(320); 	build2.getChildren().addAll(c11,c12,c13,c14,c15); dots = Arrays.asList(c11,c12,c13,c14,c15); break;
								
								case 6: c16.setCenterX(305); c17.setCenterX(305); c18.setCenterX(335); c19.setCenterX(335); c20.setCenterX(305); c21.setCenterX(335);  build2.getChildren().addAll(c16,c17,c18,c19,c20,c21); dots = Arrays.asList(c16,c17,c18,c19,c20,c21); break;
								
								default:c11.setCenterX(305); c12.setCenterX(305); c13.setCenterX(335); c14.setCenterX(335); c15.setCenterX(320); 	build2.getChildren().addAll(c11,c12,c13,c14,c15); dots = Arrays.asList(c11,c12,c13,c14,c15);  break;
								
								}

								return dots;
			
							}
										
}