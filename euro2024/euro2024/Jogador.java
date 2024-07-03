package euro2024;

public class Jogador extends Pessoa{
    private String posicao;
    private EstatisticasIndividual stats;

    public Jogador(String nome,String sobrenome, int idade, Selecao selecao,String posicao) {
        super(nome,sobrenome, idade);
        this.posicao=posicao;
        setSelecao(selecao);
        stats=new EstatisticasIndividual(this);
    }

    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public EstatisticasIndividual getStats() {
        return stats;
    }
    public void addStats(Dado dado) {
        this.stats.addEstatisticas(dado);
        getSelecao().getStats().addEstatisticas(dado);
    }
    public void setStats(EstatisticasIndividual stats) {
        this.stats = stats;
    }
    
}
