package sisbli.biblioteca;

import java.util.ArrayList;
import sisbli.acesso.Usuario;
import sisbli.divisao.Setor;

public abstract class Funcionario extends Usuario{
    private String cpf;
    private int pis;
    private Setor lotacao;

    public Funcionario(String nome, String login, String senha, Setor lotacao) {
        super(nome, login, senha, new ArrayList<>());
        this.lotacao = lotacao;
    }
    
    public Funcionario(String nome, String login, String senha, String cpf, Setor lotacao) {
        super(nome, login, senha, new ArrayList<>());
        this.cpf = cpf;
        this.lotacao = lotacao;
    }

    public Funcionario(String nome, String login, String senha, String cpf, int pis, Setor locacao) {
        super(nome, login, senha, new ArrayList<>());
        this.cpf = cpf;
        this.pis = pis;
        this.lotacao = lotacao;
    }

    public Setor getLotacao() {
        return lotacao;
    }

    public void setLotacao(Setor lotacao) {
        this.lotacao = lotacao;
    }
}