package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Botão para mostrar o Alert de Informação
        Button infoButton = new Button("Mostrar Informação");
        infoButton.setOnAction(e -> showInformationAlert());

        // Botão para mostrar o Alert de Aviso
        Button warningButton = new Button("Mostrar Aviso");
        warningButton.setOnAction(e -> showWarningAlert());

        // Botão para mostrar o Alert de Confirmação
        Button confirmButton = new Button("Mostrar Confirmação");
        confirmButton.setOnAction(e -> showConfirmationAlert());

        // Botão para mostrar o Alert de Erro
        Button errorButton = new Button("Mostrar Erro");
        errorButton.setOnAction(e -> showErrorAlert());

        // Criando a cena
        javafx.scene.layout.VBox vbox = new javafx.scene.layout.VBox(10, infoButton, warningButton, confirmButton, errorButton);
        vbox.setStyle("-fx-padding: 20px;");

        Scene scene = new Scene(vbox, 300, 200);

        // Configurando o palco
        primaryStage.setTitle("Exemplo de Alert");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Função para mostrar o Alert de Informação
    private void showInformationAlert() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText("Cabeçalho de Informação");
        alert.setContentText("Este é um alerta informativo.");
        alert.showAndWait();
    }

    // Função para mostrar o Alert de Aviso
    private void showWarningAlert() {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Aviso");
        alert.setHeaderText("Cabeçalho de Aviso");
        alert.setContentText("Este é um alerta de aviso.");
        alert.showAndWait();
    }

    // Função para mostrar o Alert de Confirmação
    private void showConfirmationAlert() {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmação");
        alert.setHeaderText("Cabeçalho de Confirmação");
        alert.setContentText("Você tem certeza que deseja continuar?");
        alert.showAndWait();
    }

    // Função para mostrar o Alert de Erro
    private void showErrorAlert() {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Erro");
        alert.setHeaderText("Cabeçalho de Erro");
        alert.setContentText("Ocorreu um erro inesperado.");
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
