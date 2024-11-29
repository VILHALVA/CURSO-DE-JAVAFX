# GRIDPANE
O **GridPane** é um layout manager no **JavaFX** que organiza os componentes em uma grade, com várias linhas e colunas. Ele é bastante útil quando você precisa posicionar elementos de maneira tabular, como formulários, tabelas de dados ou qualquer outra interface que precise de um arranjo estruturado em linhas e colunas.

## Características do **GridPane**:
1. **Linhas e Colunas**: O **GridPane** organiza os elementos em uma grade, onde você pode definir o número de linhas e colunas.
2. **Posicionamento**: Você pode adicionar os filhos nas células específicas da grade, e pode controlar o alinhamento e o espaçamento entre eles.
3. **Espaçamento**: O **GridPane** permite configurar o espaçamento entre as células (tanto horizontal quanto vertical).

## Vantagens:
- **Organização eficiente**: Ideal para formulários, tabelas ou qualquer tipo de layout que exija uma estrutura de linhas e colunas.
- **Controle de alinhamento**: Você pode definir alinhamento para cada célula, oferecendo flexibilidade para posicionar os componentes.
- **Facilidade de personalização**: O **GridPane** permite ajustar o tamanho de cada célula e o alinhamento de forma simples.

## Exemplo de Projeto com **GridPane**
Vamos criar um exemplo simples com o **GridPane**, onde montamos um pequeno formulário com campos de texto e botões.

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
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando o GridPane
        GridPane grid = new GridPane();
        
        // Configurando o espaçamento entre as células
        grid.setHgap(10);  // Espaço horizontal
        grid.setVgap(10);  // Espaço vertical
        grid.setPadding(new Insets(20, 20, 20, 20));  // Preenchimento interno da grade

        // Criando os componentes
        Label nameLabel = new Label("Nome:");
        TextField nameField = new TextField();
        
        Label emailLabel = new Label("E-mail:");
        TextField emailField = new TextField();
        
        Button submitButton = new Button("Enviar");

        // Adicionando os componentes no GridPane
        grid.add(nameLabel, 0, 0);  // Adiciona o label "Nome" na linha 0, coluna 0
        grid.add(nameField, 1, 0);  // Adiciona o campo de texto do nome na linha 0, coluna 1
        
        grid.add(emailLabel, 0, 1);  // Adiciona o label "E-mail" na linha 1, coluna 0
        grid.add(emailField, 1, 1);  // Adiciona o campo de texto do e-mail na linha 1, coluna 1
        
        grid.add(submitButton, 1, 2);  // Adiciona o botão de envio na linha 2, coluna 1

        // Configurando alinhamento para o botão
        GridPane.setHalignment(submitButton, Pos.RIGHT);  // Alinha o botão à direita da célula

        // Criando a cena
        Scene scene = new Scene(grid, 400, 300);

        // Configurando o palco (primaryStage)
        primaryStage.setTitle("Exemplo de GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Explicação do código:
- **GridPane**: O layout **GridPane** é usado para organizar os componentes. É criado e configurado com espaçamento horizontal (`setHgap`) e vertical (`setVgap`), e um preenchimento interno (`setPadding`).
  
- **Componentes**:
  - **Label**: Cria rótulos para os campos (Nome e E-mail).
  - **TextField**: Campos de texto onde o usuário pode inserir dados.
  - **Button**: Um botão de envio.

- **Adicionando Componentes**:
  - Usamos o método `grid.add()` para adicionar os componentes nas células do **GridPane**. O primeiro argumento é o componente, o segundo é a coluna e o terceiro é a linha.
  
- **Alinhamento**:
  - O botão é alinhado à direita na célula da linha 2 e coluna 1 usando `GridPane.setHalignment()`.
  
- **Configuração da Cena**:
  - A cena é criada com o **GridPane** como root, e o palco é configurado com essa cena.

### 2. **Resultado Esperado**:
Quando você executar o programa, verá um pequeno formulário organizado em duas linhas e duas colunas:

- **Linha 0**: O **Label** "Nome" e o **TextField** para inserir o nome.
- **Linha 1**: O **Label** "E-mail" e o **TextField** para inserir o e-mail.
- **Linha 2**: O **Button** "Enviar", alinhado à direita.

Você pode preencher os campos e clicar no botão, e, embora o exemplo atual não tenha lógica para processar os dados, você pode adicionar isso facilmente no futuro.

### 3. **Rodando o Projeto**:
1. **Criar o Projeto**: Abra o seu IDE (NetBeans, Eclipse, IntelliJ, etc.) e crie um novo projeto JavaFX.
2. **Estrutura do Código**: Adicione o código **MainApp.java**.
3. **Rodar**: Execute o programa e você verá o formulário com os campos de nome e e-mail, além do botão.

### Personalizações:
- **Espaçamento e Paddings**: Você pode ajustar o espaçamento entre as células (horizontal e vertical) e o preenchimento interno de todo o **GridPane**.
- **Alinhamento**: O **GridPane** oferece métodos como `setHalignment()`, `setValignment()` e `setRowIndex()` para ajustar o alinhamento de componentes dentro da grade.
- **Colunas e Linhas**: Você pode configurar o número de linhas e colunas do **GridPane**, adicionar colunas de tamanho fixo ou proporcional, ou mesmo usar **RowConstraints** e **ColumnConstraints** para um controle mais avançado.

### Exemplo com **RowConstraints** e **ColumnConstraints**:
```java
// Definindo as larguras das colunas
ColumnConstraints column1 = new ColumnConstraints();
column1.setPercentWidth(50);  // Coluna 1 ocupa 50% da largura
grid.getColumnConstraints().add(column1);

// Definindo o comportamento das linhas
RowConstraints row1 = new RowConstraints();
row1.setMinHeight(40);  // Linha 1 terá altura mínima de 40px
grid.getRowConstraints().add(row1);
```

## Resumo:
O **GridPane** é uma ótima escolha quando você precisa de um layout baseado em linhas e colunas, como em formulários, tabelas e interfaces complexas. Ele oferece flexibilidade para posicionar e alinhar componentes dentro da grade.
