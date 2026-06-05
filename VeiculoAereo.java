public abstract class VeiculoAereo extends Veiculo {
    private String rab;
    private int qtdMotores;

    public String getRab() {
        return rab;
    }

    public void setRab(String rab) {
        this.rab = rab;
    }

    public int getQtdMotores() {
        return qtdMotores;
    }

    public void setQtdMotores(int qtdMotores) {
        this.qtdMotores = qtdMotores;
    }
}
