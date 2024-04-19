import java.util.Scanner;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Estoque estoque = new Estoque();

        
        System.out.println("-----MENU DE AÇÕES-----\n1- Ver Estoque;\n2- Adicionar novo produto;\n3-Sair;");
        int escolha = tratamentoDeMenu(leitor);

            if (escolha == 1) {
                System.out.println("------ADICIONAR PRODUTO NO ESTOQUE------");
                System.out.println("Detalhes do estoque atual:");
                estoque.mostrarProdutos(); 
            } else if (escolha == 2) {
                System.out.println("Digite o nome do produto:");
                String nome = leitor.nextLine();
    
                System.out.println("Digite a marca do produto:");
                String marca = leitor.nextLine();
    
                System.out.println("Digite a quantidade do produto:");
                int quantidade = tratamentoDeQuantidade(leitor);
    
                Produto produto = new Produto(nome, marca, quantidade);
                System.out.println("Digite o preço do produto:");
                produto.setValor();
    
                estoque.adicionarProduto(produto);
                
                System.out.println("Produto adicionado com sucesso!");
                System.out.println("Detalhes do estoque atual:");
                estoque.mostrarProdutos(); 
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Escolha Inválida");
            }
    
        leitor.close();
    }
    public static int tratamentoDeMenu(Scanner leitor) {
        while (true) {
            try {
                int escolha = Integer.parseInt(leitor.nextLine());
                return escolha;
            } catch (NumberFormatException  e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
            }
        }

        public static int tratamentoDeQuantidade(Scanner leitor) {
            while (true) {
                try {
                    int quantidade = Integer.parseInt(leitor.nextLine());
                    return quantidade;
                } catch (NumberFormatException  e) {
                    System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                }
            }
    }

}

