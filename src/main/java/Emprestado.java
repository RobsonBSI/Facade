public class Emprestado extends Biblioteca{
    private static Emprestado emprestado = new Emprestado();

    private Emprestado() {};

    public static Emprestado getInstancia() {
        return emprestado;
    }
}
