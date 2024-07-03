package euro2024;

import java.util.List;

public class Selecao implements Comparable<Selecao>{
    private String nome;
    private String sigla;
    private Plantel elenco;
    private Pessoa treinador;
    private Pontuacao faseGruposPontuacao;
    private EstatisticasColectiva stats;

    public Selecao(String nome,Pessoa treinador) {
        this.nome = nome;
        this.treinador=treinador;
        elenco=new Plantel(this,treinador);
        faseGruposPontuacao=new Pontuacao();
        sigla=String.valueOf(nome.toUpperCase().charAt(0));
        sigla+=String.valueOf(nome.toUpperCase().charAt(1));
        sigla+=String.valueOf(nome.toUpperCase().charAt(2));
        stats=new EstatisticasColectiva(this); 
    }

    @Override
    public String toString() {
        StringBuilder saida=new StringBuilder();
        saida.append(nome.toUpperCase()).append(" \n");
        saida.append("Treinador-> ").append(treinador.getFullName());
        saida.append(elenco);
        
        return saida.toString();
    }

    public String getPontuacao(){
        StringBuilder saida=new StringBuilder();
        saida.append(sigla).append(" ").append("|");
        saida.append(String.format("%02d|", faseGruposPontuacao.getPontos()));
        saida.append(String.format("%02d|", faseGruposPontuacao.getVitorias()));
        saida.append(String.format("%02d|", faseGruposPontuacao.getEmpates()));
        saida.append(String.format("%02d|", faseGruposPontuacao.getDerrotas()));
        saida.append(String.format("%02d|", faseGruposPontuacao.getGolosMarcados()));
        saida.append(String.format("%02d|", faseGruposPontuacao.getGolosSofridos()));
        saida.append(String.format("%02d|", faseGruposPontuacao.getGolosSaldo()));
        saida.append(String.format("%02d|", faseGruposPontuacao.getJogos()));
        return saida.toString();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Plantel getElenco() {
        return elenco;
    }
    public void addElenco(List<Jogador> elenco) {
        this.elenco.setElenco(elenco); 
    }

    public Pessoa getTreinador() {
        return treinador;
    }
    public void setTreinador(Pessoa treinador) {
        this.treinador = treinador;
    }

    public Pontuacao getFaseGruposPontuacao() {
        return faseGruposPontuacao;
    }
    public void setFaseGruposPontuacao(Pontuacao faseGruposPontuacao) {
        this.faseGruposPontuacao = faseGruposPontuacao;
    }

    public EstatisticasColectiva getStats() {
        return stats;
    }
    

    @Override
    public int compareTo(Selecao that) {
        if(this.getFaseGruposPontuacao().getPontos()<that.getFaseGruposPontuacao().getPontos())
            return 1;
        if(this.getFaseGruposPontuacao().getPontos()>that.getFaseGruposPontuacao().getPontos())
            return -1;
        if(this.getFaseGruposPontuacao().getGolosSaldo()<that.getFaseGruposPontuacao().getGolosSaldo())
            return 1;
        if(this.getFaseGruposPontuacao().getGolosSaldo()>that.getFaseGruposPontuacao().getGolosSaldo())
            return -1;
        if(this.getFaseGruposPontuacao().getGolosMarcados()<that.getFaseGruposPontuacao().getGolosMarcados())
            return 1;
        if(this.getFaseGruposPontuacao().getGolosMarcados()>that.getFaseGruposPontuacao().getGolosMarcados())
            return -1;
        return 1;
    }
    
    
}
