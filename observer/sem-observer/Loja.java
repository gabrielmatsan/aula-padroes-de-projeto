package semobserver;

public class Loja {

    private String produto;
    private boolean emEstoque;

    // Problema: a Loja conhece e chama cada cliente diretamente.
    // Adicionar um novo tipo de notificação (ex: WhatsApp) exige modificar esta classe.
    // Viola o princípio Open/Closed.
    private ClienteEmail clienteEmail;
    private ClienteSMS clienteSMS;

    public Loja(String produto, ClienteEmail clienteEmail, ClienteSMS clienteSMS) {
        this.produto = produto;
        this.clienteEmail = clienteEmail;
        this.clienteSMS = clienteSMS;
    }

    public void reporEstoque() {
        this.emEstoque = true;
        System.out.println("[Loja] " + produto + " voltou ao estoque!\n");

        // Notificação manual e acoplada — cada novo cliente exige alterar aqui
        clienteEmail.notificar(produto);
        clienteSMS.notificar(produto);
    }
}
