package tcc.projetogestaoestoque;

import tcc.projetogestaoestoque.Representante;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RepresentanteDAO {

    private static final String url = "jdbc:mysql://localhost:3306/teste_bd_tcc";
    private static final String user = "root";
    private static final String senha = "BfAi.2833@error";

    public Representante buscarRepresentante(int codigoRepresentante) {
        Representante representante = null;

        try (Connection conexao = DriverManager.getConnection(url, user, senha)) {
            String sql = "SELECT * FROM representante WHERE codigo_rep = ?";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setInt(1, codigoRepresentante);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        representante = new Representante();
                        representante.setCodRepresentante(resultSet.getInt("codigo_rep"));
                        representante.setNomeRepresentante(resultSet.getString("nome_rep"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return representante;
    }
}
