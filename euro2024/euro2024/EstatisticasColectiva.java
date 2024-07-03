package euro2024;

public class EstatisticasColectiva extends Estatisticas {
    private Selecao selecao;

    public EstatisticasColectiva(Selecao selecao) {
        super();
        this.selecao = selecao;
    }

    @Override
    public String toString() {
        StringBuilder saida=new StringBuilder();
        saida.append("Selecao: ").append(selecao);
        getEstatisticas().stream().forEach(dado->
            {saida.append(dado);saida.append("\n");}
        );
        return saida.toString();
    }

    public Selecao getSelecao() {
        return selecao;
    }
    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
    }
    
}
