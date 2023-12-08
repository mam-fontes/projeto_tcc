package tcc.projetogestaoestoque;

import tcc.projetogestaoestoque.Pedido;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
public class PedidoDAO {

    private static final String url = "jdbc:mysql://localhost:3306/teste_bd_tcc";
    private static final String user = "root";
    private static final String senha = "BfAi.2833@error";

    public Pedido buscarPedido(int codigoPedido) {
        Pedido pedido = null;

        try (Connection conexao = DriverManager.getConnection(url, user, senha)) {
            String sql = "SELECT * FROM pedido WHERE id_pedido = ?";
            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setInt(1, codigoPedido);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        pedido = new Pedido();
                        pedido.setCodPedido(resultSet.getInt("id_pedido"));
                        LocalDate dataPedido = resultSet.getObject("data_pedido", LocalDate.class);
                        pedido.setDataPedido(dataPedido);
                        pedido.setQuantidadePedido(resultSet.getInt("quantidade_ped"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pedido;
    }
}

