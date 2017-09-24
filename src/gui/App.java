package gui;




import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application{
	
	// The main stage of the application
	private static Stage _mainStage;
	
	public static final int APP_WIDTH = 800;
	public static final int APP_HEIGHT = 600;
	
	private static Font _maoriFont;
	
	/**
	 * Getter method for the main stage of the application
	 * @return: The main stage being used by the application
	 */
	public static Stage getMainStage() {
		return _mainStage;
	}
	
	public static void main(String[] args) {
		// Main launches the application
        launch(args);
    }
	

	// Start application
	@Override
	public void start(Stage mainStage) throws Exception {
		_mainStage = mainStage;
		_maoriFont = Font.loadFont(this.getClass().getResource("ldj_maori.ttf").toExternalForm(), 110);
		
		// Set up main stage title and initial pane
		_mainStage.setTitle("TĀTAI! Practice Module");
		_mainStage.setScene(new Scene(new MainMenu(), APP_WIDTH,APP_HEIGHT));
		
		// Make the stage visible
		_mainStage.show();
	}
	
	/**
	 * Getter method for the main "Maori font" to be used throughout the app.
	 * Size 110, font name ldj_maori.ttf
	 * @return the font object representing this font
	 */
	public static Font getMaoriFont() {
		return _maoriFont;
	}

}
