package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {
    Escola escola;
    Professor diretor;
    Escolaridade escolaridade;
    Cidade cidade;
    Estado estado;

    // c) Qual a escolaridade do diretor de uma escola?
    @Test
    public void deveInserirEscolaridadeDiretor() {
        escolaridade = new Escolaridade("Doutorado");
        diretor = new Professor(escolaridade);
        escola = new Escola(diretor);
        assertEquals("doutorado", escola.getNivelEscolarDiretor());
    } //

    @Test
    public void deveTestarNomeDiretorAusente() {
        escola = new Escola(diretor);
        assertEquals("Escola sem direção!", escola.getNomeDiretor());
    }

    @Test
    public void deveTestarEscolaridadeDiretorAusente() {
        escola = new Escola(diretor);
        assertEquals("Escola sem direção!", escola.getNivelEscolarDiretor());
    }

    @Test
    public void deveInserirCidade() {
        estado = new Estado("Minas Gerais");
        cidade = new Cidade("Juiz de Fora", estado);
        escola = new Escola(cidade);
        assertEquals("Juiz de Fora", escola.getNomeCidade());
    }

    @Test
    public void deveInserirEstadoCidade() {
        estado = new Estado("Minas Gerais");
        cidade = new Cidade("Juiz de Fora", estado);
        escola = new Escola(cidade);
        assertEquals("Minas Gerais", escola.getNomeEstado());
    }

    @Test
    public void deveImpedirEscolaCidadeAusente() {
        try {
            escola = new Escola(cidade);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Escola sem cidade não é permitido!", e.getMessage());
        }
    }
}