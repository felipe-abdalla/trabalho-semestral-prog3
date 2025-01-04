package sisbli.biblioteca;

public interface ILivroReservado {
    public abstract void ocorreu(Reserva reserva);
    public abstract String informarReserva();
}
