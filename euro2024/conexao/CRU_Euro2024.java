package conexao;
import euro2024.Jogo;
import java.sql.*;

public class CRU_Euro2024 {
    /*
        inserir info
        actualizar info
            -classificacao,ranking estatistica
        consultas elaboradas
            -selecoes,classificacoes,estatisticasIndividuais,estatisticasColec
            -jogadores e seus rankings
    */
    
    /*
    public static int criarTabelaJogo(Connection con){
        try{
            
        }
        catch(SQLException e){
            return 0;
        }
    }
    */
    public static int criarJogo(Connection con,Jogo jogo){
         try{
            String sqlQuery="insert into jogo(home,away,resultado,estadio)values(?,?,?,?)";
            PreparedStatement pStmt=con.prepareStatement(sqlQuery);
            pStmt.setString(1, jogo.getSelecoes()[0].getNome());
            pStmt.setString(2, jogo.getSelecoes()[1].getNome());
            pStmt.setString(3, jogo.getResultado());
            pStmt.setString(4, jogo.getEstadio().getNome());
            pStmt.executeUpdate();
            return 1;
        }
        catch(SQLException e){
            return 0;
        }
    }
}
