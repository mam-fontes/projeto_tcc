package tcc.projetogestaoestoque.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

       Connection conexao = null;
       String url = "jdbc:mysql://localhost:3306/banco_de_dados_tcc";
       String user = "root";
       String password = "BfAi.2833@error";

       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexao = DriverManager.getConnection(url, user, password);

           if (conexao != null){
               System.out.println("Conexão estabelecida.");
           } else {
               System.out.println("Falha na conexão");
           }
       } catch (ClassNotFoundException e){
           System.out.println("Driver JDBC não encontrado: " + e.getMessage());
       } catch (SQLException e){
           System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
       } finally {
           if (conexao != null){
               try{
                   conexao.close();
               } catch (SQLException e){
                   e.printStackTrace();
               }
           }
       }
    }
