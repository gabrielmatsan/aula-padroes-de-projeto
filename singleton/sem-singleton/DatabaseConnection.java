package semsingleton;

public class DatabaseConnection {

    private final String url;

    public DatabaseConnection(String url) {
        this.url = url;
        System.out.println("Nova conexão criada: " + url);
    }

    public void executarQuery(String query) {
        System.out.println("[" + url + "] Executando: " + query);
    }
}
