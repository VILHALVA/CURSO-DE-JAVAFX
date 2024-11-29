# HBOX E VBOX
No **JavaFX**, os layouts **HBox** e **VBox** são containers usados para organizar outros componentes (como **Buttons**, **Labels**, **TextFields**, etc.) em uma direção específica: horizontalmente (no caso do **HBox**) ou verticalmente (no caso do **VBox**). Esses layouts são muito úteis para organizar sua interface de maneira simples e eficiente.

Vamos explorar os dois com exemplos práticos.

## 1. **HBox (Horizontal Box)**
**HBox** organiza seus filhos (componentes) em uma linha horizontal, ou seja, um componente ao lado do outro.

### Exemplo de uso do HBox:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.layout.HBox?>
<?import javafx.scene.text.Text?>

<HBox xmlns:fx="http://javafx.com/fxml" fx:controller="com.example.Controller" spacing="10" alignment="center">
    <!-- Adicionando alguns botões e texto dentro do HBox -->
    <Button text="Botão 1"/>
    <Button text="Botão 2"/>
    <Text text="Texto no meio"/>
    <Button text="Botão 3"/>
</HBox>
```

## Explicação do código:
- **HBox**: É o layout que vai organizar os elementos horizontalmente.
- **spacing**: Define o espaço entre os componentes.
- **alignment**: Define o alinhamento dos componentes dentro do **HBox**. O valor **center** alinha os itens no centro da caixa.
  
Com este layout, os botões e o texto serão dispostos horizontalmente, com um pequeno espaço de **10px** entre eles.

## 2. **VBox (Vertical Box)**
**VBox** organiza seus filhos (componentes) em uma coluna vertical, ou seja, um componente embaixo do outro.

### Exemplo de uso do VBox:
```xml
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.layout.VBox?>
<?import javafx.scene.text.Text?>

<VBox xmlns:fx="http://javafx.com/fxml" fx:controller="com.example.Controller" spacing="10" alignment="center">
    <!-- Adicionando alguns botões e texto dentro do VBox -->
    <Button text="Botão 1"/>
    <Button text="Botão 2"/>
    <Text text="Texto no meio"/>
    <Button text="Botão 3"/>
</VBox>
```

## Explicação do código:
- **VBox**: Este layout organiza os itens verticalmente.
- **spacing**: Espaço entre os componentes (neste caso, 10px entre os itens).
- **alignment**: Alinha os itens dentro do **VBox**, no exemplo usamos **center** para centralizar os elementos.

Neste caso, os componentes serão dispostos um abaixo do outro.

## 3. **Usando HBox e VBox no Código Java**
Além de usar o FXML, você também pode criar e configurar **HBox** e **VBox** diretamente no código Java.

### Exemplo com HBox em código Java:
```java
package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando HBox
        HBox hbox = new HBox(10);  // Espaçamento de 10px entre os componentes
        hbox.setStyle("-fx-alignment: center;"); // Alinhamento no centro

        // Adicionando botões ao HBox
        Button button1 = new Button("Botão 1");
        Button button2 = new Button("Botão 2");
        Button button3 = new Button("Botão 3");

        hbox.getChildren().addAll(button1, button2, button3);

        // Criando a cena
        Scene scene = new Scene(hbox, 300, 100);

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo com HBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Exemplo com VBox em código Java:
```java
package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando VBox
        VBox vbox = new VBox(10);  // Espaçamento de 10px entre os componentes
        vbox.setStyle("-fx-alignment: center;"); // Alinhamento no centro

        // Adicionando botões ao VBox
        Button button1 = new Button("Botão 1");
        Button button2 = new Button("Botão 2");
        Button button3 = new Button("Botão 3");

        vbox.getChildren().addAll(button1, button2, button3);

        // Criando a cena
        Scene scene = new Scene(vbox, 200, 150);

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo com VBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

## Explicação:
- **HBox(10)**: Aqui criamos um **HBox** com espaçamento de **10px** entre os componentes.
- **setStyle("-fx-alignment: center")**: Define o alinhamento dos componentes dentro do layout. No caso, os itens são centralizados.
- **getChildren().addAll()**: Adicionamos os componentes ao **HBox** ou **VBox**.

## 4. **Propriedades Comuns e Personalizações**
### **Espaçamento:**
Você pode controlar o **espaçamento** entre os filhos de **HBox** e **VBox** com a propriedade **spacing**. Além disso, você pode definir o alinhamento de itens com a propriedade **alignment**.

### **Alinhamento:**
- Para o **HBox** e **VBox**, o alinhamento dos filhos pode ser controlado com os seguintes valores:
  - **Posição Horizontal (para HBox)**: 
    - `Pos.CENTER` (centralizado)
    - `Pos.LEFT` (à esquerda)
    - `Pos.RIGHT` (à direita)
  - **Posição Vertical (para VBox)**:
    - `Pos.CENTER` (centralizado)
    - `Pos.TOP` (no topo)
    - `Pos.BOTTOM` (na parte inferior)

### **Exemplo de Alinhamento e Espaçamento**:
```java
HBox hbox = new HBox(20);  // Espaçamento de 20px
hbox.setAlignment(Pos.CENTER_RIGHT);  // Alinha os componentes à direita
```

Ou no **FXML**:
```xml
<HBox spacing="20" alignment="center_right">
    <Button text="Botão 1"/>
    <Button text="Botão 2"/>
</HBox>
```

## Resumo:
- **HBox** organiza os componentes **horizontalmente**.
- **VBox** organiza os componentes **verticalmente**.
- Você pode configurar **spacing** (espaçamento) e **alignment** (alinhamento) para personalizar a disposição dos elementos.
- Ambos os layouts podem ser usados tanto no **FXML** quanto no código **Java** diretamente.

