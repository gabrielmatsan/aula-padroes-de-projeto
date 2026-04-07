package semobserver;

public class ClienteEmail {

    private String email;

    public ClienteEmail(String email) {
        this.email = email;
    }

    public void notificar(String produto) {
        System.out.println("[Email] Enviando para " + email + ": \"" + produto + " está disponível!\"");
    }
}
