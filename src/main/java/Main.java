package main.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start");
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Frontend.fxml"));
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
