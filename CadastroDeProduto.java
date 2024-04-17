import java.util.Scanner;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto(null, null, 0, 0);
        escolhaMenu();
      
}



    public static void escolhaMenu() {
        Scanner leitor = new Scanner(System.in);

        int escolha = leitor.nextInt();
        System.out.println("------MENU DE AÇÕES------\n1- Ver Estoque;\n2- Adicionar Produto;");
        while (true) {
            try {
                if (escolha == 1) {
                    //mostrar estoque aqui
                } else if(escolha == 2) {
                    //adicionar produto?
                }
            } catch (Exception e) {
                System.out.println("Escolha Inválida.");
            }
        }
    }
}