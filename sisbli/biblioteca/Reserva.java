package sisbli.biblioteca;

import java.util.List;

public class Reserva {
    private String data;
    private List<Livro> livros;

    public Reserva(String data, List<String> titulosLivros) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    private List<Livro> carregarLivros(List<String> titulosLivros) {

    }
}
