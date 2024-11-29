package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ComboBox<String> comboBox;  // Referência para o ComboBox

    @FXML
    private Label label;  // Referência para o Label

    @FXML
    private void initialize() {
        // Populando o ComboBox com algumas frutas
        comboBox.getItems().addAll("Maçã", "Banana", "Laranja", "Uva", "Melancia");
    }

    // Método que é chamado quando o botão é clicado
    @FXML
    private void handleButtonAction() {
        // Obtendo o item selecionado no ComboBox
        String selectedFruit = comboBox.getValue();
        
        if (selectedFruit != null) {
            // Exibindo a fruta selecionada no Label
            label.setText("Você selecionou: " + selectedFruit);
        } else {
            label.setText("Nenhuma fruta selecionada.");
        }
    }
}
