package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Der Pfad muss zum resources-Ordner passen
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main/scene.fxml"));
        Parent root = loader.load();
        
        stage.setScene(new Scene(root, 400, 200));
        stage.setTitle("JavaFX FXML Native");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}