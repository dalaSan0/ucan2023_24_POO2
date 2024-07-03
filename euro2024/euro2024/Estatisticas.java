package euro2024;
import java.util.ArrayList;
import java.util.List;

public class Estatisticas {
    private List<Dado> estatisticas;

    public Estatisticas() {
        estatisticas = new ArrayList<>();
    }

    public List<Dado> getEstatisticas() {
        return estatisticas;
    }
    public List<Dado> getEstatisticas(String designacao) {
        List<Dado> estatisticasEsp;
        estatisticasEsp=estatisticas.stream()
                .filter(dado->dado.getDesignacao().equalsIgnoreCase(designacao))
           .collect(
                   ()->new ArrayList<Dado>(),
                   (lista,dado)->lista.add(dado),
                   (lista1,lista2)->lista1.addAll(lista2)
           );
        return estatisticasEsp;
    }
    public void addEstatisticas(Dado estatistica) {
        this.estatisticas.add(estatistica); 
    }
    public void setEstatisticas(List<Dado> estatisticas) {
        this.estatisticas = estatisticas;
    }
    
}
