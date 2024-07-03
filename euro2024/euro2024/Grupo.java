package euro2024;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Grupo {
    private char designacao;
    private List<Selecao> selecoes;

    public Grupo(char designacao,Selecao s1,Selecao s2,Selecao s3,Selecao s4) {
        this.designacao = designacao;
        selecoes=Arrays.asList(s1,s2,s3,s4);
    }

    @Override
    public String toString() {
        StringBuilder saida=new StringBuilder();
        saida.append("GRUPO ").append(designacao).append("\n");
        saida.append("NOME|").append("PT|VI|EM|DE|GM|GS|SG|JG|").append("\n");
        selecoes=getColocacaooOrdenada();
        
        selecoes.stream().forEach(selecao->{
            saida.append(selecao.getPontuacao());
            saida.append("\n");
        });
        
        return saida.toString();
    }

    public char getDesignacao() {
        return designacao;
    }
    public void setDesignacao(char designacao) {
        this.designacao = designacao;
    }
    
    public List<Selecao> getColocacaooOrdenada(){
        List<Selecao> colocacaoOrdenada;
        
        colocacaoOrdenada=selecoes.stream()
                .sorted(Comparator.naturalOrder()).collect(
                ()->new ArrayList<Selecao>(),
                (lista,selecao)->lista.add(selecao),
                (lista1,lista2)->lista1.addAll(lista2)
        );
        return colocacaoOrdenada;
    }
    public List<Selecao> getSelecoes() {
        return selecoes;
    }
    public void setSelecoes(List<Selecao> selecoes) {
        this.selecoes = selecoes;
    }

    
}
