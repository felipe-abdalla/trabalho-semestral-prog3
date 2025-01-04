package sisbli.biblioteca;

public class Bibliotecario extends Funcionario implements LivroReservado{
    private List<Emprestimo> emprestimos;

    public Bibliotecario(String nome, String login, String senha, String cpf, Setor lotacao) {
        super(nome, login, senha, cpf, lotacao);
    }

    public void cadastrarEmprestimo(Reserva reserva) {

    }

    @Override
    public void ocorreu(Reserva reserva) {

    }

    @Override
    public String informarReserva() {
        
    }
}
