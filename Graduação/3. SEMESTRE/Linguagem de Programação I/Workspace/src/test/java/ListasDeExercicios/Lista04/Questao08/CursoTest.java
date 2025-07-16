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
        assertEquals(0, curso.getNumeroAlunos());
    }

    @Test
    public void deveInserirUmAluno() {
        Curso curso = new Curso();
        Aluno aluno = new AlunoMensalista(curso, 1);
        curso.adicionarAluno(aluno);
        assertEquals(1, curso.getNumeroAlunos());
    }

    @Test
    public void deveInserirMaisDeUmAluno() {
        Curso curso = new Curso();
        Aluno alunoMensalista = new AlunoMensalista(curso, 1);
        curso.adicionarAluno(alunoMensalista);

        Aluno alunoIntegral = new AlunoIntegral(curso, 1);
        curso.adicionarAluno(alunoIntegral);

        Aluno alunoParcial = new AlunoParcial(curso, 1);
        curso.adicionarAluno(alunoParcial);

        assertEquals(3, curso.getNumeroAlunos());
    }

    @Test
    void deveAdicionarAluno() {
        Curso curso = new Curso();
        curso.setAlunos(new ArrayList<>());
        Aluno aluno = new AlunoIntegral(curso, 1);
        curso.adicionarAluno(aluno);
        assertEquals(1, curso.getNumeroAlunos());
        assertTrue(curso.verificarAluno(aluno));
    }

    @Test
    void deveImpedirAlunoNulo() {
        try {
            Curso curso = new Curso();
            curso.setAlunos(new ArrayList<>());
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
            curso.setAlunos(new ArrayList<>());
            Aluno aluno = new AlunoIntegral(curso, 1);
            curso.adicionarAluno(aluno);
            curso.adicionarAluno(aluno);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno inválido!", e.getMessage());
        }
    }

    @Test
    void deveRemoverAluno() {
        Curso curso = new Curso();
        curso.setAlunos(new ArrayList<>());
        Aluno aluno = new AlunoIntegral(curso, 1);
        curso.adicionarAluno(aluno);
        curso.removerAluno(aluno);
        assertFalse(curso.verificarAluno(aluno));
    }

    @Test
    void deveImpedirRemoverAlunoInexistente() {
        try {
            Curso curso = new Curso();
            curso.setAlunos(new ArrayList<>());
            Aluno aluno = new AlunoIntegral(curso, 1);
            curso.removerAluno(aluno);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Aluno não está matriculado no curso!", e.getMessage());
        }
    }

    @Test
    void deveConsultarDadosDosAlunos() {
        Curso curso = new Curso();
        curso.setAlunos(new ArrayList<>());

        AlunoIntegral aluno1 = new AlunoIntegral(curso, 101);
        aluno1.setNome("João");
        aluno1.setEndereco("Rua A");
        aluno1.setNumParcelas(6);
        aluno1.setValorMensalidade(300.0f);
        curso.adicionarAluno(aluno1);

        ArrayList<Integer> matriculas = curso.consultarAlunosPorMatricula();
        ArrayList<String> nomes = curso.consultarAlunosPorNome();
        ArrayList<String> enderecos = curso.consultarAlunosPorEndereco();
        ArrayList<Curso> cursos = curso.consultarAlunosPorCurso();
        ArrayList<Integer> parcelas = curso.consultarAlunosPorNumParcelas();
        ArrayList<Float> valores = curso.consultarAlunosPorValorMensalidade();

        assertEquals(1, matriculas.size());
        assertEquals(101, matriculas.get(0));
        assertEquals("João", nomes.get(0));
        assertEquals("Rua A", enderecos.get(0));
        assertEquals(curso, cursos.get(0));
        assertEquals(6, parcelas.get(0));
        assertEquals(300.0f, valores.get(0));
    }
}
