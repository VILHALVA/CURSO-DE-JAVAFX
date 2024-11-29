package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando os componentes para as diferentes regiões do BorderPane
        Label label = new Label("Texto Central");
        label.setFont(new Font("Arial", 24));

        Button topButton = new Button("Botão Top");
        Button bottomButton = new Button("Botão Bottom");
        Button leftButton = new Button("Botão Left");
        Button rightButton = new Button("Botão Right");
        
        // Adicionando eventos aos botões
        topButton.setOnAction(e -> System.out.println("Clique no Botão Top"));
        bottomButton.setOnAction(e -> System.out.println("Clique no Botão Bottom"));
        leftButton.setOnAction(e -> System.out.println("Clique no Botão Left"));
        rightButton.setOnAction(e -> System.out.println("Clique no Botão Right"));

        // Criando o BorderPane
        BorderPane borderPane = new BorderPane();
        
        // Colocando os componentes nas regiões
        borderPane.setTop(topButton);
        borderPane.setBottom(bottomButton);
        borderPane.setLeft(leftButton);
        borderPane.setRight(rightButton);
        borderPane.setCenter(label);  // A região central recebe o Label

        // Criando a cena
        Scene scene = new Scene(borderPane, 400, 300);

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo de BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
