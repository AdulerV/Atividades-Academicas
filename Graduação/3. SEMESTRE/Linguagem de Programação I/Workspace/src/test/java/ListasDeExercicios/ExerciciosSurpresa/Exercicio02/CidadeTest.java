package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {
    Cidade cidade;
    Estado estado;

    @Test
    public void deveInserirNome() {
        estado = new Estado("Minas Gerais");
        cidade = new Cidade(" Uberlândia ");
        assertEquals("Uberlândia", cidade.getNome());
    }

    @Test
    public void deveInserirEstado() {
        estado = new Estado("Minas Gerais");
        cidade = new Cidade(estado);
        assertEquals("Minas Gerais", cidade.getNomeEstado());
    }

    @Test
    public void deveImpedirNomeVazio() {
        try {
            estado = new Estado("Minas Gerais");
            cidade = new Cidade("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio não é permitido!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirCidadeEstadoAusente() {
        try {
            cidade = new Cidade(estado);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cidade sem estado não é permitida!", e.getMessage());
        }
    }
}
