# RADIOBUTTON
O **RadioButton** no JavaFX é um componente de interface gráfica que permite ao usuário selecionar apenas uma opção dentro de um grupo de opções. Ele é muito utilizado quando você quer limitar o usuário a escolher apenas uma entre várias opções possíveis, como em formulários com várias escolhas. O comportamento de um **RadioButton** dentro de um **ToggleGroup** garante que apenas um item do grupo esteja selecionado por vez.

Aqui está um exemplo simples de como usar **RadioButton** no JavaFX, onde o usuário pode escolher uma das várias opções, e a opção selecionada será exibida em um **Label** quando um botão for pressionado.

## Estrutura do Projeto:
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
Neste arquivo FXML, vamos criar um grupo de **RadioButton** e um **Button** que, ao ser pressionado, exibirá a opção selecionada em um **Label**.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.RadioButton?>
<?import javafx.scene.layout.StackPane?>
<?import javafx.scene.control.ToggleGroup?>

<StackPane xmlns:fx="http://javafx.com/fxml" fx:controller="com.example.Controller">
    <!-- Criando um ToggleGroup para garantir que apenas uma opção será selecionada -->
    <ToggleGroup fx:id="toggleGroup" />
    
    <!-- RadioButtons dentro do ToggleGroup -->
    <RadioButton fx:id="radioButton1" text="Opção 1" toggleGroup="$toggleGroup"/>
    <RadioButton fx:id="radioButton2" text="Opção 2" toggleGroup="$toggleGroup"/>
    <RadioButton fx:id="radioButton3" text="Opção 3" toggleGroup="$toggleGroup"/>
    
    <!-- Botão que vai exibir a opção selecionada -->
    <Button text="Mostrar Opção Selecionada" onAction="#handleButtonAction" />
    
    <!-- Label que exibirá a opção selecionada -->
    <Label fx:id="label" text="A opção selecionada aparecerá aqui!" />
</StackPane>
```

## Explicação:
- **ToggleGroup**: Usado para agrupar os **RadioButton**. Ele garante que apenas um **RadioButton** estará selecionado por vez dentro do grupo.
- **RadioButton**: Cada **RadioButton** pertence ao **ToggleGroup** e tem um texto que será exibido para o usuário.
- **Button**: O botão, quando pressionado, chama o método **handleButtonAction()** para exibir a opção selecionada.
- **Label**: O **Label** será atualizado com a opção selecionada.

## 2. **Controlador (Controller.java)**
No controlador, vamos capturar a opção selecionada no **RadioButton** e exibi-la no **Label**.

```java
package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML
    private RadioButton radioButton1;  // Referência para o RadioButton 1
    @FXML
    private RadioButton radioButton2;  // Referência para o RadioButton 2
    @FXML
    private RadioButton radioButton3;  // Referência para o RadioButton 3
    @FXML
    private Label label;               // Referência para o Label
    @FXML
    private ToggleGroup toggleGroup;   // Referência para o ToggleGroup

    // Método chamado quando o botão é pressionado
    @FXML
    private void handleButtonAction() {
        // Verificando qual RadioButton está selecionado
        RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
        
        if (selectedRadioButton != null) {
            // Exibe a opção selecionada no Label
            label.setText("Você selecionou: " + selectedRadioButton.getText());
        } else {
            label.setText("Nenhuma opção selecionada.");
        }
    }
}
```

## Explicação:
- **`toggleGroup.getSelectedToggle()`**: O método **`getSelectedToggle()`** retorna o **Toggle** selecionado no grupo. Esse **Toggle** pode ser um **RadioButton**.
- **`(RadioButton) selectedToggle`**: O **Toggle** retornado é convertido para um **RadioButton** para podermos acessar seu texto e exibi-lo no **Label**.
- **`selectedRadioButton.getText()`**: Este método retorna o texto associado ao **RadioButton** selecionado.

Se o usuário não selecionar nenhuma opção, o **Label** exibirá a mensagem **"Nenhuma opção selecionada."**

## 3. **Arquivo Principal (MainApp.java)**
Aqui, o **MainApp.java** carrega o layout **FXML** e inicia a aplicação.

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

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo com RadioButton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

## 4. **Resultado Esperado**:
- O **ToggleGroup** agrupa os três **RadioButtons**, e garante que apenas um **RadioButton** possa ser selecionado por vez.
- O **Button**, quando pressionado, exibe no **Label** a opção selecionada.
- Se nenhum **RadioButton** for selecionado, o **Label** exibirá uma mensagem dizendo que nenhuma opção foi selecionada.

## **Explicação Completa sobre RadioButton e ToggleGroup**:
1. **RadioButton**: O **RadioButton** representa uma opção dentro de um grupo. Você pode adicionar o **RadioButton** a um **ToggleGroup** para garantir que apenas uma opção será selecionada por vez dentro desse grupo.
2. **ToggleGroup**: O **ToggleGroup** é um grupo de **Toggle** (no caso, **RadioButton**). Ele garante que apenas um **RadioButton** será selecionado por vez dentro do grupo.
   - Ao adicionar os **RadioButton** a um **ToggleGroup**, o comportamento de seleção é automaticamente gerenciado. Isso significa que, ao selecionar um, os outros são desmarcados.
   
3. **getSelectedToggle()**: Esse método retorna o **Toggle** (no caso, o **RadioButton**) que está atualmente selecionado no **ToggleGroup**. Você pode então usar o método **getText()** para obter o texto associado ao **RadioButton** selecionado.

4. **Múltiplos RadioButtons**: Você pode criar quantos **RadioButtons** precisar dentro de um **ToggleGroup**. O JavaFX automaticamente gerencia a seleção de apenas um de cada vez.

## **Usando um Listener para mudanças de seleção:**
Você também pode adicionar um **Listener** diretamente ao **ToggleGroup** para detectar quando o usuário muda a seleção.

```java
@FXML
private void initialize() {
    // Adicionando um Listener ao ToggleGroup
    toggleGroup.selectedToggleProperty().addListener((observable, oldToggle, newToggle) -> {
        if (newToggle != null) {
            RadioButton selectedRadioButton = (RadioButton) newToggle;
            System.out.println("Você selecionou: " + selectedRadioButton.getText());
        }
    });
}
```

## **Resumo**:
- **RadioButton** é usado para representar opções de escolha onde apenas uma pode ser selecionada dentro de um grupo.
- **ToggleGroup** agrupa os **RadioButton** e garante que apenas um esteja selecionado por vez.
- O método **getSelectedToggle()** permite obter a opção selecionada e realizar ações com base nisso.

