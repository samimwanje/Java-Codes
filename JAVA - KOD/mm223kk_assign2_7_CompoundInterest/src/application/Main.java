/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */

package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Font;

public class Main extends Application {


	private Stage window;				// Used instead of primaryStage.
	private Button button;				// Button
	private Scene scene;
	private int money = 0;
	private boolean answer;
	private Label endText = new Label("In totalt that will be: " +money);
	
	public void start(Stage primaryStage) {
		
		window = primaryStage;
		window.setTitle("Compund Interest");
		
		
		TextField startAmount = new TextField(); 		// New text-fields.
		TextField interest = new TextField();			
		TextField numberOfYears = new TextField();
		
		button = new Button("Calculate"); // Create new button with name,
		button.setOnAction(e -> {	// Action when clicking on button
			
			
		int k = 0, p = 0, t = 0;							// Sett k,p,t to 0.
	
		
		try {														// Check if it's numbers that have been entered.
			k = Integer.parseInt(startAmount.getText());		
			
		 p = Integer.parseInt(interest.getText());
	
		 t = Integer.parseInt(numberOfYears.getText());	
		answer = true;
		}catch(Exception e1) {	
			answer = false;										// If it's a number then an Exception will occur.
		}
		
	
		money =  (int) Math.round((k* Math.pow( ( 1 +(p/(double)100) ),t ) ));			// Result.
		
		if(answer == true)																// If numbers were interned. Print result.
		endText.setText("In totalt that will be: " +money);
		else
		endText.setText("Error, Please use numbers.");							// Else return error massage.
		
		});
		
		
		// layout setup.
		
		GridPane layout = new GridPane();							// Create new gridpane.
		layout.setPadding(new Insets(10,10,10,10));					// Set the padding.
		layout.setVgap(5.5);										// Set the gap between each box.
		
		
	
		Label text = new Label( "Compound Interest");				// Create new label.
		
		text.setFont(Font.font (15));								// Set the font on the label.

		layout.add(text, 0, 0 );									// Add the label to the gridpane
		
		layout.add(new Label("Start amount: "), 0,1);				// Add label and text field on top.
		layout.add(startAmount, 1,1);
		
		layout.add(new Label("Interest: "), 0,2);					// Add label and tex field in the middle.
		layout.add(interest, 1,2);														
		
		layout.add(new Label("Number of years: "), 0,3);			// Add label and text field on bottom.
		layout.add(numberOfYears, 1,3);								
		layout.add(button, 0,4);									// Add button att bottom. 
		layout.add(endText,0,5);									// Add text att bottom left.
		layout.setStyle("-fx-background-color: #FFFFFF; -fx-font-weight: bold"); // Set white background.
		
		scene = new Scene(layout, 340,185);							// Set size of scene.
		window.setScene(scene);										// Add scene to window
		window.setResizable(false);										// Make window unresizeable.
		window.show();												// Display window.
		
		
	}
	

	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
}
