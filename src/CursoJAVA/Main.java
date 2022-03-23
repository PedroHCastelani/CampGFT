package CursoJAVA;

import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.divisao(5, 2.5);
        Calculadora.multiplicacao(6, 1.4);
        Calculadora.subtracao( 2, 1);

        System.out.println("Mensagem do dia");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(22);

        System.out.println("Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 1);

    }

}