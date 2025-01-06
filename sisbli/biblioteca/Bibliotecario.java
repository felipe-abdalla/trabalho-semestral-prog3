package sisbli.biblioteca;

import java.util.List;
import sisbli.divisao.Setor;
import sisbli.infraestrutura.Util;

public class Bibliotecario extends Funcionario implements ILivroReservado{
    private List<Emprestimo> emprestimos;

    public Bibliotecario(String nome, String login, String senha, String cpf, Setor lotacao) {
        super(nome, login, senha, cpf, lotacao);
    }

    public void cadastrarEmprestimo(Reserva reserva) {
        List<Livro> livrosReservados = reserva.getLivros();
        for(Livro livroReservado : livrosReservados) {
            Emprestimo emprestimo = new Emprestimo(reserva);
        }
    }

    @Override
    public void ocorreu(Reserva reserva) {
        List<Livro> livrosReservados = reserva.getLivros();
        System.out.println("Reserva realizada de:");
        for(Livro livroReservado : livrosReservados) {
            System.out.println(livroReservado.getTitulo());
        }
    }

    @Override
    public String informarReserva() {
        return ("Reserva efetuada no dia " + Util.obterDataAtual());
    }
}
