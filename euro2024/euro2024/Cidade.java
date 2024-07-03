package euro2024;

public class Cidade implements conexao.Keywords{
    private String nome;
    private String pais;
    private double areaEmKm_2;

    public Cidade(String nome, double areaEmKm_2) {
        this.nome = nome;
        this.areaEmKm_2 = areaEmKm_2;
        this.pais=PAIS_ORGANIZADOR;
    }

    @Override
    public String toString() {
        StringBuilder saida=new StringBuilder();
        saida.append(nome).append("\t");
        saida.append(areaEmKm_2).append(" Km^2");
        
        return saida.toString();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getAreaEmKm_2() {
        return areaEmKm_2;
    }
    public void setAreaEmKm_2(double areaEmKm_2) {
        this.areaEmKm_2 = areaEmKm_2;
    }
    
}
