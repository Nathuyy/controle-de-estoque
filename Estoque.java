import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;

    
    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public void mostrarProdutos() {
        for (Produto produto : produtos) {
            produto.mostrarProdutos();
            System.out.println(); 
        }
    }
}