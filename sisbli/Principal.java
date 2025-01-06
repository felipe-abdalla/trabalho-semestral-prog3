package sisbli;

import java.time.LocalDate;
import sisbli.infraestrutura.Util;

class Principal{
    private String TITULO = "Sistema Bibliotecário";
    public static void main(String[] args){
        
        Util novoUtil = new Util();

        System.out.println("Data atual: " + novoUtil.obterDataAtual());
		System.out.println("Somar data: " + novoUtil.somarDiasData("22/03/2025", 5));
		System.out.println("Converter string pra data: " + novoUtil.converterStringData("31/12/2024", "dd/MM/yyyy"));
		System.out.println("Converter data para string: " + novoUtil.converterDataString(LocalDate.now(), "dd/MM/yyyy"));

    }
}

