package tcc.projetogestaoestoque.consultaestoque;

public class Estoque {
    private int quantidade;
    private int saldoVenda;
    private int opcaoEstoque;
    private int registroEstoque;

    private String nomeProduto;
    private String menuEstoque = """
            **********************************************
            \nPor gentileza escolha uma opção:
            \n1 - Cadastrar estoque do cliente.
            \n2 - Consultar histórico de um produto.
            **********************************************
            """;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getSaldoVenda() {
        return saldoVenda;
    }

    public void setSaldoVenda(int saldoVenda) {
        this.saldoVenda = saldoVenda;
    }

    public int getOpcaoEstoque() {
        return opcaoEstoque;
    }

    public void setOpcaoEstoque(int opcaoEstoque) {
        this.opcaoEstoque = opcaoEstoque;
    }

    public String getMenuEstoque() {
        return menuEstoque;
    }

    public void setMenuEstoque(String menuEstoque) {
        this.menuEstoque = menuEstoque;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getRegistroEstoque() {
        return registroEstoque;
    }

    public void setRegistroEstoque(int registroEstoque) {
        this.registroEstoque = registroEstoque;
    }


}
