package euro2024;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

public class Jogo implements conexao.Keywords,Comparable<Jogo>{
    private Calendar calendario;
    private Selecao[] selecoes;
    private Estadio estadio;
    private String estadoDoJogo;
    private String fase;
    private String resultado;
    private List<String> eventos;
    
    public Jogo(Selecao home,Selecao away,String fase,Estadio estadio,Calendar calendario){
        selecoes=new Selecao[2];
        eventos=new ArrayList<>();
        selecoes[0]=home;
        selecoes[1]=away;
        this.estadio=estadio;
        this.calendario=calendario;
        this.fase=fase;
        estadoDoJogo="Por Decorrer";
        resultado="";
    }

    @Override
    public String toString() {
        StringBuilder saida=new StringBuilder();
        String res=" VS ";
        if(estadoDoJogo.equalsIgnoreCase("Terminado")) res=" "+resultado+" ";
        saida.append(selecoes[0].getNome()).append(res);
        saida.append(selecoes[1].getNome()).append("\n");
        saida.append("ESTADIO:\n").append(estadio);
        saida.append("\nHorario->").append(getHora()).append(":");
        saida.append(getMinuto()).append("\n");
        saida.append(getDia()).append("/").append(getMes()); 
        
        return saida.toString();
    }
    
    public void setResultado(String resultado){
        String[] res=resultado.split("-");
        int home=Integer.parseInt(res[0]);
        int away=Integer.parseInt(res[1]);
        checkWinner(home,away);
        setEstado(2); //JOGO CONCLUIDO
        this.resultado=resultado;
        selecoes[0].getFaseGruposPontuacao().addJogos();
        selecoes[1].getFaseGruposPontuacao().addJogos();
    }
    public String getResultado() {
        return resultado;
    }
    
    private void checkWinner(int home,int away){
        if(home>away){
            selecoes[0].getFaseGruposPontuacao().addVitorias();
            selecoes[1].getFaseGruposPontuacao().addDerrotas();
        }
        else 
            if(home<away){
            selecoes[1].getFaseGruposPontuacao().addVitorias();
            selecoes[0].getFaseGruposPontuacao().addDerrotas();
            }
            else{
            selecoes[0].getFaseGruposPontuacao().addEmpates();
            selecoes[1].getFaseGruposPontuacao().addEmpates();
            }
        selecoes[0].getFaseGruposPontuacao().addGolos(home, away);
        selecoes[1].getFaseGruposPontuacao().addGolos(away, home);
    }

    public List<String> getEventos() {
        return eventos;
    }
    public void addEventos(Jogador jogador,String evento,int minuto) {
        
        Evento novoEvento=(player,event,min) -> {
            StringBuilder saida=new StringBuilder();
            saida.append(event).append(": ");
            saida.append(jogador.getSobrenome());
            saida.append(String.format(" -%02dmins",min));
            
            String[] splitterEvento=evento.split("-");
            player.addStats(new Dado(splitterEvento[0],min)); 
            
            return saida.toString();
        };
        
        eventos.add(novoEvento.registrarEvento(jogador,evento, minuto));
    }
    public void addEventos(Jogador jogadorSair,Jogador jogadorEntrar,String evento,int minuto) {
        
        Evento novoEvento=(player,event,min) -> {
            StringBuilder saida=new StringBuilder();
            saida.append(event);
            saida.append(String.format("-%02dmins | Entra:%s Sai:%s",min
            ,jogadorEntrar.getSobrenome(),jogadorSair.getSobrenome()));
            
            String[] splitterEvento=evento.split("-");
            player.addStats(new Dado(splitterEvento[0],min)); 
            
            return saida.toString();
        };
        
        eventos.add(novoEvento.registrarEvento(jogadorEntrar,evento, minuto));
    }
    
    public Selecao[] getSelecoes() {
        return selecoes;
    }
    public void setSelecoes(Selecao[] selecoes) {
        this.selecoes = selecoes;
    }

    public Estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public String getEstadoDoJogo() {
        return estadoDoJogo;
    }
    public void setEstado(int estado) {
        switch(estado){
            case 0:this.estadoDoJogo="Por Decorrer";
            break;
            case 1: this.estadoDoJogo="A Decorrer";
            break;
            case 2: this.estadoDoJogo="Terminado";
            break;
        }
    }

    public String getFase() {
        return fase;
    }
    public void setFase(String fase) {
        this.fase = fase;
    } 
    
    public Calendar getCalendario() {
        return calendario;
    }
    public int getDia(){
        return calendario.get(Calendar.DAY_OF_MONTH);
    }
    public int getDiaSemana(){
        return calendario.get(Calendar.DAY_OF_WEEK);
    }
    public int getMes(){
        return calendario.get(Calendar.MONTH);
    }
    public int getAno(){
        return calendario.get(Calendar.YEAR);
    }
    public int getHora(){
        return calendario.get(Calendar.HOUR_OF_DAY);
    }
    public int getMinuto(){
        return calendario.get(Calendar.MINUTE);
    }
    public void setCalendario(Calendar calendario) {
        this.calendario = calendario;
    }
    public void setCalendario(int ano,int mes,int dia,int hora,int minuto) {
        calendario.set(Calendar.YEAR, ano);
        calendario.set(Calendar.MONTH, mes-1);
        calendario.set(Calendar.DAY_OF_MONTH, dia);
        calendario.set(Calendar.HOUR_OF_DAY, hora);
        calendario.set(Calendar.MINUTE, minuto);
        calendario.set(Calendar.SECOND, 0);
    }
    
    @Override
    public int compareTo(Jogo that) {
        if(this.getMes()>that.getMes()) return 1;
        if(this.getMes()==that.getMes())
            if(this.getDia()>that.getDia()) return 1;
            else return -1;
        return -1;
    }
}
