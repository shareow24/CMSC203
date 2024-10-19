package application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.
 */
public class FXMainPane extends VBox {

    // student Task #2: declare five buttons, a label, and a textfield
    private Button helloBtn, howdyBtn, chineseBtn,clearBtn, exitBtn;
    private Label feedbackLabel;
    private TextField textField;

    // student Task #2: declare two HBoxes
    private HBox buttonBox, feedbackBox;


    // student Task #4: declare an instance of DataManager
    private DataManager dataManager;

    /**
     * The MainPanel constructor sets up the entire GUI in this approach.
     */
    FXMainPane() {
        // student Task #2: instantiate the buttons, label, and textfield
        helloBtn = new Button("Hello");
        howdyBtn = new Button("Howdy");
        chineseBtn = new Button("Chinese");
        clearBtn = new Button("Clear");
        exitBtn = new Button("Exit");

        feedbackLabel = new Label("Feedback:");
        textField = new TextField();

        // student Task #2: instantiate the HBoxes
        buttonBox = new HBox(10);  // 10px spacing between buttons
        feedbackBox = new HBox(10);  // 10px spacing between label and text field

        // student Task #4: instantiate the DataManager instance
        dataManager = new DataManager();

        // student Task #3: add the label and textfield to one of the HBoxes
        feedbackBox.getChildren().addAll(feedbackLabel, textField);
        feedbackBox.setAlignment(Pos.CENTER);

        // student Task #3: add the buttons to the other HBox
        buttonBox.getChildren().addAll(helloBtn, howdyBtn, chineseBtn, clearBtn, exitBtn);
        buttonBox.setAlignment(Pos.CENTER);

        // student Task #4: set margins and alignment
        this.setSpacing(20);
        this.setPadding(new Insets(20));

        // student Task #3: add the HBoxes to this FXMainPanel (a VBox)
        this.getChildren().addAll(feedbackBox, buttonBox);

        // Task #4: create a private inner class to handle the button clicks
        helloBtn.setOnAction(new ButtonHandler());
        howdyBtn.setOnAction(new ButtonHandler());
        chineseBtn.setOnAction(new ButtonHandler());
        clearBtn.setOnAction(new ButtonHandler());
        exitBtn.setOnAction(new ButtonHandler());
    }

    // Task #4: create a private inner class to handle the button clicks
    private class ButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            if (event.getTarget() == helloBtn) {
                textField.setText(dataManager.getHello());
            } else if (event.getTarget() == howdyBtn) {
                textField.setText(dataManager.getHowdy());
            } else if (event.getTarget() == chineseBtn) {
                textField.setText(dataManager.getChinese());
            } else if (event.getTarget() == clearBtn) {
                textField.setText("");  // Clear the text field
            } else if (event.getTarget() == exitBtn) {
                Platform.exit();  // Exit the application
                System.exit(0);
            }
        }
    }
}
