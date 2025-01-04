package sisbli.biblioteca;

import java.util.ArrayList;
import java.util.List;
import sisbli.acesso.Usuario;

public class Aluno extends Usuario{
    private int matricula;
    private List<Reserva> reservas;
    private List<LivroReservado> consumidores;
    private static List<Funcionalidade> funcionalidades;

    public Aluno(String nome, String login, String senha, int matricula) {
        super(nome, login, senha, new ArrayList<>());
        this.matricula = matricula;
    }

    public List<LivroReservado> getConsumidores() {
        return consumidores;
    }

    public void cadastrarReserva(List<String> titulosLivros, String data) {

    }
}
