package com.example.sceneswitcher;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene2Controller {
    @FXML
    Button btnSwitch1;

    @FXML
    public void switchToScene1() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("scene1-view.fxml"));
        Stage stage = (Stage) btnSwitch1.getScene().getWindow();  //Pulls in the details of the current stage using the location of the button
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Scene One");
        stage.setScene(scene);
        stage.show();
    }
}