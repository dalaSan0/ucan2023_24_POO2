package euro2024;
import java.util.ArrayList;
import java.util.List;

public class Estadio {
    private String nome;
    private Cidade cidade;
    private int capacidade;
    private List<Jogo> jogos;

    public Estadio(String nome, Cidade cidade, int capacidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.capacidade = capacidade;
        this.jogos = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder saida=new StringBuilder();
        saida.append("Nome: ").append(nome);
        saida.append("\nCapacidade: " ).append(capacidade);
        saida.append("\nCidade: " ).append(cidade);
        
        return saida.toString();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }
    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }
    
    
}
