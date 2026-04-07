package semobserver;

public class Main {

    public static void main(String[] args) {
        ClienteEmail email = new ClienteEmail("ana@email.com");
        ClienteSMS sms = new ClienteSMS("(11) 99999-0000");

        // Problema: a Loja precisa receber todos os clientes no construtor.
        // Quer adicionar notificação por App? Mude o construtor e a classe Loja.
        Loja loja = new Loja("Headset Gamer", email, sms);

        loja.reporEstoque();
    }
}
