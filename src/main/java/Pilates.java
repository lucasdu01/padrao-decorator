public class Pilates extends PlanoDecorator {

    public Pilates(Plano plano) {
        super(plano);
    }

    public float getPercentualMensalidade() {
        return 5.0f;
    }

}