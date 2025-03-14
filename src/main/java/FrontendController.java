package main.java;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

public class FrontendController {


    GenerateMap map = new GenerateMap();


    @FXML
    private Button myButton; // Injected button

    @FXML
    public void click(ActionEvent event) {

        // Get the button that was clicked
        Button clickedButton = (Button) event.getSource();

        // Get the button ID (like "b23" for row 2, column 3)
        String buttonId = clickedButton.getId();

        // Extract row and column indices from the button ID
        int row = Character.getNumericValue(buttonId.charAt(1));
        int col = Character.getNumericValue(buttonId.charAt(2));

        // Now you can use row and col in your game logic
        System.out.println("Button clicked at row " + row + ", column " + col);

        // Your game logic here...

        if(map.getField(row,col).isBomb()) {
            clickedButton.setBackground(Background.fill(Color.BLACK));
        } else {
            clickedButton.setText(String.valueOf(map.getField(row, col).getBombsSurrounded()));
        }
    }



}
