package ListasDeExercicios.Lista04.Questao08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoMensalistaTest {
    @Test
    void deveCalcularMensalidade() {
        AlunoMensalista alunoMensalista = new AlunoMensalista(new Curso(), 1);
        alunoMensalista.setNumParcelas(10);
        alunoMensalista.setValorMensalidade(50.0f);
        assertEquals(500.0f, alunoMensalista.calcularMensalidade());
    }
}