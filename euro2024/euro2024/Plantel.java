package euro2024;
import java.util.ArrayList;
import java.util.List;

public class Plantel {
    private Selecao selecao;
    private List<Jogador> elenco;
    private Pessoa treinador;

    public Plantel(Selecao selecao, Pessoa treinador) {
        this.selecao = selecao;
        this.elenco = new ArrayList<>();
        this.treinador = treinador;
    }

    @Override
    public String toString() {
        StringBuilder saida=new StringBuilder("\nPLANTEL\n");
        
        elenco.stream().forEach(jogador->{
            saida.append(jogador.getPosicao()).append(" ");
            saida.append(jogador.getIndividualInfo()).append("\n"); 
        });
        
        return saida.toString();
    }

    public Selecao getSelecao() {
        return selecao;
    }
    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
    }

    public List<Jogador> getElenco() {
        return elenco;
    }
    public void setElenco(List<Jogador> elenco) {
        this.elenco = elenco;
    }

    public Pessoa getTreinador() {
        return treinador;
    }
    public void setTreinador(Pessoa treinador) {
        this.treinador = treinador;
    }
}
