package ArraysELoops;

import java.util.Scanner;

public class ExerciciosArray {

    public static void main(String[] args) {

        //exercicioOrdemInversa();
        exercicioConsoantes();

    }

    public static void exercicioOrdemInversa() {

        int[] vetor = {12, 50, -18, 22, 57, -64};
        int count = 0;

        while (count < vetor.length ) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println();
        for (int i = vetor.length -1; i >=0; i--){
            System.out.print(vetor[i] + " ");
        }

    }

    public static void exercicioConsoantes() {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Digite a letra desejada: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        for (String consoante : consoantes ) {
            if (consoante != null)
            System.out.println(consoante + " ");
        }
    }
}


