import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3){
           System.out.println("""
            Digite um número referente ao que deseja fazer:

            (1) Criar uma loja
            (2) Criar um produto
            (3) Sair
            """);

            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpa o buffer

            if (opcao == 1){
                System.out.println("\nInforme os dados da loja:" + "\n");

                System.out.print("Nome: ");
                String nomeDaLoja = scanner.nextLine(); 

                System.out.print("Quantidade de funcionários: ");
                int quantidadeFuncionarios = scanner.nextInt();
                scanner.nextLine();  // Limpa o buffer 

                System.out.print("Salário base dos funcionários: ");
                int salarioBaseFuncionario = scanner.nextInt();
                scanner.nextLine();  // Limpa o buffer

                System.out.println("\n" + "Informe os dados do endereço:" + "\n");
                
                System.out.print("Nome da rua: ");
                String nomeDaRua = scanner.nextLine();

                System.out.print("Cidade: ");
                String cidade = scanner.nextLine();

                System.out.print("Estado: ");
                String estado = scanner.nextLine();

                System.out.print("País: ");
                String pais = scanner.nextLine();

                System.out.print("CEP: ");
                String cep = scanner.nextLine();

                System.out.print("Número: ");
                String numero = scanner.nextLine();

                System.out.print("Complemento: ");
                String complemento = scanner.nextLine();

                Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                
                System.out.println("\n" + "Informe a data de fundação:" + "\n");

                System.out.print("Dia: ");
                int dia = scanner.nextInt();
                scanner.nextLine();  // Limpa o buffer

                System.out.print("Mês: ");
                int mes = scanner.nextInt();
                scanner.nextLine();  // Limpa o buffer

                System.out.print("Ano: ");
                int ano = scanner.nextInt();
                scanner.nextLine();  // Limpa o buffer

                Data dataDeFundacao = new Data(dia, mes, ano);

                Loja loja;
                if (salarioBaseFuncionario >= 0) {
                    loja = new Loja(nomeDaLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataDeFundacao);
                } else {
                    loja = new Loja(nomeDaLoja, quantidadeFuncionarios, endereco, dataDeFundacao);
                }

                System.out.println("\n" + "Loja criada com sucesso!" + "\n");
                // Exibindo as informações da loja (caso você tenha implementado o método toString na classe Loja)
                System.out.println(loja + "\n");
            }
            
            else if(opcao == 2){
                System.out.println("Informe os dados do produto:" + "\n");

                System.out.print("Nome: ");
                String nomeDoProduto = scanner.nextLine();

                System.out.print("Preco: ");
                double preco = scanner.nextDouble();

                System.out.println("\n" + "Informe a data de validade:" + "\n");

                System.out.print("Dia: ");
                int diaVal = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Mês: ");
                int mesVal = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Ano: ");
                int anoVal = scanner.nextInt();
                scanner.nextLine();

                Data dataDeValidade = new Data(diaVal, mesVal, anoVal);

                Produto produto = new Produto(nomeDoProduto, preco, dataDeValidade);

                System.out.println("\n" + "Produto criado com sucesso!" + "\n");
                Data data = new Data(20, 10, 2023);
                if (produto.estaVencido(data)) {
                    System.out.println("PRODUTO VENCIDO");
                } else {
                    System.out.println("PRODUTO NÃO VENCIDO");
                }
            }

            else if(opcao > 3 || opcao <= 0){
                System.out.println("Opção inválida!");
            }
        }
        System.out.println("\nMenu encerrado.");

        scanner.close();

    }
}