// import java.util.InputMismatchException;

public class Produto {
    String nome;
    int quantidade;
    String categoria;
    double preco;

    public Produto(String nome, int quantidade, String categoria, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() { //getter recebe o nome
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) { //modifica o valor
        this.quantidade = quantidade;
    }
    
   




    // public void adicionarEstoque(int quantidadeAdicionada) {
    //     while (true) {
    //         try {
    //             if(quantidadeAdicionada <= 0) {
    //                 System.out.println("A quantidade adicionada deve ser um número positivo.");
    //             } else {
    //                 this.quantidade += quantidadeAdicionada;
    //                 System.out.println(quantidadeAdicionada + " unidades foram adicionadas ao estoque de " + this.nome + ".");
    //             }
    //             break;
    //         } catch (InputMismatchException e) {
    //             System.out.println("Entrada inválida. Por favor, insira um número inteiro.");

    //         }      
    //     } 
    // }
    // public void removerEstoque(int quantidadeRemovida) {

    // }
}