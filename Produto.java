import java.util.Scanner;

public class Produto {
    String nome;
    String marca;
    int quantidade;
    private double valor;

    Produto(String nome, String marca, int quantidade, double valor){
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    public void setNome(double valor) {
        if (valor > 0) {
            this.valor = valor;
            System.out.println("Valor Cadastrado!");
        } else {
            System.out.println("Valor inválido!");
        }
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
}