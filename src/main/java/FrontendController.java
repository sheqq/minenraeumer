package main.java;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class FrontendController {

    @FXML
    private Button myButton; // Injected button

    @FXML
    public void click() {
        
        // Get the fx:id of the button
        String buttonId = myButton.getId();
        System.out.println("Button ID: " + buttonId);
    }



}
