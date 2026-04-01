# Design Patterns

Material prático sobre padrões de projeto aplicados em Java. Cada padrão é demonstrado com dois exemplos: sem e com a aplicação do padrão, para evidenciar o problema que ele resolve.

## Padrões abordados

### Singleton
Garante que uma classe tenha apenas uma instância durante toda a execução da aplicação.

- `singleton/sem-singleton` — múltiplas instâncias criadas sem controle
- `singleton/com-singleton` — instância única compartilhada com thread safety

### Strategy
Permite trocar algoritmos em tempo de execução sem alterar o código que os usa.

- `strategy/sem-strategy` — lógica de pagamento acoplada em um único método com `if/else`
- `strategy/com-strategy` — cada forma de pagamento é uma estratégia independente e intercambiável

## Como executar

Compile e execute a partir da raiz do projeto:

```bash
# Singleton
javac singleton/sem-singleton/*.java -d out && java -cp out semsingleton.Main
javac singleton/com-singleton/*.java -d out && java -cp out comsingleton.Main

# Strategy
javac strategy/sem-strategy/*.java -d out && java -cp out semstrategy.Main
javac strategy/com-strategy/*.java -d out && java -cp out comstrategy.Main
```