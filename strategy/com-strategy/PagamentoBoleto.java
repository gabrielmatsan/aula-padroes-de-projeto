package comstrategy;

public class PagamentoBoleto implements EstrategiaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " com Boleto");
        System.out.println("Gerando boleto... Aguardando compensação!");
    }
}
