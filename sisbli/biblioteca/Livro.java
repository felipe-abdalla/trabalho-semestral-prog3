package sisbli.biblioteca;

import java.util.*;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private static Map<Livro,List<Exemplar>> biblioteca;

    // Construtores
    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, String autor, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    // Retorna o livro pelo titulo
    public static Livro obterLivro(String titulo) {
        for(Livro livro : biblioteca.keySet()) 
            if(livro.getTitulo().equalsIgnoreCase(titulo))
                return livro;
        return null;
    }

    // Retorna um exemplar a partir de um livro
    public static Exemplar obterExemplar(Livro livro) {
        List<Exemplar> exemplares = biblioteca.get(livro);
        if(exemplares != null && !exemplares.isEmpty())
            return exemplares.get(0);
        return null;
    }

    // Lista todos os livros da biblioteca pelo titulo
    public static List<String> listar() {
        List<String> titulos = new ArrayList<>();
        for(Livro livro : biblioteca.keySet())
            titulos.add(livro.getTitulo());
        return titulos;
    }

    // Cria a estrutura da biblioteca
    private static Map<Livro, List<Exemplar>> criarBiblioteca() {
        if(biblioteca == null)
            biblioteca = new HashMap<>();
        return biblioteca;
    }

    // Cria uma lista de exemplares a partir de um livro específico
    private static void criarListaExemplares(Map<Livro, List<Exemplar>> biblioteca) {
        for(Livro livro : biblioteca.keySet())
            if(!biblioteca.containsKey(livro))
                biblioteca.put(livro, new ArrayList<>());
    }
}
