# CONFIGURANDO NETBEANS
## **1. Baixar e Instalar o Scene Builder**
1. Acesse o site oficial da **Gluon**: [https://gluonhq.com/products/scene-builder/](https://gluonhq.com/products/scene-builder/).
2. Baixe a versão apropriada para o seu sistema operacional.
3. Instale o Scene Builder seguindo as instruções fornecidas.

## **2. Configurar o Scene Builder no NetBeans**
1. **Abrir Configurações de FXML no NetBeans**:
   - No menu principal do NetBeans, vá em:
     **Ferramentas (Tools) > Opções (Options)** (no Windows/Linux)
     ou 
     **NetBeans > Preferências (Preferences)** (no macOS).

2. **Configurar o Caminho do Scene Builder**:
   - Na janela de opções, vá para a aba **Java**.
   - Selecione a sub-aba **JavaFX**.
   - Clique em **Browse** (Procurar) e localize o executável do Scene Builder no seu sistema:
     - **Windows**: Geralmente está em `C:\Program Files\Scene Builder\SceneBuilder.exe`.
     - **macOS**: Normalmente está em `/Applications/SceneBuilder.app`.
     - **Linux**: Procure no diretório onde você instalou o Scene Builder (por exemplo, `/usr/local/bin`).

3. Clique em **OK** para salvar as configurações.

## **3. Criar e Editar Arquivos FXML**
Agora que o Scene Builder está configurado, você pode criar e editar arquivos FXML diretamente no NetBeans:

1. **Criar um Arquivo FXML**:
   - Clique com o botão direito em um projeto JavaFX.
   - Selecione **Novo > FXML Document**.
   - Escolha um nome para o arquivo e clique em **Concluir**.

2. **Abrir com o Scene Builder**:
   - No painel do projeto, clique com o botão direito no arquivo FXML que você criou.
   - Selecione **Abrir (Open) > Abrir no Scene Builder**.

   O Scene Builder será aberto, permitindo que você edite a interface graficamente.

## **4. Executar o Projeto**
1. No NetBeans, crie a classe principal Java para carregar o arquivo FXML com `FXMLLoader`.
2. Execute o projeto clicando no botão **Executar (Run)** ou pressionando **F6**.

## **Problemas Comuns e Soluções**
- **Scene Builder não abre**:
  - Verifique se o caminho do executável está correto nas configurações do NetBeans.
  - Confirme que o Scene Builder foi instalado corretamente.

- **Erro ao carregar o arquivo FXML**:
  - Certifique-se de que o arquivo FXML está salvo e acessível no projeto.
  - Verifique se o controlador (Controller) está configurado corretamente no Scene Builder.

