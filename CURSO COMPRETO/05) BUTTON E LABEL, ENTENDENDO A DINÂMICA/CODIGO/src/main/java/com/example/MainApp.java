package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando o Label para exibir o texto
        Label label = new Label("Texto Inicial");

        // Criando o botão
        Button btn = new Button("Clique Aqui");

        // Configurando a ação do botão
        btn.setOnAction(event -> label.setText("Texto Alterado"));

        // Criando o layout (StackPane) e adicionando o botão e o label
        StackPane root = new StackPane();
        root.getChildren().addAll(label, btn);

        // Organizando o layout para o label ficar acima do botão
        StackPane.setAlignment(label, javafx.geometry.Pos.CENTER);
        StackPane.setAlignment(btn, javafx.geometry.Pos.BOTTOM_CENTER);

        // Criando a cena e configurando o palco
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Exemplo JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
