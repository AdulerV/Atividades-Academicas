package ListasDeExercicios.Lista04.Questao07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitaCatalogoTest {
    @Test
    public void deveCalcularValor() {
        FitaEmprestada fita = new FitaCatalogo(new Cliente(), "01/01/2024", 5);
        assertEquals(25, fita.calcularValorEmprestimo());
    }
}