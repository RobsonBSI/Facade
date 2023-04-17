public class LivroFacade {

    public static boolean verificarDisponibilidadeEmprestimo(Livro livro) {
        if (Reservado.getInstancia().verificarDisponibilidadeLivro(livro)) {
            return false;
        }
        if (Emprestado.getInstancia().verificarDisponibilidadeLivro(livro)) {
            return false;
        }
        if (Desaparecido.getInstancia().verificarDisponibilidadeLivro(livro)) {
            return false;
        }
        return true;
    }

}
