/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package application;
	
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	
	
	
	// Variables that will be used.
	private Button button; 			// Button				 
	private static Stage window;		// Window (This is the primaryStage.
	private static GridPane layout = new GridPane();			// Layout used for coordinates.
	private int roll = 4;											// User number of roles.
	private  ArrayList<Integer> numbers = new ArrayList<Integer> ();		// Array to saved current random numbers.
	private static Random generate = new Random();								// Class that creates random numbers.
	private int occurrences, occurrences2; 										// Variables used when printing result.
	private  List<Circle> dotsDice1, dotsDice2, dotsDice3, dotsDice4, dotsDice5; // Object for each dice.
	private int[] dices = {0,0,0,0,0};												// Array that is used to store values.
	private ArrayList<Integer> list;													//ArrayList that is used to store values.
	private Text text2;																	// Text used for header and printing result.
	
	public void start(Stage primaryStage) {
		
		window = primaryStage;
		
		button = new Button("Roll the dice!"); 				// Create new button with text "Roll the dice!".

		DropShadow shadow = new DropShadow();			 // Create shadow-effect for dices...
		
		// Header.
		text2 = new Text("Yahtzee");
		text2.setFont(Font.font ("Trebuchet MS",30));
		

		
		//Created 5 dices. 
		Rectangle rectangle0 = new Rectangle(60,60, Color.WHITE);  		// Set dice size and color	of dice0.
		rectangle0.setArcWidth(30.0); 									// Curve the sides of the dices.
		rectangle0.setArcHeight(20.0);
		rectangle0.setEffect(shadow);									// Add shadow around the dices.
	
		
		// Rectangle 1 (Dice1)
		Rectangle rectangle1 = new Rectangle(60,60, Color.WHITE);  rectangle1.setArcWidth(30.0); rectangle1.setArcHeight(20.0);  rectangle1.setEffect(shadow);
		
		// Rectangle 2  (Dice2)
		Rectangle rectangle2 = new Rectangle(60,60, Color.WHITE);  rectangle2.setArcWidth(30.0); rectangle2.setArcHeight(20.0);  rectangle2.setEffect(shadow);
		
		
		// Rectangle 3  (Dice3)
		Rectangle rectangle3 = new Rectangle(60,60, Color.WHITE);  rectangle3.setArcWidth(30.0); rectangle3.setArcHeight(20.0);	 rectangle3.setEffect(shadow); 
		
	
		// Rectangle 4  (Dice4)
		
		Rectangle rectangle4 = new Rectangle(60,60, Color.WHITE); rectangle4.setArcWidth(30.0); rectangle4.setArcHeight(20.0);  rectangle4.setEffect(shadow);
		

		HBox layout0 = new HBox(10);
		layout0.getChildren().addAll(rectangle0,rectangle1,rectangle2,rectangle3,rectangle4);
		
		
		
		//Create Check boxes for unrolling dices..
		
		CheckBox box1 = new CheckBox(); CheckBox box2 = new CheckBox(); CheckBox box3 = new CheckBox(); CheckBox box4 = new CheckBox();	CheckBox box5 = new CheckBox();
		
		HBox checkBoxes = new HBox(50);									  // New  Horizontal-box with a space of 50 pixels per box.
		checkBoxes.getChildren().addAll(box1,box2,box3,box4,box5);		 // Adding checkBoxes in Horizontal-box.
		checkBoxes.setAlignment(Pos.CENTER);							// Set checkBoxes in center position.
		
		
		HBox layout1 = new HBox();										// Creates new layout for button.
		layout1.getChildren().addAll(button);
		layout1.setAlignment(Pos.BOTTOM_LEFT);							// Add button on bottom left.
		

		// GridPane  Layout
		
		layout = new GridPane();
		
		
		layout.setPadding(new Insets(10,10,10,10));
		layout.setVgap(5.5);
		
		
		layout.add(text2,0,0);					// Add text on top.
		layout.add(layout0,0,1);				// Add "dices" in middle
		layout.add(checkBoxes,0,3);				// Add checkboxes in the middle.
		layout.add(layout1,0,6);				// Add button att bottom
		
		
		// Add these numbers in Array that hold the random numbers.
		// This will make the first dices be 1-2-3-4-5.
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
			
		rollButton(box1, box2, box3, box4, box5);				// Run the roll method without generating five new numbers. 

	
		// If roll button is pressed generate 5 new random numbers. And run the roll method.
		button.setOnAction(e -> {	numbers = generate.numbers(); rollButton(box1, box2, box3, box4, box5); }); 
		
		
	}
	
	
	private  void rollButton(CheckBox box1,CheckBox box2,CheckBox box3,CheckBox box4,CheckBox box5) {
		
		if(roll <= 0) { System.exit(0);}			// If used have rolled 3 times. End program.
		roll--;										// For each roll decrees roll until roll = 0.
		System.out.println("Numbers generated: " +numbers);				// Prints new generated numbers. (Mostly for troubleshooting).
		
		Group build2 = new Group();					// New layout to add the new "dots" on the dices.
		build2.getChildren().add(layout);
		

			if(!box1.isSelected()) {			// Check if CheckBox-N is selected or not.			
			Dices x1 = new Dices();				// If check-box is NOT selected. Create a new "dice-structure"
			dotsDice1 = x1.handleDice1(numbers.get(0),build2);			// Generate needed dots.
			dices[0] = numbers.get(0);									// Add the number generated on the first dice to array that hold the kept dices.
			}else for(int i = 0; i < dotsDice1.size(); i++) 			// If dice is selected ( Box checked) 
								build2.getChildren().add( dotsDice1.get(i) );	// Don't update the dots. Just use the previously used selected when check box was not checked.
				
			
			
			if(!box2.isSelected()) {	
			Dices x2 = new Dices();
			dotsDice2 = x2.handleDice2(numbers.get(1),build2);
			dices[1] = numbers.get(1);
			}else for(int i = 0; i < dotsDice2.size(); i++)
								build2.getChildren().add( dotsDice2.get(i) );
	
			
			
		
			if(!box3.isSelected()) {	
			Dices x3 = new Dices();
			dotsDice3 = x3.handleDice3(numbers.get(2),build2);
			dices[2] = numbers.get(2);
			} else for(int i = 0; i < dotsDice3.size(); i++)
				 				build2.getChildren().add( dotsDice3.get(i) );

		
			if(!box4.isSelected()) {	
			Dices x4 = new Dices();
			dotsDice4 =  x4.handleDice4(numbers.get(3),build2);
			dices[3] = numbers.get(3);
			} else for(int i = 0; i < dotsDice4.size(); i++)
				 				build2.getChildren().add( dotsDice4.get(i) );

			
			
		
			if(!box5.isSelected()) {
			Dices x5 = new Dices();
			dotsDice5 = x5.handleDice5(numbers.get(4),build2);
			dices[4] = numbers.get(4);
			} else for(int i = 0; i < dotsDice5.size(); i++)
				 						build2.getChildren().add( dotsDice5.get(i) );
			
			
		
		
			
			 Text text2 = new Text("You have " +roll +" roll(s)" +" left.");			// Updates how many roles user has left.
								text2.setX(100);										// Set text right side beside button.
									text2.setY(180);		
		
		// Copy users saved numbers to arrayList. This is because ArrayList is easier to handle.						
		list = new ArrayList<Integer>();						
		for(int x = 0; x < dices.length; x++) 
				list.add(dices[x]); 
		System.out.println("Nmbers saved: " +list ); 	// Prints the saved numbers. (Mostly for troubleshooting).
		
		
		
		if(roll == 0) // Run method result, to handle result. When user has no roles left.
		result(); 	
			
	
		build2.getChildren().add(text2);				// Update header when user result is generated.
		build2.setStyle("-fx-background-color: #FFFFFF; -fx-font-weight: bold");		// Set background and more clear text.
		Scene scene = new Scene(build2,360,200);		// Scene for program. With size 360, 200.
		window.setScene(scene);							// Add scene in windows ( stage ).
		window.setResizable(false);						// Make window unresizeable.
		window.show();									// Display Window. ( Stage ).
		}
			

	
	public void result() {
		
		
			// Starts scanning for what result the user got, when he/she is out of roles.
			for(int i = 0; i <dices.length; i++) {

				occurrences = Collections.frequency(list, list.get(i));			// Variable that hold how many current element appears in array. (On users dices). 
	
				// If five display print YAHTZE!! and so on...
				if(occurrences == 5) {											
					text2.setText("YAHTZEE!!!!"); break;}    

				if(occurrences == 4) {
					text2.setText("Four-Of-A-Kind!"); break;}

				// If element appears 3 times. Check for a pair. 
				if(occurrences == 3) {

					for(int x  = 0; x < dices.length; x++) {	
						occurrences2 = Collections.frequency(list, list.get(x));
						if(occurrences2 == 2) {
							text2.setText("Full House!"); break;}		// If pair found result will be Full house.

					}

					if(occurrences2 != 2)
						text2.setText("Three-Of-A-Kind!"); break;		// If pair not found result will be three in a row.
				}


				if( (occurrences == 2 && ( Collections.frequency(list, list.get(0+3)) ) != 3) ) {		// Checks for pair.
					text2.setText("Pair!"); break;}

					
				
				// Checks if Array-elements matches conditions for large straight.
				if ( ( (list.get(0) == 2) && (list.get(1) == 3) && (list.get(2) == 4) && (list.get(3) == 5) && (list.get(4) == 6) )   ||     ( (list.get(0) == 1) && (list.get(1) == 2) && (list.get(2) == 3) && (list.get(3) == 4) && (list.get(4) == 5) )  ){
					text2.setText("Large Straight!"); break; 
			}  else if( ( (list.get(0) == 6) && (list.get(1) == 5) && (list.get(2) == 4) && (list.get(3) == 3) && (list.get(4) == 2) )   ||     ( (list.get(0) == 5) && (list.get(1) == 4) && (list.get(2) == 3) && (list.get(3) == 2) && (list.get(4) == 1) ) ){ 
					text2.setText("Large Straight!"); break;}

				// Checks if Array-elements matches conditions for small straight.
				if ( (  (list.get(1) == 3) && (list.get(2) == 4) && (list.get(3) == 5) && (list.get(4) == 6) )   ||     ( (list.get(1) == 2) && (list.get(2) == 3) && (list.get(3) == 4) && (list.get(4) == 5) )  ){
					text2.setText("Small Straight!"); break; 
			}  else if(  (  (list.get(1) == 5) && (list.get(2) == 4) && (list.get(3) == 3) && (list.get(4) == 2) )   ||     ( (list.get(1) == 4) && (list.get(2) == 3) && (list.get(3) == 2) && (list.get(4) == 1) ) || ( (list.get(1) == 6) && (list.get(2) == 5) && (list.get(3) == 4) && (list.get(4) == 3)) || ( (list.get(0) == 6) && (list.get(1) == 5) && (list.get(2) == 4) && (list.get(3) == 3) ) ){ 
					text2.setText("Small Straight!"); break;}

			}

	}
		
	
	public static void main(String[] args) {
		launch(args);
	}
}
