package comobserver;

public class ClienteEmail implements Observador {

    private String email;

    public ClienteEmail(String email) {
        this.email = email;
    }

    @Override
    public void notificar(String produto) {
        System.out.println("[Email] Enviando para " + email + ": \"" + produto + " está disponível!\"");
    }
}
