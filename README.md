# CURSO DE JAVAFX
👨‍⚖️JAVAFX É UMA BÍBLIOTECA PARA CRIAR APLICAÇÕES GRÁFICAS (GUI) MODERNAS EM JAVA.

<img src="FOTO.png" align="center" width="400"> <br>

## CONCEITO:
JavaFX é uma Bíblioteca (plataforma) de desenvolvimento rica para criar **aplicações gráficas (GUI)** modernas e sofisticadas em **Java**. Ele é projetado para substituir o Swing como a principal biblioteca para GUIs no Java. JavaFX oferece uma ampla gama de recursos que tornam o desenvolvimento mais intuitivo, flexível e visualmente atraente. Aqui estão os principais aspectos do JavaFX:

## SUA HISTÓRIA:
1. **Início: A Criação pela Sun Microsystems (2007)**
- **2007 – Lançamento do JavaFX 1.0**:  
  O **JavaFX** foi inicialmente desenvolvido pela **Sun Microsystems**, a empresa que criou o **Java**, e foi anunciado em 2007. A plataforma foi criada para oferecer uma **alternativa ao Swing** (o framework anterior do Java para GUIs) e para permitir que os desenvolvedores criassem interfaces gráficas mais modernas, com melhores recursos gráficos e multimídia. O JavaFX 1.0 foi lançado como uma biblioteca que incluía elementos para criar interfaces ricas e também suporte a gráficos e animações.

- **Foco em RIA (Rich Internet Applications)**:  
  Inicialmente, o JavaFX foi projetado para ser uma plataforma para o desenvolvimento de **aplicações ricas para a internet** (RIA), competindo com outras plataformas como **Adobe Flash** e **Microsoft Silverlight**, com ênfase em recursos gráficos, animações e multimídia.

2. **JavaFX 2.0 e o Começo da Reescrita (2011)**
- **2011 – JavaFX 2.0**:  
  O grande marco na evolução do JavaFX foi o lançamento da **versão 2.0** em 2011. Nessa versão, a Sun Microsystems, que já estava adquirida pela **Oracle**, fez uma reescrita completa do framework. A **versão 2.0** passou a ser baseada completamente em **Java** (em vez de usar **JavaScript** ou **JavaFX Script**, que eram usados nas versões anteriores), o que a tornava mais acessível aos desenvolvedores Java. 

  **Principais mudanças na versão 2.0:**
  - **Descontinuação do JavaFX Script**: A versão 2.0 não dependia mais do **JavaFX Script**, uma linguagem específica que foi inicialmente criada para facilitar a criação de interfaces gráficas. Em vez disso, a versão 2.0 passou a usar **Java** diretamente para a criação de interfaces.
  - **Integração com Java SE**: A plataforma foi integrada de forma mais estreita ao **Java Standard Edition (SE)**, permitindo que desenvolvedores Java pudessem utilizar facilmente as funcionalidades do JavaFX.
  - **FXML**: Foi introduzido o **FXML**, uma linguagem de marcação XML que permite que o layout das interfaces seja separado da lógica de programação Java, facilitando o trabalho de designers e desenvolvedores.

- **JavaFX 2.0** também foi o primeiro a trazer o uso de **animações**, **gráficos 2D e 3D**, além de integrar multimídia (como áudio e vídeo), algo que não era possível com o Swing.

3. **Oracle Assume o Controle (2010-2013)**
- **Aquisição da Sun Microsystems (2009)**:  
  A Oracle adquiriu a **Sun Microsystems** em 2009, o que trouxe o JavaFX sob o controle da Oracle. A partir desse momento, a Oracle focou em consolidar o JavaFX como a principal biblioteca de interfaces gráficas para Java.

- **Expansão de Funcionalidades**:  
  Durante esse período, a Oracle continuou a trabalhar no aprimoramento de recursos como animações, gráficos 2D e 3D, além de melhorias na **performance gráfica** do JavaFX. Essas melhorias visavam competir com outras plataformas de GUI, como **HTML5**, **Adobe Flash** e **Microsoft Silverlight**.

4. **A Partida do JavaFX do JDK (2017)**
- **2017 – JavaFX é removido do JDK**:  
  No **JDK 9** (lançado em 2017), a Oracle decidiu **remover o JavaFX** do pacote principal do JDK e transformá-lo em um **módulo separado**. Isso marcou um ponto de virada importante para o JavaFX. O motivo dessa mudança foi o desejo da Oracle de focar em outras áreas, como **cloud computing** e **big data**, além da diminuição da popularidade do JavaFX em comparação com outras tecnologias.

  Como resultado, os desenvolvedores passaram a precisar configurar o **JavaFX separadamente** em seus projetos, seja por meio de downloads diretos do **OpenJFX** ou utilizando ferramentas de gerenciamento de dependências como **Maven** ou **Gradle**.

5. **OpenJFX e a Comunidade Open Source (2018-Presente)**
- **OpenJFX**:  
  Após a remoção do JavaFX do JDK, a Oracle passou a **open source** o JavaFX, criando o projeto **OpenJFX**. Isso permitiu que a comunidade de desenvolvedores assumisse um papel mais ativo no desenvolvimento e manutenção do framework.

  O OpenJFX continua sendo mantido como uma **biblioteca de código aberto**, com a comunidade contribuindo para novos recursos e melhorias. Ele também recebeu atualizações importantes, como **suporte a novos sistemas operacionais** e melhorias no desempenho gráfico.

6. **Atualizações Recentes e Futuro do JavaFX**
- **JavaFX 14 (2020)** e versões posteriores:  
  Com o JavaFX sendo mantido pela comunidade, houve várias atualizações ao longo dos anos. Entre as melhorias, podemos destacar o **suporte para novas versões do Java**, **ajustes na integração com outras bibliotecas**, e novas funcionalidades para tornar o desenvolvimento mais eficiente.

- **Futuro**:  
  O JavaFX continua sendo uma opção sólida para **aplicações desktop** que exigem **interfaces gráficas** ricas. No entanto, ele tem perdido popularidade frente a alternativas mais modernas e multiplataforma, como **React** e **Flutter**. O futuro do JavaFX dependerá da evolução do **OpenJFX** e da capacidade da comunidade de manter a plataforma relevante, oferecendo atualizações e novas funcionalidades.

## CARACTERÍSTICAS:
### POSITIVAS:
1. **Componentes de Interface (UI):**
  - JavaFX possui um conjunto abrangente de componentes prontos para uso, como botões, tabelas, listas, gráficos, e muito mais.
  - Esses componentes são altamente personalizáveis com **CSS**.

2. **Layouts Flexíveis:**
  - Organize elementos da interface facilmente com layouts como **VBox**, **HBox**, **BorderPane**, **GridPane**, etc.
  - Eles ajudam a ajustar automaticamente os componentes, dependendo do tamanho da janela.

3. **Estilização com CSS:**
  - Você pode estilizar sua aplicação com folhas de estilo CSS, permitindo personalizar fontes, cores, bordas e animações.

4. **Integração com FXML:**
  - É possível usar arquivos **FXML**, que são baseados em XML, para definir a interface da aplicação de maneira declarativa, separando o design do código.

5. **Suporte para Multimídia:**
  - JavaFX suporta áudio, vídeo e gráficos 2D/3D, permitindo a criação de aplicações multimídia.

6. **Gráficos e Animações:**
  - Criação de gráficos complexos, como gráficos de barras, linhas e pizzas.
   - Suporte para animações simples e complexas.

7. **Portabilidade:**
  - Funciona em várias plataformas, incluindo **Windows**, **macOS**, **Linux**, e até dispositivos embarcados.

8. **Desempenho:**
  - JavaFX utiliza hardware gráfico, o que melhora o desempenho de renderização em aplicações visuais.

### NEGATIVAS:
1. **Descontinuação e Menor Suporte da Oracle:**
- **Descontinuação do JavaFX no JDK:** A partir do **JDK 11**, o JavaFX foi removido do pacote principal do JDK e passou a ser oferecido como um **módulo separado**. Isso significa que você precisa configurar o JavaFX manualmente em seus projetos, o que pode ser um pouco confuso para iniciantes.
- **Suporte reduzido pela Oracle:** O foco da Oracle em JavaFX diminuiu com o tempo, o que levou a um menor número de atualizações e melhorias para a plataforma.

2. **Compatibilidade e Suporte em Diferentes Ambientes:**
- **Suporte limitado em dispositivos móveis:** Embora o JavaFX suporte dispositivos como Raspberry Pi, ele não tem uma implementação robusta para dispositivos móveis como **Android** e **iOS**, o que limita seu uso em apps móveis, comparado a outras tecnologias como Flutter ou React Native.
- **Desafios em ambientes corporativos:** Muitas empresas e desenvolvedores têm preferido outras plataformas para criação de interfaces gráficas mais modernas, como **JavaScript/React** ou frameworks como **Qt** (C++), devido à falta de um ecossistema amplo e ao suporte reduzido do JavaFX.

3. **Menor Popularidade e Comunidade Menor:**
- **Comunidade menor:** Comparado a outras tecnologias mais modernas e amplamente adotadas para GUIs (como o **Swing** ou **JavaScript/React**), o JavaFX tem uma comunidade menor, o que pode dificultar a busca por ajuda em fóruns, tutoriais, e suporte.
- **Recursos e bibliotecas limitados:** Embora o JavaFX ofereça muitos recursos e componentes prontos, não há tantas bibliotecas de terceiros ou extensões comparado a outras plataformas populares.

4. **Desempenho em Algumas Situações:**
- **Desempenho gráfico em hardware antigo:** Embora o JavaFX utilize a aceleração de hardware para gráficos, em **máquinas mais antigas** ou com hardware limitado, o desempenho pode ser inferior em comparação a outras tecnologias que utilizam gráficos nativos de sistema.
- **Comparação com alternativas gráficas:** Para aplicações com exigências gráficas muito complexas (por exemplo, jogos 3D de alta performance), JavaFX pode não ser a melhor escolha em termos de desempenho, já que outras ferramentas como **Unity** ou **Unreal Engine** são mais robustas para esse tipo de tarefa.

5. **Complexidade na Aprendizagem e Configuração:**
- **Curva de aprendizado:** Embora o JavaFX seja relativamente fácil de começar a usar, ele pode ser complexo quando se trata de **técnicas avançadas**, como animações, gráficos 2D/3D e integração com outras bibliotecas. A configuração e a integração com projetos também podem ser difíceis, especialmente com o gerenciamento de dependências.
- **Complexidade na construção de interfaces:** Usar **FXML** e o conceito de separar lógica de interface pode ser útil, mas para desenvolvedores iniciantes, pode ser desafiador entender como tudo se encaixa (especialmente no início, quando se tenta compreender a interação entre FXML, o Controller e o código Java).

6. **Falta de Suporte Nativo para Web e App Mobile:**
- **Desapego da web:** JavaFX não tem suporte direto para a criação de aplicações web, o que significa que você não pode simplesmente empacotar uma aplicação JavaFX para rodar em navegadores (como pode ser feito com **JavaScript** ou **Electron**).
- **Alternativas de frameworks de UI mais populares:** No espaço de aplicações móveis, JavaFX não tem um bom desempenho comparado a frameworks como **Flutter**, **React Native** ou até **Swift** (para iOS). Portanto, se o seu objetivo é criar uma aplicação multi-plataforma (desktop, web, e móvel), JavaFX pode não ser a melhor escolha.

7. **Integração com Outras Tecnologias:**
- **Integração com Java EE e Spring:** Embora seja possível integrar JavaFX com frameworks como **Spring** ou **Java EE**, essa integração não é tão simples ou direta quanto com outras tecnologias baseadas em **web**. O JavaFX se adapta melhor a aplicações mais centradas no desktop, tornando a integração com arquiteturas modernas, como microserviços ou aplicações baseadas em RESTful, mais difícil.
- **Desafios no uso com bancos de dados:** Para quem trabalha com grandes sistemas de **bancos de dados** ou com **backends pesados**, JavaFX não oferece tantos componentes prontos para integrar e gerenciar essas conexões diretamente, como outras bibliotecas para UI e back-end em **Java** (como o **Swing** ou **JSP/JSF**).

## SUBSIDIOS:
- [CURSO CRIADO PELO "DESCOMPILA"](https://youtube.com/playlist?list=PLWd_VnthxxLejQ9CcHrsT5HCFn-10kquZ&si=JYyApX52Eek50CLm)
- [CURSO FEITO PELO VILHALVA](https://github.com/VILHALVA)
- [VEJA A DOCUMENTAÇÃO](https://www.oracle.com/java/technologies/javase/javafx-docs.html)
- [LINGUAGEM DE PROGRAMAÇÃO](https://github.com/VILHALVA/CURSO-DE-JAVA)
- [VEJA O MANUAL](./MANUAL.md)
- [VEJA A SINTAXE](./SINTAXE.md)
- [VEJA OS PROJETOS](https://github.com/VILHALVA?tab=repositories&q=topic:JAVAFX)
