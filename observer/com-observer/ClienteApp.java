package comobserver;

public class ClienteApp implements Observador {

    private String usuario;

    public ClienteApp(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void notificar(String produto) {
        System.out.println("[App] Push para " + usuario + ": \"" + produto + " está disponível!\"");
    }
}
