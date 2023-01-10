import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomovelTest {

    @Test
    void deveArmazenarEstados() {
        Automovel aluno = new Automovel();
        aluno.setEstado(AutomovelAlugado.getInstance());
        aluno.setEstado(AutomovelDisponivel.getInstance());
        assertEquals(2, aluno.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Automovel aluno = new Automovel();
        aluno.setEstado(AutomovelDisponivel.getInstance());
        aluno.setEstado(AutomovelAlugado.getInstance());
        aluno.restauraEstado(0);
        assertEquals(AutomovelDisponivel.getInstance(), aluno.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Automovel aluno = new Automovel();
        aluno.setEstado(AutomovelEmManutencao.getInstance());
        aluno.setEstado(AutomovelDisponivel.getInstance());
        aluno.setEstado(AutomovelAlugado.getInstance());
        aluno.restauraEstado(2);
        assertEquals(AutomovelAlugado.getInstance(), aluno.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Automovel aluno = new Automovel();
            aluno.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}