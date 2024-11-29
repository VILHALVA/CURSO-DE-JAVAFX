package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando o ListView
        ListView<String> listView = new ListView<>();

        // Adicionando itens ao ListView
        listView.getItems().addAll("Item 1", "Item 2", "Item 3", "Item 4", "Item 5");

        // Criando um botão que exibirá o item selecionado no ListView
        Button showButton = new Button("Mostrar Item Selecionado");

        showButton.setOnAction(e -> {
            String selectedItem = listView.getSelectionModel().getSelectedItem();
            if (selectedItem != null) {
                showAlert("Item Selecionado", "Você selecionou: " + selectedItem);
            } else {
                showAlert("Erro", "Nenhum item selecionado!");
            }
        });

        // Organizando o layout
        VBox vbox = new VBox(10, listView, showButton);
        vbox.setStyle("-fx-padding: 20px;");

        // Criando a cena
        Scene scene = new Scene(vbox, 300, 250);

        // Configurando o palco
        primaryStage.setTitle("Exemplo de ListView");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Função para exibir alertas
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
