package semobserver;

public class ClienteSMS {

    private String telefone;

    public ClienteSMS(String telefone) {
        this.telefone = telefone;
    }

    public void notificar(String produto) {
        System.out.println("[SMS] Enviando para " + telefone + ": \"" + produto + " está disponível!\"");
    }
}
