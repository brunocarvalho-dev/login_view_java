package dal;
import java.sql.*;

public class ModuloConexcao {
    public static Connection connector(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/usuario_login";
        String user = "root";
        String password = "";

        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }catch(Exception e){
            return null;
        }
    }
}
