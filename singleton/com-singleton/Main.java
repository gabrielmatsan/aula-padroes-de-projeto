package comsingleton;

public class Main {

    public static void main(String[] args) {
        // Solução: todas as chamadas retornam a mesma instância.
        DatabaseConnection conexao1 = DatabaseConnection.getInstance();
        DatabaseConnection conexao2 = DatabaseConnection.getInstance();
        DatabaseConnection conexao3 = DatabaseConnection.getInstance();

        conexao1.executarQuery("SELECT * FROM usuarios");
        conexao2.executarQuery("SELECT * FROM produtos");
        conexao3.executarQuery("SELECT * FROM pedidos");

        System.out.println();
        System.out.println("conexao1 == conexao2? " + (conexao1 == conexao2)); // true
        System.out.println("conexao2 == conexao3? " + (conexao2 == conexao3)); // true
        System.out.println("Apenas uma instância existe — recurso controlado.");
    }
}
