package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label label;  // Referência ao Label no FXML

    // Método para o primeiro botão
    @FXML
    private void handleButton1() {
        label.setText("Você clicou no Botão 1");
    }

    // Método para o segundo botão
    @FXML
    private void handleButton2() {
        label.setText("Você clicou no Botão 2");
    }
}
