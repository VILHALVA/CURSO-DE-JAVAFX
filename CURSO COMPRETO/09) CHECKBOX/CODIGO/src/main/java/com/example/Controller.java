package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private CheckBox checkBox1;  // Referência para o CheckBox 1
    @FXML
    private CheckBox checkBox2;  // Referência para o CheckBox 2
    @FXML
    private CheckBox checkBox3;  // Referência para o CheckBox 3
    @FXML
    private Label label;         // Referência para o Label

    // Método chamado quando o botão é clicado
    @FXML
    private void handleButtonAction() {
        // Verificando o estado de cada CheckBox
        StringBuilder selections = new StringBuilder("Opções selecionadas: ");
        
        if (checkBox1.isSelected()) {
            selections.append("Opção 1 ");
        }
        if (checkBox2.isSelected()) {
            selections.append("Opção 2 ");
        }
        if (checkBox3.isSelected()) {
            selections.append("Opção 3 ");
        }
        
        if (selections.length() == 23) { // Se nenhuma opção foi selecionada
            selections.append("Nenhuma opção selecionada.");
        }

        // Atualizando o Label com as opções selecionadas
        label.setText(selections.toString());
    }

    @FXML
    private void initialize() {
        // Adicionando um Listener ao CheckBox 1
        checkBox1.setOnAction(event -> {
            if (checkBox1.isSelected()) {
                System.out.println("Opção 1 foi selecionada");
            } else {
                System.out.println("Opção 1 foi desmarcada");
            }
        });
    }
}
