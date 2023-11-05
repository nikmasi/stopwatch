module ProjectStopwatch {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.media;
	requires javafx.web;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
}
