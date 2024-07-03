package euro2024;

public class Pontuacao {
    private int jogos;
    private int pontos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golosMarcados;
    private int golosSofridos;
    private int golosSaldo;
    
    public Pontuacao(){
        pontos=vitorias=empates=derrotas=golosMarcados=golosSofridos=golosSaldo=jogos=0;
    }

    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public void addPontos(int pontos) {
        this.pontos += pontos;
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public void addVitorias() {
        this.vitorias ++;
        addPontos(3);
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public void addEmpates() {
        this.empates ++;
        addPontos(1);
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public void addDerrotas() {
        this.derrotas ++;
    }

    public int getGolosMarcados() {
        return golosMarcados;
    }
    public void setGolosMarcados(int golosMarcados) {
        this.golosMarcados = golosMarcados;
    }
    public int getGolosSofridos() {
        return golosSofridos;
    }
    public void setGolosSofridos(int golosSofridos) {
        this.golosSofridos = golosSofridos;
    }
    public void addGolos(int golosMarcados,int golosSofridos) {
        this.golosMarcados += golosMarcados;
        this.golosSofridos += golosSofridos;
    }

    public int getGolosSaldo() {
        golosSaldo= golosMarcados-golosSofridos;
        return golosSaldo;
    }
    public void setGolosSaldo(int golosSaldo) {
        this.golosSaldo = golosSaldo;
    }

    public void addJogos() {
        jogos++;
    }
    public int getJogos() {
        return jogos;
    }
    public void setJogos(int jogos) {
        this.jogos = jogos;
    }
}
