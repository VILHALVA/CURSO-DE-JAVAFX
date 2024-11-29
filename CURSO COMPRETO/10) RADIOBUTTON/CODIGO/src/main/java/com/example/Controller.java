package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML
    private RadioButton radioButton1;  // Referência para o RadioButton 1
    @FXML
    private RadioButton radioButton2;  // Referência para o RadioButton 2
    @FXML
    private RadioButton radioButton3;  // Referência para o RadioButton 3
    @FXML
    private Label label;               // Referência para o Label
    @FXML
    private ToggleGroup toggleGroup;   // Referência para o ToggleGroup

    // Método chamado quando o botão é pressionado
    @FXML
    private void handleButtonAction() {
        // Verificando qual RadioButton está selecionado
        RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
        
        if (selectedRadioButton != null) {
            // Exibe a opção selecionada no Label
            label.setText("Você selecionou: " + selectedRadioButton.getText());
        } else {
            label.setText("Nenhuma opção selecionada.");
        }
    }

    @FXML
    private void initialize() {
        // Adicionando um Listener ao ToggleGroup
        toggleGroup.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
            if (newToggle != null) {
                RadioButton selectedRadioButton = (RadioButton) newToggle;
                System.out.println("Você selecionou: " + selectedRadioButton.getText());
            }
        });
    }
}
