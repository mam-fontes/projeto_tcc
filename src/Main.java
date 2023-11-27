import tcc.projetogestaoestoque.consultaestoque.Estoque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        int sair = 0;
        String nomeCliente;
        String menuInicial = """
                ********************************************
                \nOlá!
                Seja bem vindo ao sistema de gestão de estoque dos seus clientes.
                Por gentileza, digite a opção desejada:
                \n1 - Consultar estoque
                2 - Consultar últimos pedidos
                3 - Gerar sugestão de pedido 
                """;
        Estoque estoque = new Estoque();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Por favor digite o nome do cliente para comerçarmos: ");
        nomeCliente = leitura.nextLine();
        System.out.println(menuInicial);
        opcao = leitura.nextInt();

        switch (opcao){
            case 1:
                System.out.println(estoque.getMenuEstoque());
                int opcaoEstoque = leitura.nextInt();
                switch (opcaoEstoque){
                    case 1:
                        while (estoque.getNomeProduto() != "sair") {
                            System.out.println("Digite o nome do produto ou digite SAIR para encerrar o cadastro do estoque:");
                            estoque.getNomeProduto() = leitura.nextLine();
                            //buscar produto pelo nome no banco de dados
                            System.out.println("Digite o estoque do produto:");
                            estoque.getQuantidade() = leitura.nextInt();
                            //salvar o estoque no banco de dados
                        }
                        break;
                    case 2:
                        while (sair == 1) {
                            System.out.println("Digite o nome do produto que você deseja buscar o histórico:");
                            estoque.getNomeProduto() = leitura.nextLine();
                            System.out.println("Digite a quantos registros você deseja verificar:");
                            int quantiaRegistros = leitura.nextInt();
                            //busca histórico do produto
                            System.out.println("Deseja realizar mais alguma consulta? Digite 1 para sim e 2 para sair.");
                            sair = leitura.nextInt();
                        }
                        break;
                    default:
                        System.out.println("Opção inválida. Digite 1 para realizar um novo levantamento de estoque ou 2 para consultar o histórico de algum produto.");
                case 2:

                }

        }

    }
}