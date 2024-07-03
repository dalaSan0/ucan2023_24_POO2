package euro2024;

public class EstatisticasIndividual extends Estatisticas {
    private Jogador jogador;

    public EstatisticasIndividual(Jogador jogador) {
        super();
        this.jogador = jogador;
    }

    @Override
    public String toString() {
        StringBuilder saida=new StringBuilder();
        saida.append("Jogador: ").append(jogador);
        getEstatisticas().stream().forEach(dado->
            {saida.append(dado);saida.append("\n");}
        );
        return saida.toString();
    }
    
    public Jogador getJogador() {
        return jogador;
    }
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
}
