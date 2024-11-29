# LISTVIEW
O **ListView** no **JavaFX** é um controle de interface gráfica que exibe uma lista de itens. Ele é ideal para mostrar dados em uma interface de usuário, como uma lista de itens que o usuário pode selecionar, editar ou interagir de alguma maneira.

## Características do **ListView**:
1. **Exibição de Dados**: Permite exibir uma lista de dados como texto, imagens ou outros objetos.
2. **Seleção de Itens**: Os itens podem ser selecionados, e você pode configurar múltiplas seleções ou seleção única.
3. **Scroll**: Suporta rolagem automaticamente se a lista contiver mais itens do que o espaço disponível para exibição.
4. **Customização**: É possível personalizar a maneira como os itens são exibidos, alterando a célula de cada item.

## Tipos de ListView:
- **ListView simples**: Exibe uma lista de strings ou outros objetos.
- **ListView com células customizadas**: Permite a personalização da maneira como os itens são apresentados, como adicionar imagens, ícones ou outros controles dentro de cada célula da lista.

## Uso Comum:
- Exibição de listas de itens.
- Seleção de um ou mais itens em uma lista.
- Criação de menus ou listas de opções.

## Exemplo Básico de **ListView**:
Vamos criar um exemplo simples com um **ListView**, onde o usuário pode selecionar um item e ver qual item foi selecionado.

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
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando o ListView
        ListView<String> listView = new ListView<>();

        // Adicionando itens ao ListView
        listView.getItems().addAll("Item 1", "Item 2", "Item 3", "Item 4", "Item 5");

        // Criando um botão que exibirá o item selecionado no ListView
        Button showButton = new Button("Mostrar Item Selecionado");

        showButton.setOnAction(e -> {
            String selectedItem = listView.getSelectionModel().getSelectedItem();
            if (selectedItem != null) {
                showAlert("Item Selecionado", "Você selecionou: " + selectedItem);
            } else {
                showAlert("Erro", "Nenhum item selecionado!");
            }
        });

        // Organizando o layout
        VBox vbox = new VBox(10, listView, showButton);
        vbox.setStyle("-fx-padding: 20px;");

        // Criando a cena
        Scene scene = new Scene(vbox, 300, 250);

        // Configurando o palco
        primaryStage.setTitle("Exemplo de ListView");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Função para exibir alertas
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

### Explicação do código:
1. **ListView**:
   - Criamos um **ListView<String>** onde adicionamos cinco itens de exemplo (strings).
   - Usamos o método `getItems().addAll()` para adicionar múltiplos itens ao **ListView** de uma vez.

2. **Seleção de Itens**:
   - O **ListView** possui um **SelectionModel** que pode ser usado para pegar o item selecionado. Quando o usuário clica no botão "Mostrar Item Selecionado", verificamos o item selecionado usando `getSelectionModel().getSelectedItem()`.
   - Caso o usuário não selecione nenhum item, mostramos uma mensagem de erro.

3. **Botão e Alerta**:
   - Criamos um botão que, ao ser pressionado, verifica qual item foi selecionado no **ListView** e exibe um alerta com a seleção.
   - O alerta é exibido usando o método `showAlert()`, que mostra uma mensagem ao usuário usando um **Alert** do tipo **INFORMATION**.

4. **VBox**:
   - O layout **VBox** é usado para organizar o **ListView** e o botão verticalmente, com um espaçamento de 10 pixels entre os elementos.

### 2. **Resultado Esperado**:
Quando você executar o programa, verá uma janela com os seguintes elementos:
- Um **ListView** com cinco itens: "Item 1", "Item 2", "Item 3", "Item 4", "Item 5".
- Um **Botão** "Mostrar Item Selecionado".
- Se você selecionar um item da lista e clicar no botão, um **Alerta de Informação** aparecerá, mostrando o item selecionado.
- Se você não selecionar nenhum item e clicar no botão, aparecerá um alerta de erro informando que nenhum item foi selecionado.

### 3. **Personalizando o ListView com Células Customizadas**:
É possível customizar como cada item do **ListView** é exibido. Isso é feito através de **cell factories**. Aqui está um exemplo simples de como exibir o texto em negrito:

```java
listView.setCellFactory(param -> {
    return new javafx.scene.control.ListCell<String>() {
        @Override
        protected void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            if (empty) {
                setText(null);
            } else {
                setText(item);
                setStyle("-fx-font-weight: bold;");  // Faz o texto ficar em negrito
            }
        }
    };
});
```

- O método `setCellFactory()` define como os itens serão exibidos.
- Dentro da **ListCell**, você pode definir propriedades como **cor do texto**, **tamanho da fonte**, **ícones**, etc.

### 4. **Rodando o Projeto**:
1. **Criar o Projeto**: Abra o seu IDE (NetBeans, Eclipse, IntelliJ, etc.) e crie um novo projeto JavaFX.
2. **Estrutura do Código**: Adicione o código **MainApp.java**.
3. **Rodar**: Execute o programa, interaja com a lista e veja os itens sendo exibidos e selecionados.

## Resumo:
O **ListView** em **JavaFX** é um controle altamente útil para mostrar listas de dados. Ele permite que você exiba informações de forma estruturada e interaja com o usuário, capturando a seleção de itens. Ele também pode ser altamente customizado, tanto na forma de exibição quanto na interação com o usuário, sendo uma ferramenta poderosa para interfaces complexas.

