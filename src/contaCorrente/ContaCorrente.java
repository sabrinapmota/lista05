package contaCorrente;


public class ContaCorrente {
    String agencia = "5464";
    String numeroDaConta = "13542-1";
    double saldo;
    double limiteDeCredito;

    public ContaCorrente() {
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.limiteDeCredito = limiteDeCredito;
        this.agenciaNumeroConta = agenciaNumeroConta;
    }

    String agenciaNumeroConta = "";

    public String agenciaNumeroConta() {
        agenciaNumeroConta = agencia + numeroDaConta;
        return agenciaNumeroConta;
    }

    public double saldoTotalConta(double saldo, double limiteDeCredito) {
        double totalValor = 0;
        totalValor = saldo + limiteDeCredito;
        return totalValor;
    }
}
