package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXDriver extends Application {

    /**
     * The main method for the GUI example program JavaFX version
     * @param args not used
     * @throws IOException
     */
    public static void main(String[] args) {
        launch(args);   
    }

    @Override
    public void start(Stage stage) throws IOException {
        // student Task #1:
        // instantiate the FXMainPane, name it root
        FXMainPane root = new FXMainPane();  // Create an instance of FXMainPane
        
        // set the scene to hold root (with width 400 and height 200)
        Scene scene = new Scene(root, 600, 400);
        
        // Set the scene on the stage
        stage.setScene(scene);
        
        // Set stage title
        stage.setTitle("Simple GUI Example");

        // Display the stage
        stage.show();
    }
}
