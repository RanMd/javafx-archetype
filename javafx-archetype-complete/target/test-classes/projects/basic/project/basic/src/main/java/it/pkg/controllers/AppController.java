package it.pkg.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AppController {

    @FXML
    private Button primaryButton;

    @FXML
    private void printMensaje(ActionEvent event) {
        System.out.println("¡Hola mundo!");
    }
}
