package carro;


public class Carro {
    int quantidadesDeportas;
    String modelo;
    String marca;

    Boolean ligaCarro;
    double potencia;

    public Carro() {
        this.quantidadesDeportas = quantidadesDeportas;
        this.modelo = modelo;
        this.marca = marca;
        this.ligaCarro = false;
        this.potencia = 2.0;
    }

    public void ligaCarro() {
        this.ligaCarro = true;
        System.out.println("O carro está: " + ligaCarro);
    }
}