package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class Main extends Application {

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root=FXMLLoader.load(getClass().getResource("/application.fxml"));
		
		Scene scene = new Scene(root);
	    primaryStage.setScene(scene);
		primaryStage.setTitle("Stopwatch");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
