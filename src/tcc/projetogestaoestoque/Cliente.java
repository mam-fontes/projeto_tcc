package tcc.projetogestaoestoque;
import java.sql.*;
public class Cliente {
    private int codCliente;
    private String nomeFantasiaCliente;
    private String razaoSocialCliente;

    public Cliente(){
    }

    public Cliente(int codCliente, String nomeFantasiaCliente, String razaoSocialCliente){
        this.codCliente = codCliente;
        this.nomeFantasiaCliente = nomeFantasiaCliente;
        this.razaoSocialCliente = razaoSocialCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomeFantasiaCliente() {
        return nomeFantasiaCliente;
    }

    public void setNomeFantasiaCliente(String nomeFantasiaCliente) {
        this.nomeFantasiaCliente = nomeFantasiaCliente;
    }

    public String getRazaoSocialCliente() {
        return razaoSocialCliente;
    }

    public void setRazaoSocialCliente(String razaoSocialCliente) {
        this.razaoSocialCliente = razaoSocialCliente;
    }
}
