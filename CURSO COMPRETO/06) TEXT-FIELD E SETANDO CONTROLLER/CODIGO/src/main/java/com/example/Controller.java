package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField textField;  // Referência para o TextField do FXML
    
    @FXML
    private Label label;  // Referência para o Label do FXML

    // Método chamado quando o botão é clicado
    @FXML
    private void handleButtonAction() {
        // Recupera o texto digitado no TextField
        String userInput = textField.getText();
        
        // Define o texto do Label para o que foi digitado
        label.setText("Você digitou: " + userInput);
        
        // Limpa o TextField após clicar
        textField.clear();
    }
}
