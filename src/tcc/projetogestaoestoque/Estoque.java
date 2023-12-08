package tcc.projetogestaoestoque;
import java.sql.*;
import java.time.LocalDate;

public class Estoque {
    private int codEstoque;
    private int quantidadeEstoque;

    public Estoque(){
    }

    public Estoque(int codEstoque, int quantidadeEstoque){
        this.codEstoque = codEstoque;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getCodEstoque() {
        return codEstoque;
    }

    public void setCodEstoque(int codEstoque) {
        this.codEstoque = codEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setDataEstoque(LocalDate dataEstoque) {
    }
}
