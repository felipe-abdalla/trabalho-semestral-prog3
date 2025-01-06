package sisbli.biblioteca;

import java.util.ArrayList;
import java.util.List;
import sisbli.infraestrutura.Util;

public class Emprestimo {
    private String dataRetirada;
    private String dataDevolucao;
    private List<Exemplar> exemplares = new ArrayList<>();

    public Emprestimo(Reserva reserva) {
        dataRetirada = reserva.getData();
        dataDevolucao = Util.somarDiasData(dataRetirada, 7);
        List<Livro> livrosReservados = reserva.getLivros();
        for(Livro livroReservado : livrosReservados) {
            Exemplar exemplar = new Exemplar(livroReservado);
            exemplares.add(exemplar);
        }
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    private List<Exemplar> carregarExemplares(List<Livro> livros) {

    }
}
