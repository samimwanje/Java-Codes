package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;



public class PaintMain extends Application  {
	
	
	Button move;																	// Used for moved Button
	Button eraser;																	// Used for eraser Button
	int erase = 0;																	
	int freeze = 0; 																// Freeze node.
	double size = 10;																// Size of Shapes and Nodes...
	Pane layout;																	// Layout used.
	MenuButton colorMenu;															// Create menu for color.
	Stage window;																	// Used for primaryStage.
	Scene scene;																	// Used for scene.
	int drag;
	ComboBox<String> setShape;														// Used for shapes.
	ColorPicker setColor;															// ColorPicker, used to pick colors.
	public void start(Stage primaryStage) {
		
		window = primaryStage;														// primaryStage reference.
		window.setTitle("Tiny Painter");
		
		
		setShape = new ComboBox<String>();											// Create menu for shape
		setShape.getItems().addAll("Line", "Dot","Rectangle", "Circle");
		setShape.setPromptText("Shape");											// As original text.
		setShape.setTooltip(new Tooltip("Select shape of object"));					// Text to help user.
		
		setShape.setOnAction( event ->{ 											// What action to do when value is changed.
					
			
		scene.setOnMouseClicked(e -> {
			
			
			
			if(setShape.getValue().equals("Dot")) {																		
				freeze = 0;														// Set node.
				handleDot( setShape, e);				}	}); 						
		
		
		
			scene.setOnMouseDragged(handleDragged -> { 									// If mouse is dragged options.
			
			
			if(setShape.getValue().equals("Rectangle")) {								// Create rectangle.	
			drag = 0;																								
			freeze = 0;														 
			handleRectangle(setShape, handleDragged); }  
			
			
			
			
			if(setShape.getValue().equals("Line")) {									// Create Line
			drag = 0;
			freeze = 0;																
			handleLine(setShape, handleDragged); } 
			
	
			if(setShape.getValue().equals("Circle")) {									// Create shape.
			drag = 0;
			freeze = 0;			
			handleCircle(setShape, handleDragged);  }
			
			
			
			
			
			
			
			} ); 																	// Drag end 
		
			
		
		
			
		
		});  // Action end 
		
		
		
		ComboBox<Double> setSize = new ComboBox<Double>();							// Create menu size
		// Create menu for size.
		for(double x = 1; x <= 40; x++)
		setSize.getItems().add(x);
		setSize.setPromptText("Size");
		setSize.getSelectionModel().selectFirst();
		setSize.setTooltip(new Tooltip("Select of object"));						// Text to help user.
		setSize.setOnAction(e -> size = setSize.getValue()*5	);					// What acction to do when value is changed.
		
		
			
		
	
		//addBoxes();																	// Add boxes and text to color menu.
		
		 setColor = new ColorPicker(Color.BLACK); 
		
		// What to do when color is selected.
	
		eraser = new Button("Erase");
		eraser.setTooltip(new Tooltip("Press on item you want to delete."));	
		eraser.setOnAction(e -> erase = 1 );
		
		move = new Button("Move");
		move.setTooltip(new Tooltip ("Replace item whereever you want."));
		move.setOnAction(e -> freeze = 0);
	
		HBox setBoxes = new HBox(5);
		setBoxes.getChildren().addAll(setShape,setSize,setColor,eraser,move);
		setBoxes.setPadding(new Insets(10,10,10,10));
		
	
		// Layout for scene.
		layout = new Pane();	
		layout.getChildren().add(setBoxes);
		layout.setStyle("-fx-background-color: #FFFFFF; -fx-font-weight: bold");  // Set background color to white.
		
		
		scene = new Scene(layout,1366,768);	
		window.setScene(scene);
		window.setResizable(false);
		window.show();
		
	
	
	}
	
	
	private void handleRectangle( ComboBox<String> setShape, MouseEvent e) {
		
					Color color = Color.web(setColor.getValue().toString(),1.0);						// Create new rectangle with color.
					Rectangle rectangle = new Rectangle(0,0,color);										// Star with size 0.
					setShape.setValue("Shape");															
			
					
		            scene.setOnMouseDragged(reScale -> {												// Check if mouse is dragged
  
		            if(drag == 0) {															// If mouse is not released that continue drawing.
		            rectangle.setWidth(reScale.getX() );												// Draw sides of rectangle with mouse-movement.
		            rectangle.setHeight(reScale.getY());														 
		            
		            scene.setOnMouseReleased(event1 ->   {drag = 1;});							// Check if mouse has been released.
		            }}); 
		            
		           
					rectangle.setOnMouseDragged(reLocate -> {		
						// When mouse is held on Node.
					if(this.freeze == 0) {
					rectangle.setX(reLocate.getX()-rectangle.getWidth());													// Check current cursor position.
					rectangle.setY(reLocate.getY()-rectangle.getHeight()); 													// Check give rectangle that position.

					scene.setOnMouseReleased(er -> this.freeze = 1 );}
	
					
					//System.out.println("("+event.getSceneX()+", "+event.getSceneY()+")");
					
					
						});
					
					
						
						layout.getChildren().add(rectangle); 											// Add rectangle to scene.
		
						rectangle.setOnMousePressed( eraseCheck ->{										// Check if mouse is pressed on object.
						
						if(this.erase == 1 && freeze == 1) {											// If shape is frozen and eraser is on
						layout.getChildren().remove(rectangle);											// Delete object when pressed on it.
						
						this.erase = 0; }				});												// Set erase to 0.
										}
			
	private void handleDot( ComboBox<String> setShape, MouseEvent e) {
		
		
		Color color = Color.web(setColor.getValue().toString(),1.0);
		Rectangle dot = new Rectangle(size,size,color);
	
		dot.setX(e.getSceneX());								// Create Node on position that is pressed on.
		dot.setY(e.getSceneY()); 
		setShape.setValue("Shape");
	
		dot.setOnMouseDragged(event -> {						 // When mouse is held on Node.
		if(freeze == 0) {
		dot.setX(event.getSceneX());							// Check current cursor position.
		dot.setY(event.getSceneY()); 							// Check give rectangle that position.
		scene.setOnMouseReleased(stop -> freeze = 1); } });
		
		layout.getChildren().add(dot); 	// Add rectangle to scene.
		
		
		
		dot.setOnMousePressed( eraseCheck ->{											// Check if mouse is pressed on object.
			
			if(this.erase == 1 && freeze == 1) {										// If shape is frozen and eraser is on
			layout.getChildren().remove(dot);											// Delete object when pressed on it.
			
			this.erase = 0; }				});											// Set erase to 0.


		}


	private void handleLine( ComboBox<String> setShape, MouseEvent e) {
		

		Color color = Color.web(setColor.getValue().toString(),1.0);						// Create new rectangle with color.
		
		
		setShape.setValue("Shape");
		Line line2 = new Line(e.getSceneX(), e.getSceneY(),e.getSceneX(),e.getSceneY());	// Create new line where the mouse is located.
		line2.setStroke(color);																// Set color of line.
		line2.setStrokeWidth(size/2);														// Size of line
        	scene.setOnMouseDragged(reSize -> {												// Check if mouse is dragged
        	
        	
        	if(drag == 0) {
        	line2.setEndX(reSize.getSceneX());
        	line2.setEndY(reSize.getSceneY());
        
        	scene.setOnMouseReleased(stop -> drag = 1); } });
        	
        
        	
    	/*	line2.setOnMouseDragged(reLocate -> {												// Check if mouse is dragged
    		if(freeze == 0) {																				// If mouse is not released than continue drawing.
        	
    		line2.setTranslateX(reLocate.getSceneX()-line2.getStartX());						// Change location of line.
    		line2.setTranslateY(reLocate.getSceneY()-line2.getStartY());						// Change location of line.
  
        	} 													 
    		   										
    		scene.setOnMouseReleased(stop -> freeze = 1);
    		
    		}); */
   
			layout.getChildren().add(line2);
																				
	
			line2.setOnMousePressed( eraseCheck ->{											// Check if mouse is pressed on object.
				
				if(this.erase == 1) {										// If shape is frozen and eraser is on
				layout.getChildren().remove(line2);											// Delete object when pressed on it.
				
				this.erase = 0; }				});											// Set erase to 0.
	
	
	
	
	
															}
	
	
	private void handleCircle( ComboBox<String> setShape, MouseEvent e) {
		
	
		
		Color color = Color.web(setColor.getValue().toString(),1.0);						// Create new rectangle with color.
		Circle circle = new Circle(0,color);										// Star with size 0.
		
		circle.setCenterX(e.getSceneX());															// Create Node on position that is pressed on.
		circle.setCenterY(e.getSceneY()); 
		setShape.setValue("Shape");
	
		
		
		
        	scene.setOnMouseDragged(reSize -> {												// Check if mouse is dragged
        	
        	
        	if(drag == 0) {
        		circle.setRadius(reSize.getSceneX()-circle.getCenterX());									// Create Node on position that is pressed on.
        	scene.setOnMouseReleased(stop -> drag = 1); 
        													} 
        														});
        	
        
        	
        	circle.setOnMouseDragged(reScale -> {												// Check if mouse is dragged
    		if(freeze == 0) {																				// If mouse is not released that continue drawing.
    			circle.setCenterX(reScale.getSceneX());													// Draw sides of rectangle with mouse-movement.
    			circle.setCenterY(reScale.getSceneY());	
        	}													 
    		   														
    		scene.setOnMouseReleased(stop -> freeze = 1);
    		
    		}); 
   
			layout.getChildren().add(circle);
																				
	
			circle.setOnMousePressed( eraseCheck ->{											// Check if mouse is pressed on object.
				
				if(this.erase == 1 && freeze == 1) {										// If shape is frozen and eraser is on
				layout.getChildren().remove(circle);											// Delete object when pressed on it.
				
				this.erase = 0; }				});											// Set erase to 0.
	
			
		
	}
	
	

}
