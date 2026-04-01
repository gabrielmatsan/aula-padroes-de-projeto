package comstrategy;

public class Main {

    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento(new PagamentoCartaoCredito());
        pagamento.realizarPagamento(150.00);

        System.out.println();

        // Troca a estratégia em tempo de execução — sem if/else!
        pagamento.setEstrategia(new PagamentoPix());
        pagamento.realizarPagamento(89.90);

        System.out.println();

        pagamento.setEstrategia(new PagamentoBoleto());
        pagamento.realizarPagamento(299.99);
    }
}
