public class Natacao extends PlanoDecorator {

    public Natacao(Plano plano) {
        super(plano);
    }

    public float getPercentualMensalidade() {
        return 20.0f;
    }
}
