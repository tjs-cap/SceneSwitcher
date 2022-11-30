package com.example.sceneswitcher;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {

    @FXML
    Button btnSwitch2;

    @FXML
    public void switchToScene2() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("scene2-view.fxml"));
        Stage stage = (Stage) btnSwitch2.getScene().getWindow();  //Pulls in the details of the current stage using the location of the button
        Scene scene = new Scene(fxmlLoader.load(), 400, 200);
        stage.setTitle("Scene Two");
        stage.setScene(scene);
        stage.show();
    }
}