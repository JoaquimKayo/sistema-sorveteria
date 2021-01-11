package Sorveteria.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    private Connection con;
    public Connection getConexao(){
        return con;
    }
    
    public Conexao() throws Exception{
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/Sorveteria";
        Class.forName(driver);
        con = DriverManager.getConnection(url, "postgres", "postdba");
        
    }
}
