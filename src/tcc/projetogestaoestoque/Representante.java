package tcc.projetogestaoestoque;
import java.sql.*;
public class Representante {
    private int codRepresentante;
    private String nomeRepresentante;

    public Representante(){
    }

    public Representante(int codRepresentante, String nomeRepresentante){
        this.codRepresentante = codRepresentante;
        this.nomeRepresentante = nomeRepresentante;
    }

    public int getCodRepresentante() {
        return codRepresentante;
    }

    public void setCodRepresentante(int codRepresentante) {
        this.codRepresentante = codRepresentante;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }
}
