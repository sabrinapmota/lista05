package caixa;

public class Caixa {
    public double saldo;

    public Caixa() {
        this.saldo = 1000;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
}
