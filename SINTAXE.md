# SINTAXE:
1. **Botões Simples**
Neste exemplo, vamos criar uma janela com vários botões, onde ao clicar em cada um deles, uma mensagem será exibida no console.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando dois botões
        Button btn1 = new Button("Clique aqui para Olá");
        btn1.setOnAction(e -> System.out.println("Olá, você clicou no botão 1!"));

        Button btn2 = new Button("Clique aqui para Adeus");
        btn2.setOnAction(e -> System.out.println("Adeus, você clicou no botão 2!"));

        // Layout de pilha para os botões
        StackPane root = new StackPane();
        root.getChildren().addAll(btn1, btn2);  // Adicionando os botões na mesma pilha

        // Criando a cena
        Scene scene = new Scene(root, 300, 200);

        // Configurando a janela
        primaryStage.setTitle("Exemplo de Botões");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Inicia a aplicação
    }
}
```

2. **Botões com Layout Grid**
Aqui, criamos uma janela com um layout **Grid** (Grade) onde os botões são dispostos em uma grade de 2x2.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridButtonExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando botões
        Button btn1 = new Button("Botão 1");
        Button btn2 = new Button("Botão 2");
        Button btn3 = new Button("Botão 3");
        Button btn4 = new Button("Botão 4");

        // Criando o layout Grid
        GridPane grid = new GridPane();
        grid.setHgap(10); // Espaçamento horizontal
        grid.setVgap(10); // Espaçamento vertical

        // Colocando os botões na grade
        grid.add(btn1, 0, 0);  // Linha 0, Coluna 0
        grid.add(btn2, 1, 0);  // Linha 0, Coluna 1
        grid.add(btn3, 0, 1);  // Linha 1, Coluna 0
        grid.add(btn4, 1, 1);  // Linha 1, Coluna 1

        // Criando a cena
        Scene scene = new Scene(grid, 300, 200);

        // Configurando a janela
        primaryStage.setTitle("Botões em Grid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Inicia a aplicação
    }
}
```

3. **Janela com Caixa de Texto e Botão**
Agora vamos criar uma janela com uma **caixa de texto** e um **botão**. O usuário digita algo na caixa e, ao clicar no botão, o texto é exibido no console.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TextFieldButtonExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando uma caixa de texto
        TextField textField = new TextField();
        textField.setPromptText("Digite algo aqui");

        // Criando um botão
        Button btn = new Button("Mostrar Texto");
        btn.setOnAction(e -> System.out.println("Texto digitado: " + textField.getText()));

        // Layout de pilha
        StackPane root = new StackPane();
        root.getChildren().addAll(textField, btn);

        // Criando a cena
        Scene scene = new Scene(root, 300, 200);

        // Configurando a janela
        primaryStage.setTitle("Caixa de Texto e Botão");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Inicia a aplicação
    }
}
```

4. **Janela com Labels e Botões**
Neste exemplo, vamos criar uma janela onde um **label** exibe um texto, e um **botão** muda o texto do **label** quando clicado.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LabelButtonExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando um Label
        Label label = new Label("Texto inicial");

        // Criando um botão
        Button btn = new Button("Mudar Texto");
        btn.setOnAction(e -> label.setText("Texto alterado!"));

        // Layout de pilha
        StackPane root = new StackPane();
        root.getChildren().addAll(label, btn);

        // Criando a cena
        Scene scene = new Scene(root, 300, 200);

        // Configurando a janela
        primaryStage.setTitle("Label e Botão");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Inicia a aplicação
    }
}
```

5. **Janela com Menu**
Neste exemplo, vamos adicionar um **menu** à nossa aplicação. O menu tem itens, e ao clicar em um item do menu, uma ação é executada.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MenuExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando um Menu
        Menu fileMenu = new Menu("Arquivo");
        MenuItem openItem = new MenuItem("Abrir");
        openItem.setOnAction(e -> System.out.println("Abrir clicado"));
        MenuItem saveItem = new MenuItem("Salvar");
        saveItem.setOnAction(e -> System.out.println("Salvar clicado"));

        fileMenu.getItems().addAll(openItem, saveItem);

        // Criando uma barra de menu
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(fileMenu);

        // Layout de pilha
        StackPane root = new StackPane();
        root.getChildren().add(menuBar);

        // Criando a cena
        Scene scene = new Scene(root, 300, 200);

        // Configurando a janela
        primaryStage.setTitle("Menu Exemplo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Inicia a aplicação
    }
}
```

6. **Janela com Caixa de Seleção (Checkbox)**
Aqui, vamos criar uma janela com uma **caixa de seleção (Checkbox)**. Ao selecionar ou desmarcar a caixa, uma mensagem será exibida.

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CheckBoxExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando uma caixa de seleção
        CheckBox checkBox = new CheckBox("Aceito os termos");
        checkBox.setOnAction(e -> {
            if (checkBox.isSelected()) {
                System.out.println("Termos aceitos!");
            } else {
                System.out.println("Termos não aceitos!");
            }
        });

        // Layout de pilha
        StackPane root = new StackPane();
        root.getChildren().add(checkBox);

        // Criando a cena
        Scene scene = new Scene(root, 300, 200);

        // Configurando a janela
        primaryStage.setTitle("Checkbox Exemplo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Inicia a aplicação
    }
}
```

---

