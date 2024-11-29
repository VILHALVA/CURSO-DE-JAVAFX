package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando um Label
        javafx.scene.control.Label label = new javafx.scene.control.Label("Texto sobre a imagem");
        label.setFont(new Font("Arial", 24));

        // Criando a imagem e adicionando ao ImageView
        Image image = new Image("https://via.placeholder.com/600x400.png");
        ImageView imageView = new ImageView(image);

        // Criando o Button
        Button button = new Button("Clique aqui para mudar o texto");
        button.setOnAction(event -> label.setText("Texto alterado após o clique"));

        // Criando o StackPane e adicionando a imagem, o label e o botão
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(imageView, label, button);  // Ordem importa

        // Alinhando o label no centro da tela
        StackPane.setAlignment(label, javafx.geometry.Pos.CENTER);
        StackPane.setAlignment(button, javafx.geometry.Pos.BOTTOM_CENTER);

        // Criando a cena
        Scene scene = new Scene(stackPane, 600, 400);

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo de StackPane com Imagem e Texto");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
