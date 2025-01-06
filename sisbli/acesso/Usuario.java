package sisbli.acesso;

import java.util.ArrayList;
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
        return nome;
    }

    public List<Funcionalidade> getFuncionalidades(){
        return funcionalidades;
    }

    public String sair(){
        return "Saindo...";
    }

    public static <T> List<T> listar(Class<T> instanciaClasse) {
        List<T> resultados = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if (instanciaClasse.isInstance(usuario)) {
                resultados.add(instanciaClasse.cast(usuario));
            }
        }
        return resultados;
    }

    public static Usuario obter(String login, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.login.equals(login) && usuario.senha.equals(senha)) {
                return usuario;
            }
        }
        return null;
    }
}