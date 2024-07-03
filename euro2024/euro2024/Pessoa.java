package euro2024;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String nacionalidade;
    private Selecao selecao;

    public Pessoa(String nome,String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome=sobrenome;
        this.idade = idade;
    }
    public Pessoa(String nome,String sobrenome, int idade,String nacionalidade) {
        this.nome = nome;
        this.sobrenome=sobrenome;
        this.idade = idade;
        this.nacionalidade=nacionalidade;
    }

    @Override
    public String toString() {
        StringBuilder saida=new StringBuilder();
        saida.append(String.format("%-16s %-14s",sobrenome.toUpperCase(),nome));
        saida.append(idade).append("Anos ");
        saida.append("\n").append("Selecao: ").append(selecao.getNome());
         
        return saida.toString();
    }

    public String getIndividualInfo(){
        StringBuilder saida=new StringBuilder();
        saida.append(String.format("%-16s %-14s",sobrenome.toUpperCase(),nome));
        saida.append(idade).append("Anos ");
        
        return saida.toString();
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getFullName(){
        StringBuilder saida=new StringBuilder();
        saida.append(nome.charAt(0)).append(". ");
        saida.append(sobrenome);
        return saida.toString();
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Selecao getSelecao() {
        return selecao;
    }
    public void setSelecao(Selecao selecao) {
        this.selecao = selecao;
        nacionalidade=selecao.getNome();
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    
}
