package ListasDeExercicios.Lista02.Questao06;

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
    public void deveTestarSalarioInvalido() {
        try {
            funcionario.setSalario(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Salário inválido!", e.getMessage());
        }
    }

    @Test
    public void deveTestarAumentoInvalido() {
        try {
            funcionario.setSalario(1000.5f);
            funcionario.receberAumento(0);
        } catch (IllegalArgumentException e) {
            assertEquals("Percentual de aumento inválido!", e.getMessage());
        }
    }

    @Test
    public void deveReceberAumento() {
        funcionario.setSalario(1000.5f);
        funcionario.receberAumento(10);
        assertEquals(1100.55, funcionario.getSalario(), 0.01);
    }

    @Test
    public void deveMudarDepartamento() {
        funcionario.setDepartamento("Recursos Humanos");
        assertEquals("Recursos Humanos", funcionario.getDepartamento());
        funcionario.mudarDepartamento("Logística");
        assertEquals("Logística", funcionario.getDepartamento());
    }

    @Test
    public void deveExibirDados() {
        funcionario.setNome("João");
        funcionario.setCargo("Contador");
        funcionario.setSalario(2200.9f);
        funcionario.setDepartamento("Financeiro");
        assertEquals("Nome: João - Cargo: Contador - Salário: R$ 2200.9 - Departamento: Financeiro", funcionario.exibirDados());
    }
}