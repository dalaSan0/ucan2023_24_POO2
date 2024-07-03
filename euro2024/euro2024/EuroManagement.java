package euro2024;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.security.SecureRandom;

public final class EuroManagement implements conexao.Keywords{
    
    private List<Selecao> selecoes;
    private List<Grupo> grupos;
    //private List<Jogo> jogosConcluidos;
    private List<Estadio> estadios;
    private CalendarioTorneio calendarioTorneio;
    private Calendar calendario;
    private String fase;
    
    public EuroManagement(){
        grupos=new ArrayList<>();
        SelecoesSetup s=new SelecoesSetup();
        selecoes=s.getSelecoes();
        gruposSetup();
        //jogosConcluidos=new ArrayList<>();
        calendarioTorneio=new CalendarioTorneio();
        estadios=s.getEstadios();
        calendario=Calendar.getInstance();
        this.fase=GROUP_STAGE;
    }
    
    public void criarJogo(int grupoId,String resultado,int selecaoNum1,int selecaoNum2,int estadioNum){
        Grupo grupo=grupos.get(grupoId);
        Jogo jogo=new Jogo( grupo.getSelecoes().get(selecaoNum1),
                            grupo.getSelecoes().get(selecaoNum2),
                           fase,estadios.get(estadioNum),calendario);
        if(!checarJogosPendentes(jogo)){
        jogo.setResultado(resultado); 
        calendarioTorneio.addJogo(jogo);
        }
        //else 
    }
    
    public void gruposSetup(){
        char nome='A';
        
        for(int i=0;i<24;i+=4){
            grupos.add(new Grupo(nome,
                    selecoes.get(i),selecoes.get(i+1),
                    selecoes.get(i+2),selecoes.get(i+3)));
            nome++;
        }
    }
    
    public boolean checarJogosPendentes(Jogo jogo){
        return jogo.getSelecoes()[0].getFaseGruposPontuacao().getJogos()>3 ||
               jogo.getSelecoes()[1].getFaseGruposPontuacao().getJogos()>3 ;
    }
    public boolean checarJogosPendentes(Grupo grupo){
        int cont=0;
        
        //SISTEMA QUE CHECA JOGOS FEITOS
        for(Selecao selecao:grupo.getSelecoes()){
            if(cont>2) return false;
            if(selecao.getFaseGruposPontuacao().getJogos()>3) cont++;
        }
            
        return true;
    }
    
    public void simularJornada(){
        SecureRandom random=new SecureRandom();
        int i=0;
        while(i<6){
            if(checarJogosPendentes(grupos.get(i))){
                int s1=-1,s2=-1;
                for(int j=0;j<4;j++){
                    if(s2>-1) break;
                    if(grupos.get(i).getSelecoes().get(j).getFaseGruposPontuacao().getJogos()<3)
                        if(s1==-1) s1=j;
                        else s2=j;
                }
                if(s2>-1){
                    StringBuilder resultado=new StringBuilder();
                    resultado.append(random.nextInt(6));
                    resultado.append("-").append(random.nextInt(6));
                    criarJogo(i,resultado.toString(),s1,s2,random.nextInt(10));
                }
            }
            i++;
        }
    }

    public List<Selecao> getSelecoes() {
        return selecoes;
    }
    public void setSelecoes(List<Selecao> selecoes) {
        this.selecoes = selecoes;
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }
    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    /*
    public List<Jogo> getJogosConcluidos() {
        return jogosConcluidos;
    }
    public void setJogosConcluidos(List<Jogo> jogosConcluidos) {
        this.jogosConcluidos = jogosConcluidos;
    }
    */

    public CalendarioTorneio getCalendarioTorneio() {
        return calendarioTorneio;
    }
    public void setCalendarioTorneio(CalendarioTorneio calendarioTorneio) {
        this.calendarioTorneio = calendarioTorneio;
    }

    public List<Estadio> getEstadios() {
        return estadios;
    }
    public void setEstadios(List<Estadio> estadios) {
        this.estadios = estadios;
    }

    public Calendar getCalendario() {
        return calendario;
    }
    public void setCalendario(Calendar calendario) {
        this.calendario = calendario;
    }

    public String getFase() {
        return fase;
    }
    public void setFase(String fase) {
        this.fase = fase;
    }
}
