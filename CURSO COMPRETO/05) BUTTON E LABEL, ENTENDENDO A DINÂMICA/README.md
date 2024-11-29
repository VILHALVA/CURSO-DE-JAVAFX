# BUTTON E LABEL, ENTENDENDO A DINÂMICA
Em **JavaFX**, **Button** (botão) e **Label** (rótulo) são dois dos componentes gráficos mais usados em uma interface. Aqui está uma explicação detalhada sobre como **Button** e **Label** funcionam, suas propriedades e como interagem em uma aplicação JavaFX.

## **1. Button (Botão)**
O **Button** é um componente interativo que permite ao usuário realizar ações quando clicado. Ele pode ser configurado para acionar eventos, como a execução de métodos ou a mudança de valores, quando clicado.

### **Características do Button:**
- **Texto e Imagem**: Pode exibir texto, imagens ou ambos.
- **Eventos de Ação**: Pode ser associado a eventos como `onAction`, que define o que acontece quando o botão é pressionado.
- **Estilos**: Pode ser estilizado com **CSS** para mudar a aparência (cor, borda, tamanho, etc.).

### **Exemplo básico de Button em JavaFX**:
```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Criando um botão
        Button btn = new Button("Clique Aqui");

        // Associando um evento de clique ao botão
        btn.setOnAction(event -> System.out.println("Botão clicado!"));

        // Criando o layout e adicionando o botão
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Criando a cena e configurando o palco
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Exemplo de Button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

## **2. Label (Rótulo)**
O **Label** é um componente de texto que exibe informações na interface, mas não é interativo como o **Button**. Ele é usado para mostrar dados, mensagens ou descrições, sem a necessidade de interação do usuário. 

### **Características do Label**:
- **Texto Estático**: O texto exibido é geralmente fixo e não pode ser alterado diretamente pelo usuário.
- **Estilos**: Pode ser estilizado com **CSS** e pode ter características como **fontes**, **cores** e **alinhamento**.

### **Exemplo básico de Label em JavaFX**:
```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LabelExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Criando um label
        Label label = new Label("Olá, Mundo!");

        // Criando o layout e adicionando o label
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Criando a cena e configurando o palco
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Exemplo de Label");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

## **3. Dinâmica entre Button e Label**
A interação entre o **Button** e o **Label** é uma das interações mais comuns em JavaFX. Por exemplo, você pode querer que o **Label** mostre uma mensagem ou altere seu texto quando o **Button** for pressionado.

### **Exemplo: Alterar o texto do Label ao clicar no Button**:

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonLabelExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Criando o label
        Label label = new Label("Texto Inicial");

        // Criando o botão
        Button btn = new Button("Clique Aqui");

        // Evento do botão para mudar o texto do label
        btn.setOnAction(event -> label.setText("Texto Alterado"));

        // Criando o layout e adicionando o botão e o label
        StackPane root = new StackPane();
        root.getChildren().addAll(label, btn);

        // Organizando o layout para o label ficar acima do botão
        StackPane.setAlignment(label, javafx.geometry.Pos.CENTER);
        StackPane.setAlignment(btn, javafx.geometry.Pos.BOTTOM_CENTER);

        // Criando a cena e configurando o palco
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Exemplo Button e Label");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

## **Explicação do Exemplo**:
1. **Botão** (`Button`): Quando o botão é clicado, ele aciona um evento que altera o texto do **Label**.
2. **Label** (`Label`): Exibe o texto que inicialmente é "Texto Inicial" e depois muda para "Texto Alterado" quando o botão é pressionado.
3. **Posicionamento**: Usamos o `StackPane` para empilhar o **Label** e o **Button**. O `StackPane.setAlignment()` define a posição relativa dos elementos dentro do layout.

## **4. Estilizando Button e Label com CSS**
O JavaFX permite estilizar facilmente o **Button** e o **Label** usando **CSS**. Aqui está um exemplo de como estilizar os componentes:

### **Exemplo de CSS (style.css)**:
```css
.button {
    -fx-background-color: #4CAF50;
    -fx-text-fill: white;
    -fx-font-size: 16px;
    -fx-padding: 10px 20px;
}

.label {
    -fx-font-size: 18px;
    -fx-text-fill: #333333;
    -fx-font-family: "Arial";
}
```

### **Aplicando o CSS no Código Java**:
No código Java, você pode carregar o arquivo CSS da seguinte forma:

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonLabelExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Criando o label
        Label label = new Label("Texto Inicial");

        // Criando o botão
        Button btn = new Button("Clique Aqui");

        // Evento do botão para mudar o texto do label
        btn.setOnAction(event -> label.setText("Texto Alterado"));

        // Criando o layout e adicionando o botão e o label
        StackPane root = new StackPane();
        root.getChildren().addAll(label, btn);

        // Organizando o layout para o label ficar acima do botão
        StackPane.setAlignment(label, javafx.geometry.Pos.CENTER);
        StackPane.setAlignment(btn, javafx.geometry.Pos.BOTTOM_CENTER);

        // Criando a cena
        Scene scene = new Scene(root, 300, 200);
        
        // Aplicando o CSS
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        primaryStage.setTitle("Exemplo Button e Label com CSS");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

## **Resumo:**
- O **Button** é usado para capturar eventos de interação (como cliques), e o **Label** exibe texto ou informações.
- Você pode vincular a interação entre o **Button** e o **Label** facilmente, mudando o texto ou a aparência do **Label** quando o **Button** for pressionado.
- Ambos podem ser estilizados com **CSS** para alterar a aparência visual.

