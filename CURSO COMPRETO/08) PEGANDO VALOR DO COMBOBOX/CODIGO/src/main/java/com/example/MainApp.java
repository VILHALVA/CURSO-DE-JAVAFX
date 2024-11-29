package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carregando o arquivo FXML
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainApp.fxml"));
        StackPane root = loader.load();  // Carrega o layout

        // Criando a cena com o layout (root)
        Scene scene = new Scene(root, 300, 250);

        // Adicionando o arquivo CSS (opcional)
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo com ComboBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
