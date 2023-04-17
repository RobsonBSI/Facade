public class Desaparecido extends Biblioteca {
    private static Desaparecido desaparecido = new Desaparecido();

    private Desaparecido() {};

    public static Desaparecido getInstancia() {
        return desaparecido;
    }
}
