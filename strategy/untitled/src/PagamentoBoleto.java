package strategy;

public class PagamentoBoleto implements EstrategiaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Boleto gerado no valor de R$ %.2f.%n", valor);
    }
}