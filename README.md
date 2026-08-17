# 🌍 World Master Quiz - Desafio de Capitais

Um jogo de perguntas e respostas interativo desenvolvido para testar conhecimentos geográficos. O projeto é uma aplicação **Full-Stack**, onde desenvolvi desde a interface do usuário até a lógica do servidor e a própria API de dados.

## 🚀 Tecnologias Utilizadas

### Back-end
*   **Java 21**
*   **Spring Boot**: Utilizado para criar uma API REST.
*   **Spring Web**: Para gerenciamento de rotas e endpoints.
*   **Maven**: Gerenciador de dependências.

### Front-end
*   **HTML5**: Estruturação semântica.
*   **CSS3**: Estilização moderna com Flexbox, Grid e animações de transição.
*   **JavaScript**: Lógica do jogo, manipulação de DOM e integração com a API via Fetch.

---

## 🛠️ O que o projeto faz?

*   **API Própria**: Em vez de usar uma API pronta, eu mesma construí o back-end em Java/Spring Boot que fornece uma lista personalizada de países, continentes e capitais.
*   **Desafio por Rodadas**: O jogo possui um limite de 10 perguntas por partida, exibindo o progresso em tempo real (ex: Rodada 1/10).
*   **Feedback Visual Instantâneo**: Ao responder, o usuário recebe um feedback visual imediato (Verde para acerto, Vermelho para erro) diretamente nos botões, sem o uso de alertas chatos, tornando a jogabilidade fluida.
*   **Geração de Opções Aleatórias**: O sistema sorteia automaticamente uma resposta correta e três opções incorretas aleatórias da base de dados.
*   **Integração com Bandeiras**: Utilização da API FlagCDN para carregar dinamicamente as bandeiras baseadas no código ISO enviado pela minha API Java.

---

## ⚙️ Como executar o projeto

### 1. Pré-requisitos
*   Java JDK 21 ou superior.
*   Maven instalado (ou usar o Maven Wrapper incluso).
*   Um navegador moderno.

### 2. Rodando o Back-end (API)
1. Navegue até a pasta `/backend`.
2. Execute o comando:
   ```bash
   ./mvnw spring-boot:run

  A API estará disponível em http://localhost:8080/api/paises.
  
3. Rodando o Front-end
Navegue até a pasta /frontend.
Abra o arquivo index.html em qualquer navegador.

🧠 Aprendizados
Este projeto foi fundamental para consolidar conceitos de:

Comunicação entre Front-end e Back-end.
Configuração de CORS no Spring Boot.
Manipulação de arrays e lógica de sorteio em JavaScript.
Gerenciamento de estados simples (pontuação e rodadas).

Desenvolvido por Gabrielly Silva. <3 

