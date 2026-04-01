package semstrategy;

public class Main {

    public static void main(String[] args) {
        Pagamento pagamento1 = new Pagamento("CARTAO_CREDITO");
        pagamento1.pagar(150.00);

        System.out.println();

        Pagamento pagamento2 = new Pagamento("PIX");
        pagamento2.pagar(89.90);

        System.out.println();

        Pagamento pagamento3 = new Pagamento("BOLETO");
        pagamento3.pagar(299.99);
    }
}
