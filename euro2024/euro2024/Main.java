package euro2024;
import conexao.Conexao;
import conexao.EuroOperacoes;
import java.sql.*;

public class Main{
            
    public static void main(String[] args) {
        Connection con=Conexao.conectarDB();
        System.out.println(con+"\n");
        //Operacoes estao presentes na Classe EUROOperacoes
    }
    
}
