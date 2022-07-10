package bola;

public class Bola {
    String cor;
    int circunferencia;
    String marca;

    public Bola(String cor, int circunferencia, String marca, int velocidade) {
        if (cor == null || cor == "") {
            this.cor = "Azul";
        } else {
            this.cor = cor;
        }

        this.circunferencia = circunferencia;
        this.marca = marca;
        this.velocidade = velocidade;

    }

    @Override
    public String toString() {
        return "Bola{" +
                "cor='" + cor + '\'' +
                ", circunferencia=" + circunferencia +
                ", marca='" + marca + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    int velocidade;

    public void imprimirMarca() {
        System.out.println(this.marca);
    }
}

