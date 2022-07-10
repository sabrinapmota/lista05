package jardinagem;


public class Jardinagem {
    public int metrosGrama;
    public double valorAdubo = 3;
    public int qtdAdubo;
    public double corteGrama = 5;

    public Jardinagem(int metrosGrama) {
        this.metrosGrama = metrosGrama;
    }

    public double usarAdubo() {
        return ((this.metrosGrama / 2) * 100) / 100;
    }

    public double precoAdubo() {
        return usarAdubo() * this.valorAdubo;
    }

    public double precoCorteGrama() {
        return this.metrosGrama * this.corteGrama;
    }
}
