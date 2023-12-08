package tcc.projetogestaoestoque;

import tcc.projetogestaoestoque.Estoque;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
public class EstoqueDAO {

    private static final String url = "jdbc:mysql://localhost:3306/teste_bd_tcc";
    private static final String user = "root";
    private static final String senha = "BfAi.2833@error";

    public Estoque buscarEstoque(int codigoEstoque) {
        Estoque estoque = null;

        try (Connection conexao = DriverManager.getConnection(url, user, senha)) {
            String sql = "SELECT * FROM estoque WHERE id_estoque = ?";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setInt(1, codigoEstoque);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        estoque = new Estoque();
                        estoque.setCodEstoque(resultSet.getInt("id_estoque"));
                        LocalDate dataEstoque = resultSet.getObject("data_estoque", LocalDate.class);
                        estoque.setDataEstoque(dataEstoque);
                        estoque.setQuantidadeEstoque(resultSet.getInt("quantidade_estoque"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return estoque;
    }
}

