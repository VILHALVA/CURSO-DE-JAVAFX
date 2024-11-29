# MANUAL
## 1. REQUISITOS:
Antes de começar, você precisa ter os seguintes itens instalados:

1. **Java Development Kit (JDK)** versão **11 ou superior**.
2. **IDE** para desenvolvimento, como **IntelliJ IDEA**, **Eclipse** ou **NetBeans**.

Se você ainda não tem o **JDK 11** ou superior instalado, faça o download do [JDK 11 ou superior aqui](https://adoptopenjdk.net/).

## 2. INSTALAÇÃO DO JAVAFX:
A partir do JDK 11, o **JavaFX** foi removido do JDK e se tornou um projeto separado. Então, você precisa instalá-lo manualmente.

### BAIXANDO O JAVAFX (OPENJFX):
1. **Baixar o JavaFX**:  
   Acesse o site oficial do **OpenJFX** [aqui](https://openjfx.io/) e faça o download da versão mais recente.
   
   - Escolha a versão apropriada para o seu sistema operacional (Windows, macOS, Linux).
   - Extraia o arquivo em um diretório no seu computador.

2. **Configuração do JavaFX no Projeto**:
   
   - Se estiver usando uma ferramenta de **gerenciamento de dependências** como **Maven** ou **Gradle**, basta adicionar as dependências do JavaFX no seu projeto (explicado mais abaixo).
   - Caso contrário, você precisará incluir o JavaFX manualmente na configuração do seu ambiente de desenvolvimento.

---

## 3. CONFIGURAÇÃO DO JAVAFX NA IDE:
### CONFIGURAÇÃO NO INTELLIJ IDEA:
1. **Criação de um Novo Projeto**:
   - Abra o **IntelliJ IDEA**.
   - Vá até **File > New > Project**.
   - Escolha **Java** (selecione a versão correta do JDK).
   - Marque **Create Project from Template** e escolha **Java Application**.
   - Clique em **Next** e depois **Finish**.

2. **Adicionar JavaFX ao Projeto**:
   - Vá até **File > Project Structure > Libraries**.
   - Clique em **+** (Adicionar) e selecione a pasta onde você extraiu o JavaFX.
   - Adicione o diretório **lib** do JavaFX.

3. **Configuração da VM**:
   - Vá até **Run > Edit Configurations**.
   - Em **VM Options**, adicione o seguinte comando:
     ```
     --module-path <caminho_para_o_javafx>\lib --add-modules javafx.controls,javafx.fxml
     ```
     - Substitua `<caminho_para_o_javafx>` pelo diretório onde você extraiu o JavaFX.

4. **Criar o Projeto**:
   - Agora você está pronto para criar seu primeiro projeto JavaFX!

### CONFIGURAÇÃO NO ECLIPSE:
1. **Criação de um Novo Projeto**:
   - Abra o **Eclipse**.
   - Vá até **File > New > Java Project**.
   - Crie um novo projeto Java com o nome desejado.

2. **Adicionar JavaFX ao Projeto**:
   - Clique com o botão direito no seu projeto e vá até **Properties > Java Build Path > Libraries > Add External JARs**.
   - Selecione a pasta **lib** do JavaFX que você extraiu e adicione os JARs.

3. **Configuração da VM**:
   - Vá até **Run > Run Configurations**.
   - Em **Arguments > VM arguments**, adicione:
     ```
     --module-path <caminho_para_o_javafx>\lib --add-modules javafx.controls,javafx.fxml
     ```
     - Substitua `<caminho_para_o_javafx>` pelo diretório onde você extraiu o JavaFX.

## 4. CRIANDO O PRIMEIRO PROJETO JAVAFX:
### ESTRUTURA BÁSICA DE UM PROJETO JAVAFX:
Vamos criar uma aplicação simples que exibe uma janela com um botão. Ao clicar no botão, uma mensagem será impressa no console.

1. **Código JavaFX Básico**:

Crie um arquivo Java com o nome `Main.java` no seu projeto e insira o seguinte código:

```java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Criando um botão
        Button btn = new Button("Clique Aqui!");
        btn.setOnAction(e -> System.out.println("Você clicou no botão!"));

        // Criando o layout e adicionando o botão
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Criando a cena
        Scene scene = new Scene(root, 300, 200);

        // Configurando o palco (janela)
        primaryStage.setTitle("Minha Primeira Aplicação JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Inicializa a aplicação
    }
}
```

### EXPLICAÇÃO DO CÓDIGO:
- **Application**: A classe principal de uma aplicação JavaFX deve estender a classe `Application` e sobrescrever o método `start()`.
- **Stage**: Representa a janela da aplicação.
- **Scene**: Representa o conteúdo visual da janela.
- **Button**: Um componente básico de interface. No exemplo, quando o botão é clicado, ele imprime uma mensagem no console.

## 5.EXECUTANDO O PROJETO:
Após configurar tudo corretamente, você pode **executar** seu projeto.

- **No IntelliJ IDEA**: Clique no botão verde de execução ou vá até **Run > Run 'Main'**.
- **No Eclipse**: Clique com o botão direito no arquivo `Main.java` e selecione **Run As > Java Application**.

Isso abrirá uma janela com um botão, e ao clicar no botão, a mensagem "Você clicou no botão!" será exibida no console.

## 6.USANDO FXML (OPCIONAL):
Se quiser separar a lógica da interface gráfica, pode usar **FXML** para descrever a interface de maneira declarativa.

1. **Criando o Arquivo FXML**:
   - Crie um arquivo chamado `app.fxml` no diretório de recursos do seu projeto com o seguinte conteúdo:

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>

   <?import javafx.scene.control.Button?>
   <?import javafx.scene.layout.StackPane?>

   <StackPane xmlns:fx="http://javafx.com/fxml" fx:controller="MainController">
       <Button text="Clique Aqui!" onAction="#handleButtonClick"/>
   </StackPane>
   ```

2. **Controller Java (MainController.java)**:
   Crie um arquivo Java chamado `MainController.java` que irá controlar o comportamento da interface descrita no FXML:

   ```java
   import javafx.event.ActionEvent;
   import javafx.fxml.FXML;

   public class MainController {
       @FXML
       private void handleButtonClick(ActionEvent event) {
           System.out.println("Você clicou no botão!");
       }
   }
   ```

3. **Alterando o Main.java para Usar FXML**:

   Modifique a classe `Main` para carregar o arquivo FXML:

   ```java
   import javafx.application.Application;
   import javafx.fxml.FXMLLoader;
   import javafx.scene.Scene;
   import javafx.scene.layout.StackPane;
   import javafx.stage.Stage;

   public class Main extends Application {

       @Override
       public void start(Stage primaryStage) throws Exception {
           // Carregando a interface FXML
           FXMLLoader loader = new FXMLLoader(getClass().getResource("app.fxml"));
           StackPane root = loader.load();

           // Criando a cena
           Scene scene = new Scene(root, 300, 200);

           // Configurando o palco (janela)
           primaryStage.setTitle("Minha Primeira Aplicação JavaFX");
           primaryStage.setScene(scene);
           primaryStage.show();
       }

       public static void main(String[] args) {
           launch(args);
       }
   }
   ```

---

## CRIANDO PROJETO COM O `MAVEN`:  
Se preferir não configurar uma IDE, você pode gerenciar e executar seu projeto diretamente com o `Maven`:

### PASSO 1: CONFIGURAR O AMBIENTE DE DESENVOLVIMENTO:
1. **Instalar o Maven:**
   - Baixe e instale o [Maven](https://maven.apache.org/download.cgi) em seu computador.
   - Adicione o Maven ao `PATH` para poder utilizá-lo no terminal.

2. **Verificar as instalações:**
   Abra o terminal (CMD ou PowerShell) e execute os seguintes comandos:
   ```bash
   java -version  # Verifica a versão do Java
   mvn -version  # Verifica a versão do Maven
   ```

### PASSO 2: CRIAR UM NOVO PROJETO COM MAVEN:
1. **Criar a estrutura do projeto:**
   Utilize o Maven para criar um projeto JavaFX. No terminal, execute o comando abaixo para criar o projeto:
   ```bash
   mvn archetype:generate -DgroupId=com.example -DartifactId=my-javafx-mainapp -DarchetypeArtifactId=maven-archetype-simple -DinteractiveMode=false
   ```

   Isso criará uma estrutura de projeto padrão. O comando acima cria um projeto simples com o Maven, mas você precisará adicionar as dependências do JavaFX e configurar algumas coisas.

2. **Estrutura do Projeto:**
   A estrutura do diretório do seu projeto será algo como:
   ```
   my-javafx-mainapp/
   ├── pom.xml
   ├── src/
   │   ├── main/
   │   │   ├── java/
   │   │   │   └── com/example/
   │   │   │       └── MainApp.java
   │  
   └── target/
   ```

### PASSO 3: ADICIONAR DEPENDÊNCIAS DO JAVAFX AO `POM.XML`:
Agora é hora de configurar seu projeto para suportar o JavaFX adicionando as dependências necessárias ao arquivo `pom.xml`.

1. **Abra o arquivo `pom.xml`:**  
   Utilize o editor de texto ou IDE de sua preferência.

2. **Substitua o conteúdo do `pom.xml` pela configuração abaixo:**  
   Essa configuração inclui as dependências do JavaFX e o plugin para facilitar o empacotamento e a execução do projeto.

   ```xml
   <project xmlns="http://maven.apache.org/POM/4.0.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
       <modelVersion>4.0.0</modelVersion>

       <groupId>com.example</groupId>
       <artifactId>my-javafx-app</artifactId>
       <version>1.0-SNAPSHOT</version>

       <dependencies>
           <!-- Dependências do JavaFX -->
           <dependency>
               <groupId>org.openjfx</groupId>
               <artifactId>javafx-controls</artifactId>
               <version>17.0.2</version>
           </dependency>
           <dependency>
               <groupId>org.openjfx</groupId>
               <artifactId>javafx-fxml</artifactId>
               <version>17.0.2</version>
           </dependency>
       </dependencies>

       <build>
           <plugins>
               <!-- Plugin para compilar o código -->
               <plugin>
                   <groupId>org.apache.maven.plugins</groupId>
                   <artifactId>maven-compiler-plugin</artifactId>
                   <version>3.8.1</version>
                   <configuration>
                       <source>17</source>
                       <target>17</target>
                       <encoding>UTF-8</encoding>
                   </configuration>
               </plugin>

               <!-- Plugin para rodar e empacotar o JavaFX -->
               <plugin>
                   <groupId>org.openjfx</groupId>
                   <artifactId>javafx-maven-plugin</artifactId>
                   <version>0.0.8</version>
                   <configuration>
                       <mainClass>com.example.MainApp</mainClass>
                   </configuration>
               </plugin>
           </plugins>
       </build>
   </project>
   ```

3. **Entenda o que foi configurado:**  
   - **Dependências do JavaFX:**
     - `javafx-controls`: Adiciona os controles básicos do JavaFX (botões, campos de texto, etc.).
     - `javafx-fxml`: Permite trabalhar com arquivos FXML para criar interfaces visuais.
   - **Plugin `javafx-maven-plugin`:** 
     - Facilita a execução e o empacotamento do aplicativo JavaFX.
     - Define a classe principal do aplicativo (`MainApp`).

### PASSO 4: CRIAR O ARQUIVO `MAINAPP.JAVA`:
No diretório `src/main/java/com/example/`, crie um arquivo chamado `MainApp.java`. Esse arquivo será a classe principal da sua aplicação JavaFX.

**Conteúdo do arquivo `MainApp.java`:**

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
        Button btn = new Button("Say 'Hello, World'");
        btn.setOnAction(event -> System.out.println("Hello, World"));

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("JAVAFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
```

**Explicação do código:**
- `Application`: É a classe base para qualquer aplicação JavaFX.
- `start()`: Método que define a interface gráfica da aplicação.
- `Button`: Um botão simples que, ao ser pressionado, imprime "Hello, World" no console.
- `StackPane`: Um layout que empilha os elementos (como o botão) em cima uns dos outros.

### PASSO 5: RODAR O PROJETO COM MAVEN:
Agora, você pode compilar e rodar o projeto com o Maven.

1. **Limpar e compilar o projeto:**

   No terminal, dentro da pasta do projeto, execute o seguinte comando para compilar o projeto:

   ```bash
   mvn clean install
   ```

2. **Rodar a aplicação:**

   Para rodar a aplicação, use o comando:

   ```bash
   mvn javafx:run
   ```

   Isso iniciará sua aplicação JavaFX e você verá uma janela com o botão "Say 'Hello, World'". Ao clicar no botão, a mensagem "Hello, World" será exibida no console.

---

## CONCLUSÃO:
Agora você tem um projeto básico de JavaFX funcionando. Para projetos mais avançados, você pode explorar recursos como animações, gráficos 2D/3D, integração com bancos de dados, e muito mais. Não se esqueça de usar o **FXML** para separar a lógica de programação do design da interface.