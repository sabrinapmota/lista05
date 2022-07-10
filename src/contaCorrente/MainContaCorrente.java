package contaCorrente;


public class MainContaCorrente {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        String concatenacao = contaCorrente.agenciaNumeroConta();
        System.out.println("Concatenacao" + concatenacao);

        double valorCorrente = contaCorrente.saldoTotalConta(-100,200);
        System.out.println("valorCorrente");

    }
}