package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando o GridPane
        GridPane grid = new GridPane();
        
        // Configurando o espaçamento entre as células
        grid.setHgap(10);  // Espaço horizontal
        grid.setVgap(10);  // Espaço vertical
        grid.setPadding(new Insets(20, 20, 20, 20));  // Preenchimento interno da grade

        // Criando os componentes
        Label nameLabel = new Label("Nome:");
        TextField nameField = new TextField();
        
        Label emailLabel = new Label("E-mail:");
        TextField emailField = new TextField();
        
        Button submitButton = new Button("Enviar");

        // Adicionando os componentes no GridPane
        grid.add(nameLabel, 0, 0);  // Adiciona o label "Nome" na linha 0, coluna 0
        grid.add(nameField, 1, 0);  // Adiciona o campo de texto do nome na linha 0, coluna 1
        
        grid.add(emailLabel, 0, 1);  // Adiciona o label "E-mail" na linha 1, coluna 0
        grid.add(emailField, 1, 1);  // Adiciona o campo de texto do e-mail na linha 1, coluna 1
        
        grid.add(submitButton, 1, 2);  // Adiciona o botão de envio na linha 2, coluna 1

        // Configurando alinhamento para o botão
        GridPane.setHalignment(submitButton, Pos.RIGHT);  // Alinha o botão à direita da célula

        // Criando a cena
        Scene scene = new Scene(grid, 400, 300);

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo de GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
