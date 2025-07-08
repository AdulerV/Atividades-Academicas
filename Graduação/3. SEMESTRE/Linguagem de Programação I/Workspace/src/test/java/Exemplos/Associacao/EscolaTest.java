package Exemplos.Associacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {
    @Test
    public void deveRetornarEscolaridadeDiretor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setNome("Bacharelado");
        Professor professor = new Professor();
        professor.setEscolaridade(escolaridade);
        Escola escola = new Escola();
        escola.setDirecao(professor);
        assertEquals("Bacharelado", escola.getNomeEscolaridadeDirecao());
    }
}