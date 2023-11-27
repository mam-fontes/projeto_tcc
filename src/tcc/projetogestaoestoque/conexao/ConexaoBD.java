package tcc.projetogestaoestoque.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static final String url = "jdbc:mysql://localhost:3306/teste 01 banco de dados?serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "root";

    private static Connection conn;

    public static Connection getConexcao(){
        try {
            if (conn == null) {
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            } else{
                return conn;
            }
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }

}
