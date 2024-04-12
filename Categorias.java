import java.util.ArrayList;
import java.util.List;

public class Categorias {

    private List<String> categorias;

    public Categorias() {
        this.categorias = new ArrayList<>();
        inicializarCategoriasPadrao();
    }

    private void inicializarCategoriasPadrao() {
        categorias.add("Frutas");
        categorias.add("Enlatados");
        categorias.add("Carnes");
        
    }

    public void adicionarCategoria(String categoria) {
        categorias.add(categoria);
    }

    public List<String> getCategorias() {
        return categorias;
    }
}