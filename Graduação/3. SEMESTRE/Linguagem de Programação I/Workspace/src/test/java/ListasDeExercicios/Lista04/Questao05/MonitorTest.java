package ListasDeExercicios.Lista04.Questao05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonitorTest {
    @Test
    void deveCalcularValorManutencaoMonitor() {
        Cliente cliente = new Cliente();
        Monitor monitor = new Monitor(cliente, 8);
        monitor.setValorMaoObra(100.0f);
        assertEquals(100.0f, monitor.calcularValorManutencao());
    }
}