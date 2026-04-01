package comstrategy;

public class PagamentoCartaoCredito implements EstrategiaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " com Cartão de Crédito");
        System.out.println("Conectando com operadora... Aprovado!");
    }
}
