package ListasDeExercicios.Lista01.Questao02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario funcionario;

    @BeforeEach
    public void setUp() {
        funcionario = new Funcionario();
    }

    @Test
    public void deveTestarSalarioNegativo() {
        try {
            funcionario.setSalario(-0.1);
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Salário bruto inválido!", exception.getMessage());
        }
    }

    @Test
    public void deveTestarValorHorasExtrasNegativo() {
        try {
            funcionario.setValorHorasExtras(-0.1);
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Valor das horas extras inválido!", exception.getMessage());
        }
    }

    @Test
    public void deveTestarNumeroHorasExtrasNegativo() {
        try {
            funcionario.setNumeroHorasExtras(-1);
            fail();
        } catch (IllegalArgumentException exception) {
            assertEquals("Número de horas extras inválido!", exception.getMessage());
        }
    }

    @Test
    public void deveCalcularHorasExtras() {
        funcionario.setValorHorasExtras(20);
        funcionario.setNumeroHorasExtras(10);
        assertEquals(200, funcionario.calcularHorasExtras());
    }

    @Test
    public void deveCalcularSalarioLiquido() {
        funcionario.setSalario(1500);
        funcionario.setValorHorasExtras(20);
        funcionario.setNumeroHorasExtras(10);
        funcionario.calcularSalarioLiquido();
        assertEquals(1564, funcionario.calcularSalarioLiquido());
    }
}