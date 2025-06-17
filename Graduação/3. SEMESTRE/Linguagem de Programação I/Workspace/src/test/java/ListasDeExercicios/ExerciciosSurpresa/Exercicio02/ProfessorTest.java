package ListasDeExercicios.ExerciciosSurpresa.Exercicio02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    Professor professor;
    Escolaridade escolaridade;
    Cidade cidade;
    Estado estado;
    Curso curso;
    TipoEnsino tipoEnsino;
    Escola escola;
    Professor direcao;
    Professor coordenacao;

    @Test
    public void deveInserirNome() {
        escolaridade = new Escolaridade("Doutorado");
        professor = new Professor(" Marco Antônio ");
        assertEquals("Marco Antônio", professor.getNome());
    }

    // a) Qual a escolaridade de um professor?
    @Test
    public void deveInserirSuperiorIncompleto() {
        escolaridade = new Escolaridade("ensino superior incompleto");
        professor = new Professor(escolaridade);
        assertEquals("ensino superior incompleto", professor.getNivelEscolarEscolaridade());
    }

    @Test
    public void deveInserirBacharelado() {
        escolaridade = new Escolaridade("bacharelado");
        professor = new Professor(escolaridade);
        assertEquals("bacharelado", professor.getNivelEscolarEscolaridade());
    }

    @Test
    public void deveInserirLicenciatura() {
        escolaridade = new Escolaridade("licenciatura");
        professor = new Professor(escolaridade);
        assertEquals("licenciatura", professor.getNivelEscolarEscolaridade());
    }

    @Test
    public void deveInserirTecnologo() {
        escolaridade = new Escolaridade("tecnólogo");
        professor = new Professor(escolaridade);
        assertEquals("tecnólogo", professor.getNivelEscolarEscolaridade());
    }

    @Test
    public void deveInserirEspecializacao() {
        escolaridade = new Escolaridade("especialização");
        professor = new Professor(escolaridade);
        assertEquals("especialização", professor.getNivelEscolarEscolaridade());
    }

    @Test
    public void deveInserirMBA() {
        escolaridade = new Escolaridade("mba");
        professor = new Professor(escolaridade);
        assertEquals("mba", professor.getNivelEscolarEscolaridade());
    }

    @Test
    public void deveInserirMestrado() {
        escolaridade = new Escolaridade("mestrado");
        professor = new Professor(escolaridade);
        assertEquals("mestrado", professor.getNivelEscolarEscolaridade());
    }

    @Test
    public void deveInserirDoutorado() {
        escolaridade = new Escolaridade("doutorado");
        professor = new Professor(escolaridade);
        assertEquals("doutorado", professor.getNivelEscolarEscolaridade());
    }
    //

    // e) Qual a cidade de nascimento de um professor?
    @Test
    public void deveInserirNaturalidade() {
        cidade = new Cidade("Juiz de Fora");
        escolaridade = new Escolaridade("doutorado");
        professor = new Professor("Marco Antônio", escolaridade, cidade);
        assertEquals("Juiz de Fora", professor.getNomeNaturalidade());
    } //

    @Test
    public void deveInserirEstadoNaturalidade() {
        estado = new Estado("Minas Gerais");
        cidade = new Cidade("Juiz de Fora", estado);
        escolaridade = new Escolaridade("doutorado");
        professor = new Professor("Marco Antônio", escolaridade, cidade);
        assertEquals("Minas Gerais", professor.getNomeEstado());
    }

    // g) Qual o tipo de ensino (ensino fundamental, médio, superior) que um professor foi contratado para lecionar?
    @Test
    public void deveInserirTipoEnsinoLecionado() {
        tipoEnsino = new TipoEnsino("Ensino Fundamental");
        curso = new Curso(tipoEnsino);
        professor = new Professor(curso);
        assertEquals("ensino fundamental", professor.getNomeTipoEnsinoCurso());
    } //

    // i) Quem é o diretor de um professor?
    @Test
    public void deveInserirDiretorProfessor() {
        direcao = new Professor("João Maria");
        escola = new Escola(direcao);
        curso = new Curso(escola);
        professor = new Professor(curso);
        assertEquals("João Maria", professor.getNomeDiretorEscola());
    } //

    // j) Quem é o coordenador de um professor?
    @Test
    public void deveInserirCoordenadorProfessor() {
        coordenacao = new Professor("João Maria");
        curso = new Curso(coordenacao);
        professor = new Professor(curso);
        assertEquals("João Maria", professor.getNomeCoordenadorCurso());
    } //

    @Test
    public void deveImpedirEnsinoFundamentalIncompleto() {
        try {
            escolaridade = new Escolaridade("ensino fundamental incompleto");
            professor = new Professor(escolaridade);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Escolaridade inválida!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirEnsinoFundamental() {
        try {
            escolaridade = new Escolaridade("ensino fundamental");
            professor = new Professor(escolaridade);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Escolaridade inválida!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirEnsinoMedioIncompleto() {
        try {
            escolaridade = new Escolaridade("ensino médio incompleto");
            professor = new Professor(escolaridade);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Escolaridade inválida!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirEnsinoMedio() {
        try {
            escolaridade = new Escolaridade("ensino médio");
            professor = new Professor(escolaridade);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Escolaridade inválida!", e.getMessage());
        }
    }

    @Test
    public void deveImpedirProfessorEscolaridadeAusente() {
        try {
            professor = new Professor(escolaridade);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Professor sem escolaridade não é permitido!", e.getMessage());
        }
    }

   @Test
    public void deveImpedirNomeVazio() {
        try {
            escolaridade = new Escolaridade("Doutorado");
            professor = new Professor("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio não é permitido!", e.getMessage());
        }
   }
}