package ArraysELoops;


import java.util.Random;
import java.util.Scanner;

public class ExerciciosArray {

    public static void main(String[] args) {

        exercicioOrdemInversa();
        exercicioConsoantes();
        exercicioNumertosAleatorios();
        exercicioMultidimensional();

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

    public static void exercicioNumertosAleatorios() {
        Random random = new Random();

        int[] numerosAleatorios = new int[6];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(60);
            numerosAleatorios[i] = numero;
        }

        for (int numero : numerosAleatorios ) {

            System.out.print(numero + " ");

        }
        System.out.println(" ");
        for (int numero : numerosAleatorios ) {

            System.out.print((numero + 1) + " ");

        }

    }

    public static void exercicioMultidimensional() {
        Random random = new Random();

        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++){

            for (int c = 0; c < M[i].length; c++) {
                M[i][c] = random.nextInt(9);
            }
        }

        for (int[] linha : M ) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }


}


