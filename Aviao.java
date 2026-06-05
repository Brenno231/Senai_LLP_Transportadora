public class Aviao extends VeiculoAereo implements Transporte {
    private double capacidadeCarga;
    private double mtow;

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getMtow() {
        return mtow;
    }

    public void setMtow(double mtow) {
        this.mtow = mtow;
    }

    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return ((peso * peso) * (altura * largura)) * (distancia * 9.99);
    }
}
