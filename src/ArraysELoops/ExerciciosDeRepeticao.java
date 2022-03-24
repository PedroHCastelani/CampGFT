package ArraysELoops;

import java.util.Objects;
import java.util.Scanner;

public class ExerciciosDeRepeticao {

    public static void main(String[] args) {

        //exercicioNomeIdade();
        //exercicioNota();
        //exercicioMaiorEMedia();
        //exercicioParEImpar();
        //exercicioTabuada();
        //exercicioFatorial();

    }

    public static void exercicioNomeIdade() {
        Scanner scan = new Scanner(System.in);

        int idade;
        String nome;

        while (true) {
            System.out.println("Digite nome do aluno: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Digite a idade do aluno");
            idade = scan.nextInt();

        }
    }

    public static void exercicioNota() {
        Scanner scan = new Scanner(System.in);

        int nota;

        while (true) {
            System.out.println("Nota: ");
            nota = scan.nextInt();
            if (nota < 0 || nota > 10)
                System.out.println("Nota inválida");
            else break;
        }

    }

    public static void exercicioMaiorEMedia() {
        Scanner scan = new Scanner(System.in);

        int n;
        int count = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Digite um número: ");
            n = scan.nextInt();
            if (maior < n) maior = n;
            soma = soma + n;
            count++;
        } while (count < 5);

        System.out.println("O maior número foi " + maior);
        System.out.println("A média dos números foi " + (soma/count));
    }

    public static void exercicioParEImpar() {
        Scanner scan = new Scanner(System.in);

        int n;
        int par = 0;
        int impar = 0;
        int count = 0;
        int x = 0;

        System.out.println("Quantos números irá digitar? ");
        x = scan.nextInt();

        do {
            System.out.println("Digite um némero: ");
            n = scan.nextInt();

            if (n % 2 == 0) par++;
            else impar++;

            count ++;
        }while (count < x);

        System.out.println("Você digitou " + par + " números pares");
        System.out.println("Você digitou " + impar + " números impares");

    }

    public static void exercicioTabuada() {
        Scanner scan = new Scanner(System.in);

        int n;
        int quantMult = 0;
        int soma = 0;

        System.out.println("Digite qual número deseja multiplicá-lo: ");
        n = scan.nextInt();
        System.out.println("Agora digite quantas vezes deseja multiplicá-lo: ");
        quantMult = scan.nextInt();

        System.out.println("Tabuada de " + n + ":");

        for (int i = 0; i <= quantMult; i++) {
            soma = n * i;
            System.out.println(n + " x " + i + " = " + soma);
        }



    }

    public static void exercicioFatorial() {
        Scanner scan = new Scanner(System.in);

        int n = 0;
        int f = 1;
        String s1;

        System.out.println("Digite qual número deseja fazer a fatorização: ");
        n = scan.nextInt();

        for (int i = n; i >= 1; i--) {
            f = f * i;
        }

        //System.out.println("O fatorial de " + n + " é:");
        System.out.println(n +"! = " + f);
    }
}
