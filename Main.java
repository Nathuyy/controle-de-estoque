import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("Escolha seu menu:\n1-Ver Estoque;\n2-Adicionar Estoque;\n3-Remover Estoque;");
        System.out.println("-------------------");
        int opcaomenu = leitor.nextInt();

        Estoque estoque = new Estoque();


        if (opcaomenu == 1) {
            System.out.println("Seu estoque atual: " + estoque);
        } else if (opcaomenu == 2) {
            adicionarProdutoAoEstoque(estoque, leitor);
            System.out.println("Seu estoque atual: " + estoque);


        }

        
    }


    public static void adicionarProdutoAoEstoque(Estoque estoque, Scanner leitor) {
        System.out.println("Digite o nome do produto:");
        String nome = leitor.next();

        System.out.println("Digite a quantidade do produto:");
        int quantidade = leitor.nextInt();

        System.out.println("Digite a categoria do produto:");

        // Obtém a lista de categorias:
        Categorias categorias = new Categorias();
        List<String> listaCategorias = categorias.getCategorias();    

        // Mostra as categorias disponíveis
        for (int i = 0; i < listaCategorias.size(); i++) {
        System.out.println((i + 1) + ". " + listaCategorias.get(i));
    }
      // Solicita ao usuário que escolha uma categoria
        int escolhaCategoria = leitor.nextInt();
        String categoria = listaCategorias.get(escolhaCategoria - 1); // Obtém a categoria escolhida -- botou o -1 por causa do indice

    System.out.println("Digite o preço do produto:");
    double preco = leitor.nextDouble();

    Produto novoProduto = new Produto(nome, quantidade, categoria, preco);

    estoque.adicionarProduto(novoProduto);
}
}








