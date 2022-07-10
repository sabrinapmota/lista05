package caixa;


import java.util.Scanner;

public class CaixaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Caixa caixa = new Caixa();
        while (true) {
            System.out.println("Qual o valor de deposito: ");
            double valor = input.nextDouble();
            caixa.depositar(valor);
            System.out.println("O seu saldo é de R$" + caixa.saldo);
            System.out.println("Deseja continuar? 1 para sim ou 2 para não");
            int resp = input.nextInt();
            if (resp == 1) {
                continue;
            } else if (resp == 2) {
                System.out.println("até mais, obrigado.");
                break;
            }
        }
        input.close();
    }
}
