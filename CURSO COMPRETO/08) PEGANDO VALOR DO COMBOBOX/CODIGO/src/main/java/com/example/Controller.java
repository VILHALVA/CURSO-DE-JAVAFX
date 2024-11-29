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

    // Método chamado quando o botão é clicado
    @FXML
    private void handleButtonAction() {
        // Obtendo o valor selecionado no ComboBox
        String selectedFruit = comboBox.getValue();  // Usando getValue() para pegar o valor

        // Verificando se o usuário selecionou alguma fruta
        if (selectedFruit != null) {
            label.setText("Você selecionou: " + selectedFruit);  // Exibe a fruta no Label
        } else {
            label.setText("Nenhuma fruta selecionada.");  // Caso nenhum item tenha sido selecionado
        }
    }

    @FXML
    private void initialize() {
        // Populando o ComboBox com algumas frutas
        comboBox.getItems().addAll("Maçã", "Banana", "Laranja", "Uva", "Melancia");

        // Listener para capturar o item selecionado automaticamente
        comboBox.setOnAction(event -> {
            String selectedFruit = comboBox.getValue();  // Captura o valor selecionado
            label.setText("Você selecionou: " + selectedFruit);  // Exibe no Label
        });
    }
}
