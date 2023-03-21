package application;

	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.util.ArrayList;

public class Main extends Application {

	Scene scene;
	Stage window;
	
	static ArrayList<Button> buttons;
	
	
	@Override
	
	public void start(Stage primaryStage) throws IOException {
		
		window = primaryStage;
		window.setTitle("CALC");
		
		Button close = new Button("X");
		close.setLayoutX(350);

		 
		close.setStyle("-fx-font: 10 arial; -fx-base: #ee2211;");
		close.setOnAction(e -> window.close());
		
	
		
		
		// Screen and shadow.
		
		Rectangle background = new Rectangle(500,700,Color.BLACK); 
		background.setArcWidth(100.0); 
		background.setArcHeight(100.0);  
		
		
		Rectangle screenRec = new Rectangle(430,250,Color.WHITE);
		screenRec.setArcWidth(100.0); 
		screenRec.setArcHeight(100.0);  
		screenRec.setStroke(Color.GRAY);
		screenRec.setStrokeWidth(2);
		
		
		// Adding effect to the screen.
		DropShadow screenRecShadow = new DropShadow();	
		screenRec.setEffect(screenRecShadow);
		screenRecShadow.setColor(Color.DARKBLUE);
		screenRecShadow.setWidth(65);
		screenRecShadow.setHeight(65);
		
		
		
		Pane root = new Pane();
		
		root.getChildren().add(screenRec);
		
		scene = new Scene(root,500,700);
		scene.setFill(Color.TRANSPARENT);
		window.initStyle(StageStyle.TRANSPARENT);
		
		window.setResizable(false);
		window.setScene(scene);	
		window.show();
		
	}
	
	public static void main(String[] args) {

		
		/*	Button YEQUALS; Button WINDOW; Button TRACE; Button GRAPH;	Button U4P;
		
		Button Secondnd; Button Mode; Button DEL;	Button LEFT; Button RIGHT;
		
		Button ALPHA; Button XTOn; Button STAT;					Button DOWN;
		

		Button MATH; Button MATRX; Button PRGM; Button VARS; Button CLEAR;
		
		Button negativeSqrt; Button SIN; Button COS; Button TAN; Button SQRT;
		
		Button ELEVATED2; Button COMMA; Button PARENTHESESLEFT; Button PARENTHESESRIGHT; */
		
	
		
		
		
		launch(args);
	}
}
