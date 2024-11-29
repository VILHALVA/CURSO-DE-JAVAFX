# PEGANDO VALOR DO COMBOBOX
Para pegar o valor selecionado em um **ComboBox** no JavaFX, você utiliza o método **`getValue()`**. Esse método retorna o item que está atualmente selecionado no **ComboBox**. Caso não haja nenhum item selecionado, ele retornará **`null`**.

## Exemplo de como pegar o valor do **ComboBox**:
Vamos continuar com o exemplo anterior, onde temos um **ComboBox** com uma lista de frutas. Quando o usuário clica no botão, o valor selecionado no **ComboBox** será mostrado em um **Label**.

Aqui está o código detalhado:

## 1. **Arquivo FXML (MainApp.fxml)**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.ComboBox?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.StackPane?>

<StackPane xmlns:fx="http://javafx.com/fxml" fx:controller="com.example.Controller">
    <!-- ComboBox onde as frutas serão listadas -->
    <ComboBox fx:id="comboBox" promptText="Escolha uma fruta" />
    
    <!-- Botão para exibir a fruta selecionada -->
    <Button text="Mostrar Fruta Selecionada" onAction="#handleButtonAction" />
    
    <!-- Label que exibirá a fruta selecionada -->
    <Label fx:id="label" text="Fruta selecionada aparecerá aqui!" />
</StackPane>
```

## 2. **Controlador (Controller.java)**
No controlador, vamos pegar o valor selecionado no **ComboBox** e mostrar no **Label**. O método **`getValue()`** é utilizado para capturar o item selecionado.

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

    // Método chamado quando o botão é clicado
    @FXML
    private void handleButtonAction() {
        // Obtendo o valor selecionado no ComboBox
        String selectedFruit = comboBox.getValue();  // Usando getValue() para pegar o valor

        // Verificando se o usuário selecionou alguma fruta
        if (selectedFruit != null) {
            label.setText("Você selecionou: " + selectedFruit);  // Exibe a fruta no Label
        } else {
            label.setText("Nenhuma fruta selecionada.");  // Caso nenhum item tenha sido selecionado
        }
    }
}
```

## 3. **Como funciona o `getValue()`**
- O **`getValue()`** retorna o valor selecionado atualmente no **ComboBox**.
- **Se o ComboBox estiver vazio ou nenhum item for selecionado**, o **`getValue()`** retornará **`null`**.
  
No código acima, estamos verificando se o valor retornado não é **`null`** antes de atualizar o texto do **Label**. Se o valor for **`null`**, exibimos uma mensagem dizendo que nenhuma fruta foi selecionada.

## 4. **Explicação do Fluxo**:
- **ComboBox**: O **ComboBox** é preenchido com algumas opções de frutas na inicialização (`initialize()`).
- **Button**: Quando o usuário clica no **Button**, o método **`handleButtonAction()`** é chamado.
- **`getValue()`**: Dentro do método **`handleButtonAction()`**, usamos **`getValue()`** para obter o valor da fruta selecionada.
- **Label**: O valor retornado por **`getValue()`** é mostrado no **Label**. Se o valor for **`null`**, o texto exibido no **Label** é alterado para "Nenhuma fruta selecionada".

## 5. **Resultado Esperado**:
- O **ComboBox** será exibido com uma lista de frutas para o usuário selecionar.
- O **Button** ao ser pressionado capturará a fruta selecionada no **ComboBox** e exibirá no **Label**.

## **Caso com Ação ao Selecionar Itens no ComboBox:**
Além de pegar o valor do **ComboBox** quando um botão é pressionado, você também pode configurar um **Listener** para pegar o valor automaticamente quando o usuário selecionar algo no **ComboBox**.

Aqui está como adicionar um **Listener** para capturar as mudanças da seleção:

```java
@FXML
private void initialize() {
    // Populando o ComboBox com algumas frutas
    comboBox.getItems().addAll("Maçã", "Banana", "Laranja", "Uva", "Melancia");

    // Listener para capturar o item selecionado automaticamente
    comboBox.setOnAction(event -> {
        String selectedFruit = comboBox.getValue();  // Captura o valor selecionado
        label.setText("Você selecionou: " + selectedFruit);  // Exibe no Label
    });
}
```

- Aqui, o **Listener** é configurado usando **`setOnAction()`** no **ComboBox**.
- Toda vez que o usuário seleciona um item, o valor é capturado e exibido no **Label** sem precisar clicar no botão.

