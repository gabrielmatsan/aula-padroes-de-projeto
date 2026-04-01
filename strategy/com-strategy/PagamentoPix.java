package comstrategy;

public class PagamentoPix implements EstrategiaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagando R$" + valor + " com Pix");
        System.out.println("Gerando QR Code... Transferência confirmada!");
    }
}
