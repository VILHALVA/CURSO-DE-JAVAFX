# SCENE BUILDER
O **Scene Builder** é uma ferramenta visual para criar interfaces de usuário em JavaFX. Ele permite que você construa a interface arrastando e soltando componentes (como botões, caixas de texto, tabelas, etc.) e configurando suas propriedades, sem precisar escrever código manualmente. O resultado é um arquivo **FXML**, que descreve a interface em formato XML, que pode ser usado no seu código JavaFX.

## Principais Recursos do Scene Builder:
1. **Interface Visual Intuitiva**:
   - Você pode montar a interface apenas arrastando e soltando componentes para a cena.

2. **Geração de Arquivos FXML**:
   - O Scene Builder gera automaticamente um arquivo FXML, que descreve a hierarquia e as propriedades da interface.

3. **Integração com CSS**:
   - Permite aplicar estilos personalizados nos componentes da interface por meio de arquivos CSS.

4. **Suporte a Eventos**:
   - Você pode vincular métodos de manipulação de eventos diretamente do Scene Builder, conectando elementos da interface com o código Java.

5. **Previsão em Tempo Real**:
   - Exibe como a interface ficará sem precisar executar a aplicação.

6. **Compatível com IDEs**:
   - Pode ser integrado com IDEs populares como **IntelliJ IDEA**, **Eclipse** e **NetBeans**, facilitando o fluxo de trabalho.

## Fluxo de Trabalho com Scene Builder:
1. **Criação do FXML**:
   - No Scene Builder, construa a interface gráfica desejada.
   - Salve o arquivo FXML.

2. **Integração com o Código Java**:
   - Carregue o arquivo FXML no código usando a classe `FXMLLoader`.
   - Conecte a interface com o controlador (Controller), onde você define a lógica da aplicação.

3. **Vinculação de Controladores**:
   - Associe um arquivo FXML a uma classe de controle (Controller) no Scene Builder.
   - Configure eventos, como cliques em botões, e referencie métodos do controlador.

## Como Instalar o Scene Builder:
1. **Baixar o Instalador**:
   - Faça o download do Scene Builder no site oficial da Gluon ([https://gluonhq.com/products/scene-builder/](https://gluonhq.com/products/scene-builder/)).

2. **Configurar na IDE**:
   - No **IntelliJ IDEA** ou **Eclipse**, configure o Scene Builder como editor padrão para arquivos FXML.

