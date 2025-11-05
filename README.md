# HealPlus Monorepo

Este é o monorepo unificado para todos os projetos HealPlus, gerenciado com **npm Workspaces**.

## Estrutura do Projeto

O monorepo está organizado nas seguintes pastas:

| Pasta | Conteúdo | Tecnologia Principal |
| :--- | :--- | :--- |
| `apps/frontend` | Frontend Estático/Simples (healplus) | HTML, CSS, JavaScript |
| `apps/webapp` | Aplicação Web Principal (Frontend e Funções Firebase) | Next.js, React, Firebase |
| `apps/backend` | Serviço de Backend | Java, Spring Boot, Gradle |
| `apps/mobile` | Aplicação Mobile | Android Nativo (Kotlin/Java) |

## Primeiros Passos

1.  **Instalar Dependências (Node.js/Webapp):**
    ```bash
    cd healplus_monorepo
    npm install
    ```

2.  **Executar a Aplicação Web Principal (`apps/webapp`):**
    ```bash
    npm run dev --workspace=@healplus/webapp
    # Ou, se preferir:
    cd apps/webapp
    npm run dev
    ```

3.  **Executar o Frontend Estático (`apps/frontend`):**
    Este é um projeto estático. Você pode abri-lo diretamente no navegador ou usar um servidor estático simples.
    ```bash
    # Exemplo de uso de um servidor estático (requer live-server instalado globalmente)
    cd apps/frontend
    live-server
    ```

4.  **Executar o Backend (`apps/backend`):**
    O backend é um projeto Java/Gradle. Você precisará ter o Java e o Gradle instalados.
    ```bash
    cd apps/backend
    ./gradlew bootRun
    ```

5.  **Executar o Mobile (`apps/mobile`):**
    O projeto mobile é nativo (Android).
    -   Para Android, use o Android Studio para abrir a pasta `apps/mobile` e executar.
    -   Para iOS (se houver), a configuração deve ser feita separadamente.

## Scripts Úteis (Nível Raiz)

Você pode adicionar scripts no `package.json` da raiz para facilitar a execução de comandos em todos os projetos de uma vez.

| Comando | Descrição |
| :--- | :--- |
| `npm run build --workspaces` | Constrói todos os projetos Node.js (atualmente `webapp` e `frontend`). |
| `npm run lint --workspaces` | Executa o linter em todos os projetos Node.js. |

## Próximos Passos Recomendados

1.  **Compartilhamento de Código:** Se houver código que possa ser compartilhado entre `webapp` e `backend` (como modelos de dados ou validações), crie uma pasta em `packages/` e configure os projetos para dependerem dela.
2.  **Configuração de Variáveis de Ambiente:** Configure as variáveis de ambiente (`.env` ou similar) para cada aplicação.
3.  **Configuração do Git:** Inicialize um novo repositório Git na pasta `healplus_monorepo` e faça o primeiro commit.
    ```bash
    git init
    git add .
    git commit -m "feat: Initial monorepo setup for HealPlus"
    ```
