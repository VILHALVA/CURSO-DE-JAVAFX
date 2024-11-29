# ALERT (CAIXA DE DIALOGO)
No **JavaFX**, o **Alert** é uma caixa de diálogo que você pode usar para exibir mensagens ao usuário, como notificações, erros, ou confirmações. Ele é parte da biblioteca `javafx.scene.control` e facilita a interação com o usuário, mostrando informações de forma clara e simples.

## Tipos de **Alert**:
1. **INFORMATION**: Para exibir informações ao usuário.
2. **WARNING**: Para alertar o usuário sobre algo que pode ser importante.
3. **CONFIRMATION**: Para solicitar uma confirmação do usuário (sim ou não).
4. **ERROR**: Para exibir mensagens de erro.
5. **NONE**: Não exibe um ícone, útil quando você só quer exibir uma mensagem sem nenhum tipo de ícone.

## Características:
- O **Alert** possui um título, uma mensagem e, dependendo do tipo, botões de ação (como "Ok", "Sim", "Não").
- Pode ser utilizado para interações simples como confirmação de uma ação ou para exibir informações ao usuário.
  
## Exemplo de Uso de **Alert**
Vamos criar um exemplo simples em JavaFX que mostra como usar diferentes tipos de **Alert**: **Information**, **Warning**, **Confirmation** e **Error**.

### Estrutura do Projeto:
```
src
 └── com
      └── example
           ├── MainApp.java
```

### 1. **MainApp.java**
```java
package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Botão para mostrar o Alert de Informação
        Button infoButton = new Button("Mostrar Informação");
        infoButton.setOnAction(e -> showInformationAlert());

        // Botão para mostrar o Alert de Aviso
        Button warningButton = new Button("Mostrar Aviso");
        warningButton.setOnAction(e -> showWarningAlert());

        // Botão para mostrar o Alert de Confirmação
        Button confirmButton = new Button("Mostrar Confirmação");
        confirmButton.setOnAction(e -> showConfirmationAlert());

        // Botão para mostrar o Alert de Erro
        Button errorButton = new Button("Mostrar Erro");
        errorButton.setOnAction(e -> showErrorAlert());

        // Criando a cena
        javafx.scene.layout.VBox vbox = new javafx.scene.layout.VBox(10, infoButton, warningButton, confirmButton, errorButton);
        vbox.setStyle("-fx-padding: 20px;");

        Scene scene = new Scene(vbox, 300, 200);

        // Configurando o palco
        primaryStage.setTitle("Exemplo de Alert");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Função para mostrar o Alert de Informação
    private void showInformationAlert() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Informação");
        alert.setHeaderText("Cabeçalho de Informação");
        alert.setContentText("Este é um alerta informativo.");
        alert.showAndWait();
    }

    // Função para mostrar o Alert de Aviso
    private void showWarningAlert() {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Aviso");
        alert.setHeaderText("Cabeçalho de Aviso");
        alert.setContentText("Este é um alerta de aviso.");
        alert.showAndWait();
    }

    // Função para mostrar o Alert de Confirmação
    private void showConfirmationAlert() {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmação");
        alert.setHeaderText("Cabeçalho de Confirmação");
        alert.setContentText("Você tem certeza que deseja continuar?");
        alert.showAndWait();
    }

    // Função para mostrar o Alert de Erro
    private void showErrorAlert() {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Erro");
        alert.setHeaderText("Cabeçalho de Erro");
        alert.setContentText("Ocorreu um erro inesperado.");
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Explicação do código:
1. **Criação de Botões**: Temos quatro botões que, quando clicados, disparam diferentes tipos de **Alert**.
   
2. **Alert Types**:
   - **AlertType.INFORMATION**: Exibe um alerta informativo com título, cabeçalho e uma mensagem.
   - **AlertType.WARNING**: Exibe um alerta com ícone de aviso e uma mensagem.
   - **AlertType.CONFIRMATION**: Exibe um alerta de confirmação com botões "Sim" e "Não" (ou outros, dependendo da implementação). Quando o usuário interage com ele, você pode verificar a resposta.
   - **AlertType.ERROR**: Exibe um alerta com ícone de erro e uma mensagem indicando algum problema.

3. **Método `showAndWait()`**: Esse método exibe o alerta e espera que o usuário interaja com ele (fechando a janela ou clicando nos botões).

4. **Estilo da interface**: Utilizamos um `VBox` para organizar os botões verticalmente e configurar um estilo simples com o método `setStyle()`.

### 2. **Resultado Esperado**:
Quando você executar o programa, verá uma janela com 4 botões:

- **Mostrar Informação**: Exibe um alerta de informação.
- **Mostrar Aviso**: Exibe um alerta de aviso.
- **Mostrar Confirmação**: Exibe um alerta de confirmação com as opções "Sim" e "Não".
- **Mostrar Erro**: Exibe um alerta de erro.

### 3. **Confirmação no Alert**:
Se você escolher o tipo **CONFIRMATION**, o usuário terá opções para confirmar ou cancelar a ação. Podemos verificar a resposta do usuário utilizando o código:

```java
Optional<ButtonType> result = alert.showAndWait();
if (result.get() == ButtonType.OK) {
    System.out.println("Usuário clicou em OK");
} else {
    System.out.println("Usuário clicou em Cancelar");
}
```

No exemplo acima, **showAndWait()** retorna um **Optional<ButtonType>**, e você pode verificar qual botão foi pressionado.

### 4. **Rodando o Projeto**:
1. **Criar o Projeto**: Abra o seu IDE (NetBeans, Eclipse, IntelliJ, etc.) e crie um novo projeto JavaFX.
2. **Estrutura do Código**: Adicione o código **MainApp.java**.
3. **Rodar**: Execute o programa, clique nos botões e veja os alertas sendo exibidos.

## Resumo:
O **Alert** em JavaFX é uma maneira fácil e eficaz de exibir mensagens ao usuário. Ele oferece diferentes tipos de alerta (informação, erro, confirmação e aviso), e pode ser utilizado para melhorar a interação e comunicação com o usuário em sua aplicação.