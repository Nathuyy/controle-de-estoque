import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;


    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto '" + produto.getNome() + "' adicionado ao estoque.");
    }
}
