package comstrategy;

public class Pagamento {

    private EstrategiaPagamento estrategia;

    public Pagamento(EstrategiaPagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaPagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void realizarPagamento(double valor) {
        estrategia.pagar(valor);
    }
}
