package tcc.projetogestaoestoque;
import java.sql.*;
public class Produto {
    private String codProduto;
    private String nomeProduto;
    private String tipoEmbalagem;

    public Produto(){
    }

    public Produto(String codProduto, String nomeProduto, String tipoEmbalagem){
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.tipoEmbalagem = tipoEmbalagem;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getTipoEmbalagem() {
        return tipoEmbalagem;
    }

    public void setTipoEmbalagem(String tipoEmbalagem) {
        this.tipoEmbalagem = tipoEmbalagem;
    }
}
