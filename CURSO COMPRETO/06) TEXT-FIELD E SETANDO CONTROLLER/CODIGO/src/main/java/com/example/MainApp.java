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
        StackPane root = loader.load();  // Carrega o layout do FXML

        // Criando a cena (scene) com o layout (root)
        Scene scene = new Scene(root, 300, 250);

        // Adicionando o arquivo CSS para estilizar a cena
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo com TextField e Controller");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
