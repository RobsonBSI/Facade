import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livroCatalogado= new ArrayList<Livro>();

    public void addLivroBiblioteca(Livro livroC) {
        this.livroCatalogado.add(livroC);
    }
    public boolean verificarDisponibilidadeLivro(Livro livro) {
        return this.livroCatalogado.contains(livro);
    }
}
