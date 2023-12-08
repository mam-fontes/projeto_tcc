package tcc.projetogestaoestoque;

import java.time.LocalDate;

public class Pedido {
    private int codPedido;
    private int quantidadePedido;

    public Pedido(){
    }

    public Pedido(int codPedido, int quantidadePedido){
        this.codPedido = codPedido;
        this.quantidadePedido = quantidadePedido;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    public int getQuantidadePedido() {
        return quantidadePedido;
    }

    public void setQuantidadePedido(int quantidadePedido) {
        this.quantidadePedido = quantidadePedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
    }
}
