package main.java;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start");
        try {
            BorderPane root = new BorderPane();
            Scene scene = new Scene(root, 400, 400);
            stage.setScene(scene);
            stage.show();

            GenerateMap map = new GenerateMap();
            map.printBackend();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
