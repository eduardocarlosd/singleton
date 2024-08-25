package padraodeprojeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {

    @Test
    public void deveRetornarAssistenteRequisicao() {
        Parametros.getInstance().setAssistenteRequisicao("Assistente 1");
        assertEquals("Assistente 1", Parametros.getInstance().getAssistenteRequisicao());
    }

    @Test
    public void deveRetornarFuncionarioLogado() {
        Parametros.getInstance().setFuncionarioLogado("Funcionario 1");
        assertEquals("Funcionario 1", Parametros.getInstance().getFuncionarioLogado());
    }

}