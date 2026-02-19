package main;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private void handleButtonClick() {
        label.setText("Bäm! Der Agent hat's erkannt!");
    }
}