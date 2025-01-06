package sisbli.biblioteca;

import java.util.ArrayList;
import java.util.List;
import sisbli.acesso.Funcionalidade;
import sisbli.acesso.Usuario;

public class Aluno extends Usuario implements IReservouLivro{
    private int matricula;
    private List<Reserva> reservas;
    private List<ILivroReservado> consumidores;
    private static List<Funcionalidade> funcionalidades;

    public Aluno(String nome, String login, String senha, int matricula) {
        super(nome, login, senha, new ArrayList<>());
        this.matricula = matricula;
    }

    public List<ILivroReservado> getConsumidores() {
        return consumidores;
    }

    public void cadastrarReserva(List<String> titulosLivros, String data) {

    }

    @Override
    public void adicionar(ILivroReservado livroReservado) {

    }

    @Override
    public void notificar(Reserva reserva) {

    }

    @Override
    public void remover(ILivroReservado livroReservado) {

    }
}
