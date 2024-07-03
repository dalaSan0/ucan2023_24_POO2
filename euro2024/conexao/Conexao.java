package conexao;
import java.sql.*;;

public class Conexao implements Keywords{
    
    public static Connection conectarDB(){
        Connection con=null;
        try{
            con=DriverManager.getConnection(URL+DATABASE,USER,PASSWORD);
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return con;
    }
    
}
