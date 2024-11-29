# CHECKBOX
O **CheckBox** no JavaFX é um componente que permite ao usuário marcar ou desmarcar uma opção, representando um valor booleano (verdadeiro ou falso). Ele é muito usado quando você deseja oferecer várias opções independentes para o usuário escolher.

Vamos ver um exemplo de como usar o **CheckBox** no JavaFX. No exemplo, criaremos uma interface onde o usuário pode selecionar várias opções, e o status de cada **CheckBox** será mostrado em um **Label** quando um botão for pressionado.

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

## 1. **Arquivo FXML (MainApp.fxml)**
No **FXML**, criaremos três **CheckBoxes** e um **Button** que, quando clicado, irá exibir quais **CheckBoxes** estão selecionados em um **Label**.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.CheckBox?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.StackPane?>

<StackPane xmlns:fx="http://javafx.com/fxml" fx:controller="com.example.Controller">
    <!-- CheckBoxes -->
    <CheckBox fx:id="checkBox1" text="Opção 1" />
    <CheckBox fx:id="checkBox2" text="Opção 2" />
    <CheckBox fx:id="checkBox3" text="Opção 3" />
    
    <!-- Botão que exibe as opções selecionadas -->
    <Button text="Mostrar Seleções" onAction="#handleButtonAction" />
    
    <!-- Label que exibirá as seleções -->
    <Label fx:id="label" text="As seleções aparecerão aqui!" />
</StackPane>
```

Aqui, temos três **CheckBoxes** e um **Button**. Quando o botão é pressionado, o **Label** será atualizado com as opções selecionadas.

## 2. **Controlador (Controller.java)**
O controlador vai conter a lógica para capturar o estado de cada **CheckBox** e exibir quais estão marcados.

```java
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
}
```

## **Explicação do código**:
1. **CheckBox**: Cada **CheckBox** é referenciado com a anotação **`@FXML`**, permitindo que o JavaFX se conecte a eles no **FXML**.
2. **Método `handleButtonAction()`**: Este método é chamado quando o botão é pressionado. Ele verifica quais **CheckBoxes** estão marcados usando o método **`isSelected()`**.
   - Se o **CheckBox** estiver selecionado, ele adiciona o texto correspondente à opção.
   - Se nenhuma opção for selecionada, o texto "Nenhuma opção selecionada" é exibido.
3. **Atualizando o Label**: O **Label** é atualizado com as opções selecionadas após o clique no botão.

## 3. **Arquivo Principal (MainApp.java)**
O **MainApp.java** carrega o arquivo **FXML** e inicia o aplicativo.

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
        StackPane root = loader.load();  // Carrega o layout do FXML

        // Criando a cena (scene)
        Scene scene = new Scene(root, 300, 250);

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo com CheckBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

## **Resultado Esperado:**
- O **ComboBox** será exibido com as opções de frutas, e o **Label** será atualizado com o texto "Você selecionou: " seguido das opções selecionadas quando o botão for clicado.

## **Como funciona o CheckBox no JavaFX?**
1. **Criando o CheckBox**:
   - O **CheckBox** é criado e configurado no **FXML** ou no código Java. Você pode adicionar texto e definir seu estado inicial (marcado ou desmarcado).

2. **Verificando o estado do CheckBox**:
   - Para saber se um **CheckBox** foi selecionado, você pode usar o método **`isSelected()`**, que retorna **`true`** se o **CheckBox** estiver marcado e **`false`** caso contrário.

3. **Obtendo o estado do CheckBox**:
   - Quando o usuário interage com os **CheckBoxes**, o estado de seleção pode ser verificado no controlador, e você pode manipular o que acontece com base nesses valores (como atualizar um **Label**, por exemplo).

## **Exemplo com Listener de Ação:**
Além de capturar o estado do **CheckBox** ao pressionar o botão, você também pode adicionar um **Listener** diretamente ao **CheckBox** para realizar ações assim que o estado mudar (marcado ou desmarcado).

Exemplo:

```java
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

    // Adicionando Listeners para os outros CheckBoxes...
}
```

Este código imprime no console uma mensagem toda vez que o estado de **CheckBox 1** for alterado.

## **Resumo:**
- **CheckBox** permite que o usuário marque ou desmarque uma opção.
- Use **`isSelected()`** para verificar se o **CheckBox** está marcado.
- Você pode adicionar múltiplos **CheckBoxes** para que o usuário selecione várias opções.
- Você pode usar **Listeners** para capturar mudanças de estado imediatamente ou manipular a seleção ao clicar em um **Botão**.

