package jardinagem;


import java.util.Scanner;

public class JardinagemMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos metros de grama você vai querer? ");
        int metrosGrama = input.nextInt();
        input.close();
        Jardinagem jardim = new Jardinagem(metrosGrama);
        System.out.println("A quantidade de adubo é: " + jardim.usarAdubo());
        System.out.println("O preço do adubo será: R$" + jardim.precoAdubo());
        System.out.println("O preço do corte da grama é: " + jardim.precoCorteGrama());

    }
}
