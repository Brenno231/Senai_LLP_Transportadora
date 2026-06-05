public class Caminhao extends VeiculoTerrestre implements Transporte {
    private int qtdEixos;
    private double capacidade;
    private String carroceria;

    public int getQtdEixos() {
        return qtdEixos;
    }

    public void setQtdEixos(int qtdEixos) {
        this.qtdEixos = qtdEixos;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getCarroceria() {
        return carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }

    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return (peso + (altura * largura)) * (distancia * 6.99);
    }
}
