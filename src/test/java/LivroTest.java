import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    @Test
    void deveRetornarLivroReservado() {
        Livro livro = new Livro();
        Reservado.getInstancia().addLivroBiblioteca(livro);

        assertEquals(false, livro.formar());
    }

    @Test
    void deveRetornarLivroEmprestado() {
        Livro livro = new Livro();
        Emprestado.getInstancia().addLivroBiblioteca(livro);

        assertEquals(false, livro.formar());
    }

    @Test
    void deveRetornarLivroDesaparecido() {
        Livro livro = new Livro();
        Desaparecido.getInstancia().addLivroBiblioteca(livro);

        assertEquals(false, livro.formar());
    }

    @Test
    void deveRetornarLivroDisponivel() {
        Livro livro = new Livro();

        assertEquals(true, livro.formar());
    }
}