package euro2024;

public class Dado {
    private String designacao;
    private int valor;

    public Dado(String designacao, int valor) {
        this.designacao = designacao;
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder saida=new StringBuilder();
        saida.append(designacao).append(": ").append(valor);
        
        return saida.toString();
    }

    public String getDesignacao() {
        return designacao;
    }
    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }
    
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
