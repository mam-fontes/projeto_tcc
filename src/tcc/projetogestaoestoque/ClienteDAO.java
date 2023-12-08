package tcc.projetogestaoestoque;
import java.sql.*;
import tcc.projetogestaoestoque.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ClienteDAO {

        private static final String url = "jdbc:mysql://localhost:3306/teste_bd_tcc";
        private static final String user = "root";
        private static final String senha = "BfAi.2833@error";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao carregar o driver JDBC do MySQL");
        }
    }


    public Cliente buscarCliente(int codigoCliente) {
            Cliente cliente = null;

            try (Connection conexao = DriverManager.getConnection(url, user, senha)) {
                String sql = "SELECT * FROM cliente WHERE cod_cliente = ?";
                try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                    preparedStatement.setInt(1, codigoCliente);
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        if (resultSet.next()) {
                            cliente = new Cliente();
                            cliente.setCodCliente(resultSet.getInt("codCliente"));
                            cliente.setNomeFantasiaCliente(resultSet.getString("nomeFantasiaCliente"));
                            cliente.setRazaoSocialCliente(resultSet.getString("razaoSocialCliente"));
                        }
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return cliente;
        }
}

