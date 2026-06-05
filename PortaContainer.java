public class PortaContainer extends VeiculoFluvial implements Transporte {
    private double capacidadeCargaTeu;
    private String categoria;

    public double getCapacidadeCargaTeu() {
        return capacidadeCargaTeu;
    }

    public void setCapacidadeCargaTeu(double capacidadeCargaTeu) {
        this.capacidadeCargaTeu = capacidadeCargaTeu;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return peso + ((altura * largura) * distancia);
    }
}
