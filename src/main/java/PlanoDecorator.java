public abstract class PlanoDecorator implements Plano {

    private Plano plano;

    public PlanoDecorator(Plano plano) {
        this.plano = plano;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public abstract float getPercentualMensalidade();

    public float getMensalidade() {
        return this.plano.getMensalidade() * (1 + (this.getPercentualMensalidade() / 100));
    }
}