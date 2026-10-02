import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoTest {

    @Test
    void deveRetornarMensalidadePlano() {
        Plano plano = new PlanoAcademia(1000.0f);

        assertEquals(1000.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComMusculacao() {
        Plano plano = new Musculacao(new PlanoAcademia(1000.0f));

        assertEquals(1100.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComNatacao() {
        Plano plano = new Natacao(new PlanoAcademia(1000.0f));

        assertEquals(1200.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComPilates() {
        Plano plano = new Pilates(new PlanoAcademia(1000.0f));

        assertEquals(1050.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComMusculacaoMaisNatacao() {
        Plano plano = new Musculacao(new Natacao(new PlanoAcademia(1000.0f)));

        assertEquals(1320.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComMusculacaoMaisPilates() {
        Plano plano = new Musculacao(new Pilates(new PlanoAcademia(1000.0f)));

        assertEquals(1155.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComNatacaoMaisPilates() {
        Plano plano = new Natacao(new Pilates(new PlanoAcademia(1000.0f)));

        assertEquals(1260.0f, plano.getMensalidade());
    }

    @Test
    void deveRetornarMensalidadePlanoComMusculacaoMaisNatacaoMaisPilates() {
        Plano plano = new Musculacao(new Natacao(new Pilates(new PlanoAcademia(1000.0f))));

        assertEquals(1386.0f, plano.getMensalidade());
    }

}