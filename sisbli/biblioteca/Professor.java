package sisbli.biblioteca;

public class Professor extends Funcionario implements ILivroReservado {
    private Reserva reserva;

    public Professor(String nome, String login, String senha, String cpf, Setor lotacao) {
        super(nome, login, senha, cpf, lotacao);
    }

    @Override
    public void ocorreu(Reserva reserva) {

    }

    @Override
    public String informarReserva() {
        
    }
}
