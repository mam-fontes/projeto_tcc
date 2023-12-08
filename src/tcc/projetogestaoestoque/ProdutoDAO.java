package tcc.projetogestaoestoque;

import tcc.projetogestaoestoque.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ProdutoDAO {

    private static final String url = "jdbc:mysql://localhost:3306/teste_bd_tcc";
    private static final String user = "root";
    private static final String senha = "BfAi.2833@error";

    public Produto buscarProduto(String codigoProduto) {
        Produto produto = null;

        try (Connection conexao = DriverManager.getConnection(url, user, senha)) {
            String sql = "SELECT * FROM produto WHERE codigo_prod = ?";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setString(1, codigoProduto);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        produto = new Produto();
                        produto.setCodProduto(resultSet.getString("codigo_prod"));
                        produto.setNomeProduto(resultSet.getString("nome_produto"));
                        produto.setTipoEmbalagem(resultSet.getString("tipo_emb_fk"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return produto;
    }
}

