public class Reservado  extends Biblioteca {
    private static Reservado reserva = new Reservado();

    private Reservado() {};

    public static Reservado getInstancia() {
        return reserva;
    }
}
