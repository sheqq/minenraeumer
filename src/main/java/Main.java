package main.java;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start");
        GenerateMap map = new GenerateMap();

        map.printBackend();
    }
}
