/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */

package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;


public class Main extends Application {

	Stage window;
	Scene scene;
	
	public void start(Stage primaryStage) {
		   
		window = primaryStage;
		window.setTitle("Snowman");
		
		
		
		// Create Background.
		
		Rectangle r1 = new Rectangle(600,325,Color.web("#00BFFF"));
		
		// Create sun.
		Circle c1 = new Circle(50,50,50,Color.YELLOW);
		c1.setCenterX(525.0f);
	    c1.setCenterY(75.0f);
	    
	    // Snowman bottom.
	    
		// Create Circle 2.
		Circle c2 = new Circle(60,60,60,Color.WHITE);
		c2.setCenterX(300.0f);
	    c2.setCenterY(280.0f);
	    
	    // Create Circle 3.
	 	Circle c3 = new Circle(40,40,40,Color.WHITE);
	 	c3.setCenterX(300.0f);
	 	c3.setCenterY(200.0f);
	 	    
	 	// Create Circle 4.
		Circle c4 = new Circle(25,25,25,Color.WHITE);
		c4.setCenterX(300.0f);
		c4.setCenterY(145.0f);
	    
	    // Create small buttons and line
		    
		    Circle c5 = new Circle(3,3,3,Color.BLACK);
			c5.setCenterX(290.0f);
		    c5.setCenterY(135.0f);
	        
		    
		    Circle c6 = new Circle(3,3,3,Color.BLACK);
		    c6.setCenterX(310.0f);
		    c6.setCenterY(135.0f);
		    
		    
		    
		    Circle c7 = new Circle(3,3,3,Color.BLACK);
		    c7.setCenterX(300.0f);
		    c7.setCenterY(185.0f);
		    

		    Circle c8 = new Circle(3,3,3,Color.BLACK);
			c8.setCenterX(300.0f);
			c8.setCenterY(200.0f);
		    

		    Circle c9 = new Circle(3,3,3,Color.BLACK);
		    c9.setCenterX(300.0f);
		    c9.setCenterY(215.0f);
		    
		    Line line = new Line();
		    
		    
		    
		    line.setStartX(290.0); 
		      line.setStartY(150.0); 
		      line.setEndX(310.0); 
		      line.setEndY(150.0); 
		    // layout.
		    
		    Group layout = new Group();
		    layout.getChildren().addAll(r1,c1,c2, c3, c4,c5,c6,c7,c8,c9,line);
		    layout.setStyle("-fx-background-color: #FFFFFF; -fx-font-weight: bold");		// White background.
		
		    // Initialize scene.
		    scene = new Scene(layout,590,430);
		    window.setResizable(false);														// Make window unresizeable.
		    window.setScene(scene);
		    window.show();
		

		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
