package semstrategy;

public class Pagamento {

    private final String tipo;

    public Pagamento(String tipo) {
        this.tipo = tipo;
    }

    public void pagar(double valor) {
        // Problema: cada novo meio de pagamento exige modificar esta classe.
        // Viola o princípio Open/Closed — aberto para extensão, fechado para modificação.
        if (tipo.equals("CARTAO_CREDITO")) {
            System.out.println("Pagando R$" + valor + " com Cartão de Crédito");
            System.out.println("Conectando com operadora... Aprovado!");
        } else if (tipo.equals("PIX")) {
            System.out.println("Pagando R$" + valor + " com Pix");
            System.out.println("Gerando QR Code... Transferência confirmada!");
        } else if (tipo.equals("BOLETO")) {
            System.out.println("Pagando R$" + valor + " com Boleto");
            System.out.println("Gerando boleto... Aguardando compensação!");
        } else {
            System.out.println("Tipo de pagamento desconhecido: " + tipo);
        }
        // E se precisar adicionar multiplos gateways de pagamento com cada um, tendo sua variacao de credito, debito pix, o if else so tende a ficar pior
    }
}
