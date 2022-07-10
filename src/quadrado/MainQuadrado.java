package quadrado;


import java.util.Scanner;

public class MainQuadrado {
    public static void main(String[] args) {
        Quadrado q = new Quadrado();

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor do lado ? = ");
        q.lado = input.nextDouble();


        System.out.println("Deseja mudar de lado ? = S/N ");
        String usuario = input.next();
        if (usuario.equalsIgnoreCase("S")) {
            q.mudarValorLado();
        } else {
            System.out.println("Obrigada pela preferência! ");
        }

        q.retornarValorLado();
        System.out.println("valor retornado: " + q.retornarValorLado());
        System.out.println("Valor da area: " + q.calcularArea());

    }
}