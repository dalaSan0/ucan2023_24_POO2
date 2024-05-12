
public class Movie {
    private String titulo;
    private String director;
    private int duracaoEmMinutos;
    private int anoLancamento;

    public Movie(String titulo, String director, int duracaoEmMinutos, int anoLancamento) {
        this.titulo = titulo;
        this.director = director;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.anoLancamento = anoLancamento;
    }
    
    @Override
    public String toString(){
        StringBuilder saida=new StringBuilder();
        saida.append("Titulo: ").append(titulo);
        saida.append(" (").append(anoLancamento).append(")"); 
        saida.append("\nDirector: ").append(director);
        saida.append("\n").append(duracaoEmMinutos).append(" Minutos");
        saida.append("\n-----------------------");
        return saida.toString();
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
