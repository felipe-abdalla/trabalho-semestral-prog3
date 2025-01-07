package sisbli;

import java.util.*;
import javax.swing.*;
import sisbli.acesso.*;
import sisbli.biblioteca.*;
import sisbli.divisao.*;
import sisbli.infraestrutura.*;
class Principal{
    private static String TITULO = "Sistema Bibliotecário | v1.0";
    
    public static void main(String[] args) {
        // Realizar autenticação
        Usuario objUsuario = autenticar();

        // Construir o menu e exibir
        String[] funcionalidadesMenu = construirMenu(objUsuario);
        
        // Loop principal
        int funcionalidadeSelecionada = 0;
        do {
            funcionalidadeSelecionada = selecionarFuncionalidade(funcionalidadesMenu);
            processarFuncionalidades(objUsuario, funcionalidadeSelecionada);
        } while (funcionalidadeSelecionada != 0); // Sair do loop quando funcionalidade for 0 (sair)
    }

    // Autenticacao de usuario
    public static Usuario autenticar() {
        String loginInput = JOptionPane.showInputDialog(null, "Insira o login:", TITULO, JOptionPane.QUESTION_MESSAGE);
        String senhaInput = JOptionPane.showInputDialog(null, "Insira a senha:", TITULO, JOptionPane.QUESTION_MESSAGE);

        // Validacao ficticia
        if (loginInput.equals("joao123") && senhaInput.equals("senha")) {
            return new Aluno("João", loginInput, senhaInput, 12345); // Exemplo de aluno autenticado
        } else if (loginInput.equals("maria123") && senhaInput.equals("senha")) {
            return new Bibliotecario("Maria", loginInput, senhaInput, "123.456.789-00", new Setor("Biblioteca"));
        } else {
            JOptionPane.showMessageDialog(null, "Login ou senha inválidos!");
            return null;
        }
    }

    // Metodo para construir o menu com base nas funcionalidades do usuario
    public static String[] construirMenu(Usuario usuario) {
        List<String> funcionalidades = new ArrayList<>();
        funcionalidades.add(" 0 Sair");

        // Adiciona as funcionalidades especificas do usuario
        if (usuario instanceof Aluno) {
            funcionalidades.add(" 1 Reservar Livro");
            funcionalidades.add(" 2 Verificar Reservas");
        } else if (usuario instanceof Bibliotecario) {
            funcionalidades.add(" 1 Cadastrar consumidor");
            funcionalidades.add(" 2 Remover consumidor");
            funcionalidades.add(" 3 Cadastrar reserva");
        }

        return funcionalidades.toArray(new String[0]);
    }

    // Metodo para selecionar uma funcionalidade
    public static int selecionarFuncionalidade(String[] funcionalidadesMenu) {
        String opcoes = String.join("\n", funcionalidadesMenu);
        String input = JOptionPane.showInputDialog(null, "Escolha uma funcionalidade:\n" + opcoes);
        return Integer.parseInt(input);
    }

    // Processar a funcionalidade escolhida pelo usuario
    public static void processarFuncionalidades(Usuario usuario, int funcionalidadeSelecionada) {
        switch (funcionalidadeSelecionada) {
            case 1: // Reservar Livro (para Aluno)
                if (usuario instanceof Aluno) {
                    List<String> livros = Livro.listar();
                    String livroEscolhido = (String) JOptionPane.showInputDialog(null, "Escolha um livro para reserva:", 
                        "Reserva de Livro", JOptionPane.QUESTION_MESSAGE, null, livros.toArray(), livros.get(0));
                    if (livroEscolhido != null) {
                        Reserva reserva = new Reserva(Util.obterDataAtual(), Collections.singletonList(livroEscolhido));
                        JOptionPane.showMessageDialog(null, "Reserva feita para o livro: " + livroEscolhido);
                    }
                }
                else if(usuario instanceof Bibliotecario){
                    JOptionPane.showMessageDialog(null, "Cadastrando consumidor...");
                    
                }
                break;
                
            case 2: // Verificar reservas para Aluno
                if (usuario instanceof Aluno) {
                    JOptionPane.showMessageDialog(null, "Exibindo reservas...");
                    //...
                }
                else if(usuario instanceof Bibliotecario){
                    JOptionPane.showMessageDialog(null, "Removendo consumidor...");
                    // ...
                }
                break;
                
            case 3: // Cadastrar emprestimo para Bibliotecario
                if (usuario instanceof Aluno) {
                    JOptionPane.showMessageDialog(null, "Cadastrando empréstimo...");
                    //...
                }
                else if(usuario instanceof Bibliotecario){
                    JOptionPane.showMessageDialog(null, "Cadastrando reserva...");
                    Reserva reserva = new Reserva(Util.obterDataAtual(), Collections.singletonList("Livro 1"));
                    ((Bibliotecario) usuario).cadastrarEmprestimo(reserva);
                }
                break;
                
            case 4: // Listar livros para Bibliotecario
                if (usuario instanceof Bibliotecario) {
                    listarLivros();
                }
                break;
                
            case 0: // Sair
                sair(usuario);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }

    // Listar livros cadastrados
    public static void listarLivros() {
        System.out.println("Livros cadastrados:");
        List<String> livros = Livro.listar();
        for (String livro : livros) {
            System.out.println(livro);
        }
    }

    // Metodo para sair do sistema
    public static void sair(Usuario usuario) {
        JOptionPane.showMessageDialog(null, "Saindo...");
        System.exit(0);
    }
}
