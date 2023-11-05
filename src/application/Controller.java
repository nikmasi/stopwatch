package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class Controller {
	Time time;
	
	public Controller() {
		time= new Time();
	}
	
	@FXML
	public Button buttonStart;
	@FXML
	public Button buttonReset;
	@FXML
	public Button buttonStop;
	@FXML
	public Text timeText;
	
	@FXML 
	private void buttonStartAction(ActionEvent event) {
		timeline.play();
	}
	
	@FXML 
	private void buttonResetAction(ActionEvent event) {
		timeline.stop();
		time.resetTime();
		timeText.setText(time.getCurrentTime());
	}
	@FXML 
	private void buttonStopAction(ActionEvent event) {
		timeline.stop();
	}
	
	Timeline timeline = new Timeline(
	            new KeyFrame(Duration.seconds(1),
	                    e -> {
	                        
	                        time.oneSecondPassed();
	                        timeText.setText(time.getCurrentTime());
	                        
	            }));
	
	@FXML
	public void initialize(){
		timeText.setText(time.getCurrentTime());
		timeline.setCycleCount(Timeline.INDEFINITE);
	}
}
