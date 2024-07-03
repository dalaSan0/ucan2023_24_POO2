package conexao;
import euro2024.EuroManagement;
import euro2024.Jogador;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EuroOperacoes implements Keywords{
    private Scanner lerTeclado; 
    private EuroManagement euroM;
    private int opCont=1;
    private List<Jogador> jogadores;
    
    public EuroOperacoes(){
        lerTeclado=new Scanner(System.in);
        euroM=new EuroManagement();
    }
    
    public void criarJogo(){
        getGrupos();
        int idGrupo= validarGrupo();
        System.out.println("GRUPO "+euroM.getGrupos().get(idGrupo-1).getDesignacao());
        getSelecoes(idGrupo);
        int[] idSelecao=validarSelecao();
        getEstadios();
        int idEstadio=validarEstadio();
        String resultado=validarResultado();
        euroM.criarJogo(idGrupo-1,resultado,idSelecao[0]-1,idSelecao[1]-1,idEstadio-1);
        
    }
    
    public void getMelhoresMarcadore(){
        System.out.println("Melhores Marcadores");
        euroM.getSelecoes().stream().forEach(selecao->{
            jogadores=selecao.getElenco().getElenco().stream().filter(jogador->!jogador.getStats()
                    .getEstatisticas(EVENTOS.get(0)).isEmpty())
                    .collect(
                            ()->new ArrayList<Jogador>(),
                            (lista,jogador)->lista.add(jogador),
                            (lista1,lista2)->lista1.addAll(lista2)
                    );
        });
        Comparator<Jogador> comparator=(Jogador j1,Jogador j2)->
                j1.getStats().getEstatisticas(EVENTOS.get(0)).size()<
                j2.getStats().getEstatisticas(EVENTOS.get(0)).size() ? 1:-1;
        
        jogadores.stream().sorted(comparator);
    }
    public void addEvento(){
        reinicializarCont();
        EVENTOS.stream().forEach(evento->
            System.out.printf("%d- %s",opCont++,evento));
        System.out.print("Selecione o Evento: ");
        int opcao=lerTeclado.nextInt();
        int idJogo=validarJogo();
        System.out.printf("Qual Selecao:\n1-%s | 2- %s",
                euroM.getCalendarioTorneio().getJogos().get(idJogo-1).getSelecoes()[0].getNome(),
                euroM.getCalendarioTorneio().getJogos().get(idJogo-1).getSelecoes()[1].getNome());
        int selecao=lerTeclado.nextInt();
        if(selecao>2) selecao=2;
        if(selecao<1) selecao=1;
        addEvento(EVENTOS.get(opcao-1),idJogo,selecao-1);
        
    }
    public void addEvento(String evento,int idJogo,int selecao){
        int minuto=validarMinuto();
        int idJogador=validarJogador(selecao,idJogo);
        Jogador jogador=euroM.getCalendarioTorneio().getJogos().get(idJogo)
                .getSelecoes()[selecao].getElenco().getElenco().get(idJogador);
        
        euroM.getCalendarioTorneio().getJogos().get(idJogo-1).addEventos(jogador, evento, minuto);
    }     
    public int validarJogador(int selecao,int idJogo){
        euroM.getCalendarioTorneio().getJogos().get(idJogo)
                .getSelecoes()[selecao].getElenco().getElenco().stream().forEach(jogador->{
            System.out.printf("%d- %s%n",opCont++,jogador.getSobrenome());
        });
        int idJogador=0;
        while(true){
            System.out.print("Selecione o Jogador: ");
            idJogador=lerTeclado.nextInt();
            if(idJogador>0 && idJogador<euroM.getCalendarioTorneio().getJogos().get(idJogo)
                .getSelecoes()[selecao].getElenco().getElenco().size()) break;
            else  System.out.println("Insira identificador de jogador valido");
        }
        return idJogador;
    }
    public int validarMinuto(){
        int minuto=0;
        while(true){
            System.out.print("Em que minuto ocorreu: ");
            minuto=lerTeclado.nextInt();
            if(minuto>0 && minuto<110) break;
            else System.out.println("Insira minutos validos");
        }
        return minuto;
    }
    public void mostrarJogos(){
        reinicializarCont();
        if(euroM.getCalendarioTorneio().getJogos().size()<0)
            System.out.println("SEM JOGOS REGISTRADOS");
        else{
            euroM.getCalendarioTorneio().getJogos().stream().forEach(jogo->
            System.out.printf("%d- %s VS %s%n",opCont++,
            jogo.getSelecoes()[0].getNome(),jogo.getSelecoes()[1].getNome()));
        }
    }
    public int validarJogo(){
        int idJogo=0;
        while(true){
            System.out.print("Selecione um jogo para adicionar Eventos");
            idJogo=lerTeclado.nextInt();
            if(idJogo>0 && idJogo<euroM.getCalendarioTorneio().getJogos().size())break;
            else System.out.println("Selecione o identificador de um jogo existent");
        }
        return idJogo;
    }
    
    public String validarResultado(){
        String resultado="";
        while(true){
            System.out.print("Insira o resultado deste jogo\nFormato:n-n onde n representa os Golos: ");
            resultado=lerTeclado.next();
            if(resultado.contains("-")) break;
            else System.out.println("Formato Invalido");
        }
        
        return resultado;
    }
    
    public int validarGrupo(){
        int idGrupo=0;
        while(true){
            System.out.print("Selecione o grupo para criar o jogo desejado: ");
            idGrupo=lerTeclado.nextInt();
            if(idGrupo>0 && idGrupo<7)break;
            else System.out.println("Selecione um grupo entre 1-6");
        }
        return idGrupo;
    }
    public void getGrupos(){
        reinicializarCont();
        euroM.getGrupos().stream().forEach(grupo->{
            System.out.printf("%d- Grupo %c%n",opCont++,grupo.getDesignacao());
        });
    }
    
    public int[] validarSelecao(){
        int[] idSelecao={0,0};
        int aux=0;
        while(true){
            System.out.printf("Selecione a %dº selecao: ",aux+1);
            idSelecao[aux]=lerTeclado.nextInt();
            if(idSelecao[aux]<0 || idSelecao[aux]>4)
                System.out.println("Selecione uma selecao entre 1-4");
            else aux++;
            if(aux==2) break;
        }
        return idSelecao;
    }
    public void getSelecoes(int idGrupo){
        reinicializarCont();
        euroM.getGrupos().get(idGrupo - 1).getSelecoes().stream().forEach(selecao->{
            System.out.printf("%d- %s%n",opCont++,selecao.getNome());
        });
    }
    
    public int validarEstadio(){
        int idEstadio=0;
        while(true){
           System.out.print("Selecione um estadio onde vai decorrer o jogo: ");
           idEstadio=lerTeclado.nextInt();
           if(idEstadio>0 && idEstadio<11) break;
           else System.out.println("Selecione uma estadio entre 1-10");
        }
        return idEstadio;
    }
    public void getEstadios(){
        System.out.println("\nESTADIOS");
        reinicializarCont();
        euroM.getEstadios().stream().forEach(estadio->{
            System.out.printf("%02d- %s%n",opCont++,estadio.getNome());
        });
    }

    public EuroManagement getEuroM() {
        return euroM;
    }
    public void setEuroM(EuroManagement euroM) {
        this.euroM = euroM;
    }
    public void reinicializarCont(){
        this.opCont=1;
    }
    
}
