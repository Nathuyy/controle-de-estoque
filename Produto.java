import java.util.Scanner;

public class Produto {
    String nome;
    String marca;
    int quantidade;
    private double valor;


    Produto(String nome, String marca, int quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
    }

    public void setValor() {
        Scanner scannerValor = new Scanner(System.in);
        double novoValor = tratamentoDeValor(scannerValor);

        while (novoValor < 0) {
            System.out.println("Digite o valor do produto:");
            novoValor = scannerValor.nextDouble();
            if (novoValor > 0) {
                this.valor = novoValor;
                System.out.println("Valor Cadastrado!");
            } else {
                System.out.println("Valor inválido! O valor deve ser maior que zero.");
            }
        }
        scannerValor.close();
    }
    

    public double getValor() {
        return valor;
    }

    public void mostrarProdutos() {
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor: " + valor);
    }

    public static double tratamentoDeValor(Scanner scannerValor) {
        while (true) {
            try {
                double valor = Integer.parseInt(scannerValor.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
            }
        }
    }


}