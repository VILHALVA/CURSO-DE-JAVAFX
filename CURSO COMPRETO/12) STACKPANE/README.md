# STACKPANE
O **StackPane** é um tipo de **Layout Manager** no JavaFX que organiza seus elementos (filhos) empilhando-os uns sobre os outros, ou seja, ele coloca os componentes de forma sobreposta. Isso é útil quando você quer criar interfaces onde os elementos podem se sobrepor, como em casos de imagens de fundo, sobreposições de texto ou botões flutuantes.

## Características do StackPane:
1. **Empilhamento**: Os elementos filhos são colocados uns sobre os outros, no centro do layout.
2. **Centralização**: Por padrão, todos os filhos dentro de um **StackPane** são centralizados.
3. **Controle de Camadas**: Você pode controlar a ordem em que os filhos são empilhados, dependendo de sua posição na lista de filhos do **StackPane**.

## Exemplo Simples com StackPane
A seguir, temos um exemplo simples de uso do **StackPane** em JavaFX, onde um **Label** será exibido sobre uma **ImageView**.

### Estrutura do Projeto:
```
src
 └── com
      └── example
           ├── MainApp.java
           └── style.css (opcional)
```

## 1. **MainApp.java**
Neste exemplo, criamos um **StackPane** com uma imagem de fundo (utilizando **ImageView**) e um **Label** que ficará sobre a imagem.

```java
package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando o Label
        Label label = new Label("Texto sobre a imagem");

        // Criando a imagem e adicionando ao ImageView
        Image image = new Image("https://example.com/path/to/your/image.jpg");
        ImageView imageView = new ImageView(image);
        
        // Criando o StackPane e adicionando os filhos
        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(imageView, label);  // A imagem fica abaixo e o label sobre ela

        // Criando a cena
        Scene scene = new Scene(stackPane, 600, 400);

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo de StackPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

## Explicação do código:
- **ImageView**: Usado para exibir uma imagem. Nesse exemplo, a imagem vem de uma URL (mas você pode usar um arquivo local também).
- **StackPane**: Um **StackPane** é criado e adicionado à cena. A imagem é colocada primeiro (ficando "embaixo"), e o **Label** é colocado depois, sobre a imagem.
- **stackPane.getChildren().addAll()**: Adiciona a imagem e o texto (label) ao **StackPane**. O **Label** ficará sobre a imagem porque foi adicionado depois na lista de filhos.

---

## 2. **Alinhamento no StackPane**
Por padrão, os filhos no **StackPane** são centralizados, mas você pode alterar o alinhamento de cada filho individualmente. Por exemplo, você pode alinhar o **Label** à parte inferior da imagem, ou qualquer outro lugar que desejar.

### Exemplo com Alinhamento Personalizado:
```java
package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pos;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando o Label
        Label label = new Label("Texto sobre a imagem");

        // Criando a imagem e adicionando ao ImageView
        Image image = new Image("https://example.com/path/to/your/image.jpg");
        ImageView imageView = new ImageView(image);
        
        // Criando o StackPane
        StackPane stackPane = new StackPane();
        
        // Alinhando o label ao centro inferior
        StackPane.setAlignment(label, Pos.BOTTOM_CENTER);

        // Adicionando a imagem e o label ao StackPane
        stackPane.getChildren().addAll(imageView, label);

        // Criando a cena
        Scene scene = new Scene(stackPane, 600, 400);

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo de StackPane com Alinhamento");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Explicação do alinhamento:
- **StackPane.setAlignment(label, Pos.BOTTOM_CENTER)**: Alinha o **Label** à parte inferior central do **StackPane**.
- **Pos.BOTTOM_CENTER** é uma constante que posiciona o elemento centralizado na parte inferior da área do **StackPane**. Existem outras opções de alinhamento, como `Pos.TOP_LEFT`, `Pos.CENTER_RIGHT`, etc.

## 3. **Usando StackPane com Vários Componentes**
Você pode adicionar quantos componentes quiser dentro de um **StackPane** e manipulá-los de acordo com o alinhamento desejado.

### Exemplo com Vários Componentes:
```java
package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando alguns botões
        Button button1 = new Button("Botão 1");
        Button button2 = new Button("Botão 2");

        // Criando o StackPane
        StackPane stackPane = new StackPane();
        
        // Adicionando botões ao StackPane
        stackPane.getChildren().addAll(button1, button2);
        
        // Alinhando o botão2 no canto inferior direito
        StackPane.setAlignment(button2, Pos.BOTTOM_RIGHT);
        
        // Criando a cena
        Scene scene = new Scene(stackPane, 300, 250);

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo de StackPane com Vários Componentes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Explicação:
- Os **Botões** são adicionados ao **StackPane**.
- O **StackPane.setAlignment()** é usado para alinhar o **button2** no canto inferior direito.

## Resumo:
- **StackPane** empilha os componentes uns sobre os outros, permitindo criar layouts onde os elementos se sobrepõem.
- Os filhos dentro de um **StackPane** são centralizados por padrão, mas você pode alterar seu alinhamento usando **StackPane.setAlignment()**.
- **StackPane** é útil para situações como sobreposições de texto, imagens ou quando você deseja uma interface mais dinâmica.

