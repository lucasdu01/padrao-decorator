public class Musculacao extends PlanoDecorator {

    public Musculacao(Plano plano) {
        super(plano);
    }

    public float getPercentualMensalidade() {
        return 10.0f;
    }
}
