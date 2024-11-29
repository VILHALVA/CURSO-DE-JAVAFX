# TEXT-FIELD E SETANDO CONTROLLER
No JavaFX, o **TextField** é um componente de entrada onde o usuário pode digitar texto. Junto com o **Controller**, você pode manipular a entrada do **TextField** e realizar ações baseadas nesse conteúdo.

Vamos criar um exemplo de um simples **TextField** onde o usuário pode digitar algo, e ao clicar em um botão, o texto digitado será exibido em um **Label**.

O exemplo será estruturado da seguinte forma:

1. **FXML** para criar a interface gráfica (arquivo de layout).
2. **Controller** para manipular a lógica (onde o código Java será).
3. **MainApp** para inicializar a aplicação e carregar o FXML.

### Passo a Passo
### **1. Estrutura do Projeto**
```
src
 └── com
      └── example
           ├── MainApp.java
           ├── Controller.java
           ├── MainApp.fxml
           └── style.css
```

---

### **2. Arquivo FXML (`MainApp.fxml`)**
O arquivo FXML define a interface gráfica com um **TextField**, **Button** e **Label**.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.StackPane?>
<?import javafx.scene.control.TextField?>

<StackPane xmlns:fx="http://javafx.com/fxml" fx:controller="com.example.Controller">
    <Label fx:id="label" text="Digite algo e clique no botão!" />
    <TextField fx:id="textField" promptText="Digite seu nome" />
    <Button text="Mostrar texto" onAction="#handleButtonAction" />
</StackPane>
```

- **TextField** com o ID `textField`, onde o usuário digitará o texto.
- **Label** com o ID `label`, que exibirá o texto digitado.
- **Button** com o método `handleButtonAction` que será executado ao clicar.

### **3. Controller (`Controller.java`)**
A classe **Controller** é responsável pela lógica da interface. Ela manipula os eventos, como o clique no **Button**, e lida com a interação com os componentes da interface, como o **TextField** e o **Label**.

```java
package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField textField;  // Referência para o TextField do FXML
    
    @FXML
    private Label label;  // Referência para o Label do FXML

    // Método chamado quando o botão é clicado
    @FXML
    private void handleButtonAction() {
        // Recupera o texto digitado no TextField
        String userInput = textField.getText();
        
        // Define o texto do Label para o que foi digitado
        label.setText("Você digitou: " + userInput);
        
        // Limpa o TextField após clicar
        textField.clear();
    }
}
```

- **@FXML** é usado para marcar os componentes que serão injetados pelo **FXML**.
- O método `handleButtonAction` é chamado quando o **Button** é clicado e usa o texto digitado no **TextField** para atualizar o **Label**.

### **4. MainApp (`MainApp.java`)**
A classe principal **MainApp** carrega o arquivo **FXML** e inicia a aplicação JavaFX.

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
        StackPane root = loader.load();

        // Criando a cena
        Scene scene = new Scene(root, 300, 250);

        // Configurando o palco
        primaryStage.setTitle("Exemplo com TextField e Controller");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

- A classe **FXMLLoader** carrega o arquivo FXML (`MainApp.fxml`).
- O **Controller** é automaticamente vinculado ao FXML e os componentes são injetados.

### **5. Estilizando com CSS (`style.css`)**
Se você deseja adicionar um pouco de estilo à interface, você pode usar um arquivo CSS.

Exemplo de um arquivo CSS simples:

```css
.label {
    -fx-font-size: 16px;
    -fx-text-fill: #333;
}

.text-field {
    -fx-font-size: 14px;
    -fx-padding: 10px;
}

.button {
    -fx-background-color: #4CAF50;
    -fx-text-fill: white;
    -fx-font-size: 14px;
    -fx-padding: 10px;
}
```

## **6. Aplicando o CSS no Código Java**
No código **MainApp.java**, você pode aplicar o arquivo **CSS** à cena:

```java
Scene scene = new Scene(root, 300, 250);
scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
```

## **7. Como Executar o Projeto**
1. **Configurar o Projeto**:
   - Crie um novo projeto **JavaFX** no **Eclipse** ou **NetBeans**.
   - Adicione os arquivos **MainApp.java**, **Controller.java**, **MainApp.fxml**, e **style.css**.
   
2. **Executar a Aplicação**:
   - Ao executar, você verá:
     - Um **TextField** para digitar um nome.
     - Um **Label** que inicialmente mostra uma mensagem de instrução.
     - Um **Button** que, ao ser clicado, altera o texto do **Label** para o que foi digitado no **TextField**.

## **Resultado Esperado**
- Quando o usuário digitar algo no **TextField** e clicar no **Button**, o **Label** será atualizado com a mensagem "Você digitou: [texto]".
- O **TextField** será limpo após o clique.

### **Resumo**
- O **TextField** é utilizado para obter entradas do usuário.
- O **Button** aciona a lógica no **Controller**.
- O **Label** exibe o resultado ou mensagem para o usuário.
- A comunicação entre a interface e a lógica é realizada através do **Controller**.

