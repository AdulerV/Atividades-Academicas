package ListasDeExercicios.Lista04.Questao08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class CursoTest {
    @Test
    void deveInserirCodigo() {
        Curso curso = new Curso();
        curso.setCodigo(10);
        assertEquals(10, curso.getCodigo());
    }

    @Test
    void deveLancarExcecaoCodigoInvalido() {
        try {
            Curso curso = new Curso();
            curso.setCodigo(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Código inválido!", e.getMessage());
        }
    }

    @Test
    void deveInserirDescricao() {
        Curso curso = new Curso();
        curso.setDescricao("Sistemas de Informação");
        assertEquals("Sistemas de Informação", curso.getDescricao());
    }

    @Test
    void deveLancarExcecaoDescricaoInvalida() {
        try {
            Curso curso = new Curso();
            curso.setDescricao(" ");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Descrição inválida!", e.getMessage());
        }
    }

    @Test
    void deveInserirCargaHoraria() {
        Curso curso = new Curso();
        curso.setCargaHoraria(200.0f);
        assertEquals(200.0f, curso.getCargaHoraria());
    }

    @Test
    void deveLancarExcecaoCargaHorariaInvalida() {
        try {
            Curso curso = new Curso();
            curso.setCargaHoraria(0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Carga horária inválida!", e.getMessage());
        }
    }

    @Test
    void deveInserirListaAlunos() {
        Curso curso = new Curso();
        ArrayList<Aluno> alunos = new ArrayList<>();
        curso.setAlunos(alunos);
        assertEquals(alunos, curso.getAlunos());
    }

    @Test
    public void deveRetornarNenhumAluno() {
        Curso curso = new Curso();
        assertEquals(0, curso.obterQuantidadeAlunos());
    }

    @Test
    public void deveInserirUmAluno() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoMensalista(curso, 1);
        curso.adicionarAluno(aluno);
        assertEquals(1, curso.obterQuantidadeAlunos());
    }

    @Test
    public void deveInserirMaisDeUmAluno() {
        Curso curso = new Curso();
        Aluno alunoMensalista = new AlunoMensalista(curso, 1);
        curso.adicionarAluno(alunoMensalista);

        Aluno alunoIntegral = new AlunoIntegral(curso, 2);
        curso.adicionarAluno(alunoIntegral);

        Aluno alunoParcial = new AlunoParcial(curso, 3);
        curso.adicionarAluno(alunoParcial);

        assertEquals(3, curso.obterQuantidadeAlunos());
    }

    @Test
    void deveAdicionarAluno() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoIntegral(curso, 1);
        curso.adicionarAluno(aluno);
        assertEquals(1, curso.obterQuantidadeAlunos());
        assertTrue(curso.verificarAluno(aluno));
    }

    @Test
    void deveImpedirAlunoNulo() {
        try {
            Curso curso = new Curso();

            curso.adicionarAluno(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno inválido!", e.getMessage());
        }
    }

    @Test
    void deveImpedirAlunoDuplicado() {
        try {
            Curso curso = new Curso();
            Aluno aluno = new AlunoIntegral(curso, 1);
            curso.adicionarAluno(aluno);
            curso.adicionarAluno(aluno);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno inválido!", e.getMessage());
        }
    }

    @Test
    void deveImpedirAlunoMatriculaIgual() {
        try {
            Curso curso = new Curso();
            Aluno aluno1 = new AlunoIntegral(curso, 1);
            Aluno aluno2 = new AlunoIntegral(curso, 1);
            curso.adicionarAluno(aluno1);
            curso.adicionarAluno(aluno2);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno inválido!", e.getMessage());
        }
    }

    @Test
    void deveRemoverAluno() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoIntegral(curso, 1);
        curso.adicionarAluno(aluno);
        curso.removerAluno(aluno);
        assertFalse(curso.verificarAluno(aluno));
    }

    @Test
    void deveImpedirRemoverAlunoInexistente() {
        try {
            Curso curso = new Curso();

            Aluno aluno = new AlunoIntegral(curso, 1);
            curso.removerAluno(aluno);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno não está matriculado no curso!", e.getMessage());
        }
    }

    @Test
    void deveConsultarMatriculaAluno() {
        Curso curso = new Curso();

        AlunoIntegral aluno = new AlunoIntegral(curso, 101);
        curso.adicionarAluno(aluno);

        ArrayList<Integer> matriculas = curso.consultarAlunosPorMatricula();

        assertEquals(1, matriculas.size());
        assertEquals(101, matriculas.get(0));
    }

    @Test
    void deveConsultarNomeAluno() {
        Curso curso = new Curso();

        AlunoIntegral aluno = new AlunoIntegral(curso, 101);
        aluno.setNome("João");
        curso.adicionarAluno(aluno);

        ArrayList<String> nomes = curso.consultarAlunosPorNome();

        assertEquals("João", nomes.get(0));
    }

    @Test
    void deveConsultarEnderecoAluno() {
        Curso curso = new Curso();

        AlunoIntegral aluno = new AlunoIntegral(curso, 101);
        aluno.setEndereco("Rua A");
        curso.adicionarAluno(aluno);

        ArrayList<String> enderecos = curso.consultarAlunosPorEndereco();

        assertEquals("Rua A", enderecos.get(0));
    }

    @Test
    void deveConsultarCursoAluno() {
        Curso curso = new Curso();

        AlunoIntegral aluno = new AlunoIntegral(curso, 101);
        curso.adicionarAluno(aluno);

        ArrayList<Curso> cursos = curso.consultarAlunosPorCurso();

        assertEquals(curso, cursos.get(0));
    }

    @Test
    void deveConsultarNumeroParcelasAluno() {
        Curso curso = new Curso();

        AlunoIntegral aluno = new AlunoIntegral(curso, 101);
        aluno.setNumeroParcelas(6);
        curso.adicionarAluno(aluno);

        ArrayList<Integer> parcelas = curso.consultarAlunosPorNumeroParcelas();

        assertEquals(6, parcelas.get(0));
    }

    @Test
    void deveConsultarValorMensalidadeAluno() {
        Curso curso = new Curso();

        AlunoIntegral aluno = new AlunoIntegral(curso, 101);
        aluno.setValorMensalidade(300.0f);
        curso.adicionarAluno(aluno);

        ArrayList<Float> valores = curso.consultarAlunosPorValorMensalidade();

        assertEquals(300.0f, valores.get(0));
    }
}
