package ListasDeExercicios.Lista04.Questao05A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPUTest {
    @Test
    void deveInserirValorTotalPecasTrocadas() {
        Cliente cliente = new Cliente();
        CPU cpu = new CPU(cliente, 6);
        cpu.setValorTotalPecasTrocadas(0.0f);
        assertEquals(0.0f, cpu.getValorTotalPecasTrocadas());
    }

    @Test
    void deveImpedirValorTotalPecasTrocadasNegativo() {
        try {
            Cliente cliente = new Cliente();
            CPU cpu = new CPU(cliente, 7);
            cpu.setValorTotalPecasTrocadas(-0.01f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Valor total das peças trocadas inválido!", e.getMessage());
        }
    }

    @Test
    void deveCalcularValorManutencaoCPU() {
        Cliente cliente = new Cliente();
        CPU cpu = new CPU(cliente, 8);
        cpu.setValorMaoObra(100.0f);
        cpu.setValorTotalPecasTrocadas(50.0f);
        assertEquals(150.0f, cpu.calcularValorManutencao());
    }
}