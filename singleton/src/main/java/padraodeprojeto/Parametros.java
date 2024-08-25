package padraodeprojeto;


public class Parametros {

    private Parametros() {};
    private static Parametros instance = new Parametros();
    public static Parametros getInstance() {
        return instance;
    }

    private String assistenteRequisicao;
    private String funcionarioLogado;

    public String getAssistenteRequisicao() {
        return assistenteRequisicao;
    }

    public void setAssistenteRequisicao(String assistenteRequisicao) {
        this.assistenteRequisicao = assistenteRequisicao;
    }

    public String getFuncionarioLogado() {
        return funcionarioLogado;
    }

    public void setFuncionarioLogado(String funcionarioLogado) {
        this.funcionarioLogado = funcionarioLogado;
    }
}
