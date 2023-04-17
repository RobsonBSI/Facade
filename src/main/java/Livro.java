import java.util.List;
import java.util.ArrayList;

public class Livro {
    public boolean formar() {
        return LivroFacade.verificarDisponibilidadeEmprestimo(this);


    }

}