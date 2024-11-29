# BORDERPANE
O **BorderPane** é um layout manager muito utilizado no **JavaFX**. Ele divide a área de exibição em cinco regiões principais: **Top**, **Left**, **Center**, **Right**, e **Bottom**. Isso permite que você organize os elementos de forma flexível dentro dessas regiões, ajudando a criar interfaces de usuário bem estruturadas.

## Características do **BorderPane**:
1. **Top**: Fica no topo da tela.
2. **Bottom**: Fica na parte inferior da tela.
3. **Left**: Fica na parte esquerda da tela.
4. **Right**: Fica na parte direita da tela.
5. **Center**: Ocupa o restante da tela (área central).

## Vantagens:
- **Organização clara**: Ideal para layouts mais estruturados, onde você deseja manter diferentes componentes em diferentes áreas da tela.
- **Flexível**: A região central pode crescer ou encolher dependendo do espaço disponível, enquanto as regiões laterais (Top, Bottom, Left, Right) mantêm suas dimensões fixas ou podem ser redimensionadas conforme a necessidade.

## Exemplo de Projeto com **BorderPane**
Aqui está um exemplo simples de um projeto em JavaFX que utiliza o **BorderPane** para organizar uma interface com diferentes componentes nas regiões do layout.

### Estrutura do Projeto:
```
src
 └── com
      └── example
           ├── MainApp.java
           └── style.css (opcional)
```

### 1. **MainApp.java**
```java
package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando os componentes para as diferentes regiões do BorderPane
        Label label = new Label("Texto Central");
        label.setFont(new Font("Arial", 24));

        Button topButton = new Button("Botão Top");
        Button bottomButton = new Button("Botão Bottom");
        Button leftButton = new Button("Botão Left");
        Button rightButton = new Button("Botão Right");
        
        // Adicionando eventos aos botões
        topButton.setOnAction(e -> System.out.println("Clique no Botão Top"));
        bottomButton.setOnAction(e -> System.out.println("Clique no Botão Bottom"));
        leftButton.setOnAction(e -> System.out.println("Clique no Botão Left"));
        rightButton.setOnAction(e -> System.out.println("Clique no Botão Right"));

        // Criando o BorderPane
        BorderPane borderPane = new BorderPane();
        
        // Colocando os componentes nas regiões
        borderPane.setTop(topButton);
        borderPane.setBottom(bottomButton);
        borderPane.setLeft(leftButton);
        borderPane.setRight(rightButton);
        borderPane.setCenter(label);  // A região central recebe o Label

        // Criando a cena
        Scene scene = new Scene(borderPane, 400, 300);

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo de BorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Explicação do código:
- **BorderPane**: Este layout organiza os componentes em cinco regiões principais.
  - **setTop(topButton)**: O **Button** é colocado na região superior (Top).
  - **setBottom(bottomButton)**: O **Button** é colocado na região inferior (Bottom).
  - **setLeft(leftButton)**: O **Button** é colocado na região esquerda (Left).
  - **setRight(rightButton)**: O **Button** é colocado na região direita (Right).
  - **setCenter(label)**: O **Label** é colocado na região central (Center).
  
- **Eventos**: Ao clicar nos botões, o texto correspondente é impresso no console.

### 2. **Resultado Esperado**:
- A interface será dividida em cinco áreas:
  - **Top**: Um **Button** exibido no topo da tela.
  - **Bottom**: Um **Button** exibido na parte inferior da tela.
  - **Left**: Um **Button** exibido na parte esquerda da tela.
  - **Right**: Um **Button** exibido na parte direita da tela.
  - **Center**: Um **Label** exibido no centro da tela.

- Quando você clicar em qualquer um dos botões, uma mensagem será impressa no console, indicando qual botão foi pressionado.

### 3. **Rodando o Projeto**:
Para rodar o projeto:

1. **Criar o Projeto**: Abra o seu IDE (NetBeans, Eclipse, IntelliJ, etc.) e crie um novo projeto JavaFX.
2. **Estrutura do Código**: Adicione o código **MainApp.java**.
3. **Rodar**: Execute o programa e você verá a interface com os cinco componentes distribuídos nas regiões correspondentes do **BorderPane**.

### Personalizações:
- **Redimensionamento**: O **Center** pode crescer ou encolher de acordo com o espaço disponível, enquanto as regiões de **Top**, **Bottom**, **Left**, e **Right** têm um comportamento fixo.
- **Alinhamento**: Se você quiser alterar o alinhamento de um componente dentro de uma das regiões, você pode usar o método `setAlignment()`.

### Exemplo com Alinhamento:
```java
import javafx.geometry.Pos;
borderPane.setAlignment(label, Pos.CENTER);  // Alinha o Label no centro da região Central
```

Você pode ajustar o alinhamento e o tamanho dos componentes de acordo com a necessidade do seu layout.

## Resumo:
- O **BorderPane** é excelente para layouts que precisam de uma estrutura de divisão clara, como barras de navegação (topo), rodapés (bottom), barras laterais (left, right) e conteúdo central.
- Este layout é útil quando você precisa de uma interface que exiba elementos fixos ao redor de uma área central flexível.

