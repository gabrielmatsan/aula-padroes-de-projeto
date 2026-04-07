package comobserver;

public class ClienteSMS implements Observador {

    private String telefone;

    public ClienteSMS(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void notificar(String produto) {
        System.out.println("[SMS] Enviando para " + telefone + ": \"" + produto + " está disponível!\"");
    }
}
