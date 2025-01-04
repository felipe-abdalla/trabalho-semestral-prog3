package sisbli.acesso;

import java.util.List;

public abstract class Usuario{
    private String nome;
    private String login;
    private String senha;
    private List<Funcionalidade> funcionalidades;
    private static List<Usuario> usuarios;

    public Usuario(String nome, String login, String senha, List<Funcionalidade> funcionalidades){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.funcionalidades = funcionalidades;
    }

    public String getNome(){
        return this.nome;
    }

    public List<Funcionalidade> getFuncionalidades(){
        return funcionalidades;
    }

    public String sair(){
        return "Saindo...";
    }

    /*
    public statuc <T> List<T> listar(Class<T> instanciaClasse){
    
    }
    */
    /*
    public static Usuario obter(String login, String senha) {

    }
    */
}