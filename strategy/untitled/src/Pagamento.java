package strategy;

public class Pagamento {
    private EstrategiaPagamento estrategia;

    public Pagamento(EstrategiaPagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaPagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void pagar(double valor) {
        if (this.estrategia == null) {
            throw new IllegalStateException("Defina uma estratégia de pagamento antes de pagar.");
        } else {
            this.estrategia.pagar(valor);
        }
    }
}