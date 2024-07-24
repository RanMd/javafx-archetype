#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.controllers;

import java.io.IOException;
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
