package sisbli.biblioteca;

interface IReservouLivro {
    public abstract void adicionar(ILivroReservado livroReservado);
    public abstract void notificar(Reserva reserva);
    public abstract void remover(ILivroReservado livroReservado);
}