package sisbli.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String data;
    private List<Livro> livros = new ArrayList<>();

    public Reserva(String data, List<String> titulosLivros) {
        this.data = data;
        List<String> titulos = new ArrayList<>(titulosLivros);
        for(String tituloLivro : titulos) {
            Livro livro = new Livro(tituloLivro);
            livros.add(livro);
        }
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
