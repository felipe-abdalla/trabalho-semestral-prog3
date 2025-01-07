package sisbli;

import javax.swing.*;
import sisbli.acesso.*;
import sisbli.biblioteca.*;
import sisbli.divisao.*;
import java.util.*;

import java.util.*;

class Principal{
    private String TITULO = "Sistema Bibliotecário | v1.0";
    public static void main(String[] args){
    
    }

    public static Usuario autenticar() {

    }

    public static String[] construirMenu(Usuario usuario) {

    }

    public static int selecionarFuncionalidade(String[] funcionalidadesMenu) {

    }

    public static void processarFuncionalidades(Usuario usuario, int funcionalidadeSelecionada) {

    }

    public static ILivroReservado selecionarConsumidor(Aluno usuario, boolean naListaProdutor) {

    }

    public static void listarLivros() {
        System.out.println("Livros cadastrados:");
        List<String> livros = Livro.listar();
        for(String livro : livros) {
            System.out.println(livro);
        }
    }

    public static void exibirMensagensConsumidores(Aluno aluno) {

    }

    public static void sair(Usuario usuario) {
        usuario.sair();
    }
}

