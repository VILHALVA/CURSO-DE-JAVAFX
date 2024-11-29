# CONFIGURANDO ECLIPSE
## **1. Baixar e Instalar o Scene Builder**
1. Acesse o site oficial da Gluon: [https://gluonhq.com/products/scene-builder/](https://gluonhq.com/products/scene-builder/).
2. Faça o download do instalador para o seu sistema operacional.
3. Instale o Scene Builder.

## **2. Instalar o Plugin e(fx)clipse no Eclipse**
O **e(fx)clipse** é um plugin que adiciona suporte para JavaFX no Eclipse.

1. **Abrir o Gerenciador de Plugins**:
   - Vá para o menu **Help > Eclipse Marketplace**.

2. **Procurar por e(fx)clipse**:
   - Na barra de busca, digite `e(fx)clipse`.
   - Clique em **Go**.

3. **Instalar o Plugin**:
   - Localize o **e(fx)clipse - IDE**.
   - Clique em **Install** e siga os passos para concluir a instalação.
   - Reinicie o Eclipse quando solicitado.

## **3. Configurar o Scene Builder no Eclipse**
1. **Abrir Preferências do Eclipse**:
   - Vá para o menu **Window > Preferences** (ou **Eclipse > Preferences** no macOS).

2. **Localizar a Configuração do JavaFX**:
   - No painel de configurações, expanda a seção **JavaFX**.

3. **Configurar o Caminho do Scene Builder**:
   - Na opção **Scene Builder executable**, clique em **Browse** e localize o executável do Scene Builder:
     - **Windows**: Geralmente está em `C:\Program Files\Scene Builder\SceneBuilder.exe`.
     - **macOS**: Geralmente em `/Applications/SceneBuilder.app`.
     - **Linux**: Pode estar em `/usr/local/bin`.

4. Clique em **Apply and Close** para salvar as configurações.

## **4. Criar e Editar Arquivos FXML**
1. **Criar um Arquivo FXML**:
   - Clique com o botão direito no seu projeto JavaFX no painel do Eclipse.
   - Vá em **New > Other > JavaFX > New FXML Document**.
   - Dê um nome ao arquivo (por exemplo, `Interface.fxml`) e clique em **Finish**.

2. **Abrir o Arquivo no Scene Builder**:
   - Clique com o botão direito no arquivo FXML criado.
   - Selecione **Open with > Scene Builder**.
   - O Scene Builder será aberto, e você poderá editar a interface graficamente.

### **5. Executar o Projeto**
1. Certifique-se de que a classe principal carrega o arquivo FXML corretamente:
   ```java
   import javafx.application.Application;
   import javafx.fxml.FXMLLoader;
   import javafx.scene.Parent;
   import javafx.scene.Scene;
   import javafx.stage.Stage;

   public class MainApp extends Application {
       @Override
       public void start(Stage primaryStage) throws Exception {
           Parent root = FXMLLoader.load(getClass().getResource("Interface.fxml"));
           primaryStage.setTitle("Exemplo JavaFX com Eclipse");
           primaryStage.setScene(new Scene(root));
           primaryStage.show();
       }

       public static void main(String[] args) {
           launch(args);
       }
   }
   ```

2. Execute a aplicação clicando no botão **Run** ou pressionando **Ctrl + F11**.

## **Problemas Comuns e Soluções**
- **Scene Builder não abre**:
   - Verifique se o caminho do executável foi configurado corretamente.
   - Confirme que o Scene Builder está instalado e funcional.

- **Erro ao carregar o arquivo FXML**:
   - Verifique se o arquivo FXML está no local correto e é referenciado corretamente no código.

