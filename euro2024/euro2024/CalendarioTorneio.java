package euro2024;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CalendarioTorneio implements conexao.Keywords{
    private List<Jogo> jogos;
    
    public CalendarioTorneio(List<Jogo> jogos){
        this.jogos=jogos;
    }
    public CalendarioTorneio(){
        this.jogos=new ArrayList<>(); 
    }
    
    @Override
    public String toString(){
        StringBuilder saida=new StringBuilder();
        saida.append(COMPETICAO+"\n");
        jogos.stream().forEach(jogo->saida.append(jogo).append("\n"));
        return saida.toString();
    }
    
    public List<Jogo> getJogosDia(int dia) {
        List<Jogo> jogosDoDia;
        jogosDoDia=jogos.stream().filter(jogo->jogo.getDia()==dia)
           .sorted(Comparator.naturalOrder())
           .collect(
                   ()->new ArrayList<Jogo>(),
                   (lista,jogo)->lista.add(jogo),
                   (lista1,lista2)->lista1.addAll(lista2)
           );
       
        return jogosDoDia;
    }
    public List<Jogo> getJogosMes(int mes) {
        List<Jogo> jogosDoMes;
        jogosDoMes=jogos.stream().filter(jogo->jogo.getDia()==mes)
           .sorted(Comparator.naturalOrder())
           .collect(
                   ()->new ArrayList<Jogo>(),
                   (lista,jogo)->lista.add(jogo),
                   (lista1,lista2)->lista1.addAll(lista2)
           );
       
        return jogosDoMes;
    }
    public List<Jogo> getJogosADecorrer(int dia) {
        List<Jogo> jogosActuais=getJogosDia(dia);
        
        jogosActuais=jogosActuais.stream().filter(jogo->jogo.getEstadoDoJogo().equalsIgnoreCase("A Decorrer"))
           .sorted(Comparator.naturalOrder())
           .collect(
                   ()->new ArrayList<Jogo>(),
                   (lista,jogo)->lista.add(jogo),
                   (lista1,lista2)->lista1.addAll(lista2)
           );
       
        return jogosActuais;
    }
    
    
    public void addJogo(Jogo jogo) {
        this.jogos.add(jogo); 
    }
    public List<Jogo> getJogos() {
        return jogos;
    }
    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }
    
}
