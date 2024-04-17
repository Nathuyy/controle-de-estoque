import java.util.Scanner;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Estoque estoque = new Estoque();

        System.out.println("-----MENU DE AÇÕES-----\n1- Ver Estoque;\n2- Adicionar novo produto;\n3-Sair;");
        int escolha = leitor.nextInt();

            if (escolha == 1) {
                System.out.println("Detalhes do estoque atual:");
                estoque.mostrarProdutos(); 
            } else if (escolha == 2) {
                leitor.nextLine(); // Limpa o buffer do scanner
                
                System.out.println("Digite o nome do produto:");
                String nome = leitor.nextLine();
    
                System.out.println("Digite a marca do produto:");
                String marca = leitor.nextLine();
    
                System.out.println("Digite a quantidade do produto:");
                int quantidade = leitor.nextInt();
    
    
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
    public void tratamentoDeMenu(Scanner leitor) {
        while (true) {
            try {
                
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

    }

}

