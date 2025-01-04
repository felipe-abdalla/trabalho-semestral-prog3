package sisbli.acesso;

public enum Funcionalidade{
    CAD_CONS("REM_CONS"),
    REM_CONS("REM_CONS"),
    CAD_RESE("CAD_RESE");

    // Atributo privado para armazenar a sigla
    private final String sigla;

    // Construtor para inicializar a sigla
    Funcionalidade(String sigla) {
        this.sigla = sigla;
    }

    // Método getter para retornar a sigla
    public String getSigla() {
        return sigla;
    }
}
