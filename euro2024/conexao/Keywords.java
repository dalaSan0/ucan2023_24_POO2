package conexao;
import java.util.Arrays;
import java.util.List;

public interface Keywords {
    public final String URL="jdbc:mysql://localhost:3306/";
    public final String DRIVER="com.mysql.jdbc.driver";  
    public final String USER="root";
    public final String PASSWORD="abcd1234";
    public final String DATABASE="euro2024_db"; 
    
    public final String TABLE_A="";
    
    public final String PAIS_ORGANIZADOR="Alemanha";
    public final String COMPETICAO="CAMPEONATO EUROPEU 2024";
    public final String GROUP_STAGE="Fase De Grupos";
    public final String LAST16="Oitavos de Final";
    public final String LAST08="Quartos de Final";
    public final String SEMI_FINALS="Semi Final";
    public final String FINAL="Final";
    
    public final List<String> EVENTOS= Arrays.asList("Golo","Assistencia",
            "Cartao Amarelo","Cartao Vermelho","Fora de Jogo",
            "Falta","Lesao");
}
