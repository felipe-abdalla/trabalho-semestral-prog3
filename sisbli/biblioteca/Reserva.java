package sisbli.biblioteca;

import java.util.*;

public class Reserva {
    private String data;
    private List<Livro> livros = new ArrayList<>();

    public Reserva(String data, List<String> titulosLivros) {
        this.data = data;
        this.livros = carregarLivros(titulosLivros);
    }

    public String getData() {
        return data;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    // Método que cria a lista de livros com base nos títulos fornecidos
    private List<Livro> carregarLivros(List<String> titulosLivros) {
        List<Livro> livros = new ArrayList<>();
        for (String titulo : titulosLivros) {
            Livro livro = Livro.obterLivro(titulo);
            if (livro != null) {
                livros.add(livro);
            }
        }
        return livros;
    }
}
