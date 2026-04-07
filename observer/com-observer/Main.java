package comobserver;

public class Main {

    public static void main(String[] args) {
        Loja loja = new Loja("Headset Gamer");

        // Qualquer um que implemente Observador pode se inscrever — sem mudar a Loja
        loja.assinar(new ClienteEmail("ana@email.com"));
        loja.assinar(new ClienteSMS("(11) 99999-0000"));
        loja.assinar(new ClienteApp("@carlos"));

        loja.reporEstoque();

        System.out.println("---\n");

        // Novo produto, diferentes observadores — mesma Loja, sem alteração
        Loja loja2 = new Loja("Teclado Mecânico");
        loja2.assinar(new ClienteEmail("bia@email.com"));
        loja2.reporEstoque();
    }
}
