package comsingleton;

public class DatabaseConnection {

    private static volatile DatabaseConnection instance;

    private final String url;

    private DatabaseConnection(String url) {
        this.url = url;
        System.out.println("Conexão única criada: " + url);
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection("jdbc:postgresql://localhost:5432/design_patterns?user=postgres&password=postgres");
                }
            }
        }
        return instance;
    }

    public void executarQuery(String query) {
        System.out.println("[" + url + "] Executando: " + query);
    }
}
