# COMBOBOX
O **ComboBox** é um componente do JavaFX que permite ao usuário selecionar uma opção de uma lista suspensa de itens. Ele é útil quando você deseja apresentar várias opções para o usuário, mas quer economizar espaço na interface gráfica.

Vamos ver um exemplo simples de como usar o **ComboBox** no JavaFX, e como você pode manipular os itens selecionados pelo usuário.

## **Exemplo de uso do ComboBox:**
O exemplo abaixo cria um **ComboBox** onde o usuário pode selecionar um item de uma lista predefinida. O texto selecionado será exibido em um **Label** quando o botão for pressionado.

## **Estrutura do Projeto:**
```
src
 └── com
      └── example
           ├── MainApp.java
           ├── Controller.java
           ├── MainApp.fxml
           └── style.css (opcional)
```

## **1. Arquivo FXML (MainApp.fxml)**
Neste arquivo FXML, criamos um **ComboBox**, **Label** e **Button**. O **ComboBox** irá exibir opções de frutas, e o **Label** exibirá a fruta selecionada quando o botão for clicado.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ComboBox?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.StackPane?>

<StackPane xmlns:fx="http://javafx.com/fxml" fx:controller="com.example.Controller">
    <ComboBox fx:id="comboBox" promptText="Escolha uma fruta" />
    <Button text="Mostrar Fruta Selecionada" onAction="#handleButtonAction" />
    <Label fx:id="label" text="Fruta selecionada aparecerá aqui!" />
</StackPane>
```

- **ComboBox**: Usado para exibir as opções para o usuário.
- **Button**: Ao clicar, a fruta selecionada será exibida no **Label**.
- **Label**: Exibe a fruta selecionada.

## **2. Controlador (Controller.java)**
Neste controlador, o método `handleButtonAction` será responsável por capturar a seleção feita no **ComboBox** e exibir no **Label**.

```java
package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ComboBox<String> comboBox;  // Referência para o ComboBox

    @FXML
    private Label label;  // Referência para o Label

    @FXML
    private void initialize() {
        // Populando o ComboBox com algumas frutas
        comboBox.getItems().addAll("Maçã", "Banana", "Laranja", "Uva", "Melancia");
    }

    // Método que é chamado quando o botão é clicado
    @FXML
    private void handleButtonAction() {
        // Obtendo o item selecionado no ComboBox
        String selectedFruit = comboBox.getValue();
        
        if (selectedFruit != null) {
            // Exibindo a fruta selecionada no Label
            label.setText("Você selecionou: " + selectedFruit);
        } else {
            label.setText("Nenhuma fruta selecionada.");
        }
    }
}
```

## **Explicação do código:**
1. **ComboBox**: O **ComboBox** é referenciado por meio da anotação **@FXML** e populado com algumas frutas na inicialização (método **initialize()**). A lista de frutas é adicionada utilizando o método `getItems().addAll()`.
2. **Botão**: O método `handleButtonAction()` é chamado quando o botão é pressionado. Ele captura o valor selecionado no **ComboBox** usando o método `getValue()`.
3. **Label**: O **Label** é atualizado com o nome da fruta selecionada. Se nenhuma fruta for selecionada, ele exibe uma mensagem padrão.

## **3. Arquivo Principal (MainApp.java)**
Este arquivo carrega o layout **FXML** e inicia a aplicação. Ele também aplica o arquivo **CSS** se você decidir usá-lo.

```java
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
```

- O arquivo **FXML** é carregado através do **FXMLLoader**.
- O **CSS** (opcional) é adicionado à cena, caso você tenha um arquivo de estilo.

## **4. Estilo CSS (style.css) [opcional]**
Se você quiser adicionar um estilo visual ao seu aplicativo, pode criar um arquivo **CSS** para personalizar os componentes.

```css
.combo-box {
    -fx-font-size: 14px;
    -fx-padding: 10px;
}

.button {
    -fx-background-color: #4CAF50;
    -fx-text-fill: white;
    -fx-font-size: 14px;
    -fx-padding: 10px;
}

.label {
    -fx-font-size: 16px;
    -fx-text-fill: #333;
}
```

Se você adicionar esse arquivo **CSS**, ele será aplicado à sua interface.

## **Resultado Esperado:**
1. A interface exibirá:
   - Um **ComboBox** contendo opções de frutas.
   - Um **Button** que, ao ser clicado, exibirá no **Label** a fruta selecionada.
   - O **Label** exibirá a fruta selecionada ou uma mensagem dizendo que nenhuma opção foi escolhida.

## **Resumo:**
- **ComboBox**: Exibe uma lista suspensa de itens para o usuário escolher.
- **getValue()**: Recupera o item selecionado.
- **Label**: Exibe o item selecionado ao pressionar o **Button**.
- O código de estilo **CSS** é opcional, mas pode ser usado para estilizar os componentes visuais.
