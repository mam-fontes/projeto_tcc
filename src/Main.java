import tcc.projetogestaoestoque.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao;
        int sair = 1;
        int codCliente;
        int codRep;
        String menuInicial = """
                ********************************************
                \n
                Por gentileza, digite a opção desejada:
                \n1 - Estoque
                2 - Consultar últimos pedidos
                3 - Gerar sugestão de pedido
                4 - Sair
                """;
        Representante representante = new Representante();
        RepresentanteDAO representanteDAO = new RepresentanteDAO();
        ClienteDAO clienteDAO = new ClienteDAO();
        Scanner leitura = new Scanner(System.in);
        System.out.println("Olá!\nSeja bem vindo ao sistema de gestão de estoque dos seus clientes.");
        System.out.println("Por favor digite seu código de representante:");
        codRep = leitura.nextInt();
        Representante representanteConsultado = representanteDAO.buscarRepresentante(codRep);

        System.out.println("Por favor digite o código do cliente para começarmos: ");
        codCliente = leitura.nextInt();
        Cliente clienteConsultado = clienteDAO.buscarCliente(codCliente);

        do {
            System.out.println(menuInicial);
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    int sairEstoque = 1;
                    do {
                        System.out.println("Escolha o que você deseja fazer:\n1 - Consultar estoque do cliente\n2 - Efetuar um novo registro de estoque\n3 - Sair");
                        int opcaoEstoque = leitura.nextInt();
                        switch (opcaoEstoque){
                            case 1: //consulta estoque
                                Estoque consultaEstoque = new Estoque();

                            break;
                            case 2: //registra estoque
                            break;
                            case 3:
                                System.out.println("Retornando ao menu anterior");
                                sairEstoque = 0;
                                break;
                            default:
                                System.out.println("Opção inválida. Escolha uma das opções mencionadas no menu.");
                                break;
                        }
                    } while (sairEstoque != 0);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Você escolheu sair. Até mais!");
                    sair = 0;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha alguma opção válida, conforme mencionada no menu.");
                    break;
            }
        } while (sair != 0);
        leitura.close();
    }

}