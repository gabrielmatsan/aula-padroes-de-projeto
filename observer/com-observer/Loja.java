package comobserver;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private String produto;
    private final List<Observador> observadores = new ArrayList<>();

    public Loja(String produto) {
        this.produto = produto;
    }

    public void assinar(Observador observador) {
        observadores.add(observador);
    }

    public void cancelar(Observador observador) {
        observadores.remove(observador);
    }

    public void reporEstoque() {
        System.out.println("[Loja] " + produto + " voltou ao estoque!\n");

        // A Loja não sabe quem são os observadores — só os notifica.
        // Adicionar um novo canal (ex: WhatsApp) não muda nada aqui.
        for (Observador observador : observadores) {
            observador.notificar(produto);
        }
    }
}
