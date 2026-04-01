package semsingleton;

public class Main {

    public static void main(String[] args) {
        // Problema: cada chamada cria uma nova conexão,
        // desperdiçando recursos e perdendo consistência.
        DatabaseConnection conexao1 = new DatabaseConnection("jdbc:postgresql://localhost:5432/design_patterns?user=postgres&password=postgres");
        DatabaseConnection conexao2 = new DatabaseConnection("jdbc:postgresql://localhost:5432/design_patterns?user=postgres&password=postgres");
        DatabaseConnection conexao3 = new DatabaseConnection("jdbc:postgresql://localhost:5432/design_patterns?user=postgres&password=postgres");

        conexao1.executarQuery("SELECT * FROM usuarios");
        conexao2.executarQuery("SELECT * FROM produtos");
        conexao3.executarQuery("SELECT * FROM pedidos");

        System.out.println();
        System.out.println("conexao1 == conexao2? " + (conexao1 == conexao2)); // false
        System.out.println("Três objetos diferentes foram criados — sem controle nenhum.");
    }
}
