package CursoLógicaCondicionalEControleDeFluxo;

public class ControleDeFluxo {

    public static void main(String[] args) {

        mesDoAno();
        ferias();
        diaDaSemana();

    }

    public static void mesDoAno() {

        int mes = 4;

        if (mes == 1) {
            System.out.println("Janeiro");
        }else if (mes == 2) {
            System.out.println("Fevereiro");
        }else if (mes == 3) {
            System.out.println("Março");
        }else if (mes == 4) {
            System.out.println("Abril");
        }else if (mes == 5) {
            System.out.println("Maio");
        }else if (mes == 6) {
            System.out.println("Junho");
        }else if (mes == 7) {
            System.out.println("Julho");
        }else if (mes == 8) {
            System.out.println("Agosto");
        }else if (mes == 9) {
            System.out.println("Setembro");
        }else if (mes == 10) {
            System.out.println("Outubro");
        }else if (mes == 11) {
            System.out.println("Novembro");
        }else if (mes == 12) {
            System.out.println("Dezembro");
        }else {
            System.out.println("Não é um número válido");
        }

    }

    public static void ferias() {

        String mes = "Dezembro";
        switch (mes) {
            case "Dezembro":
            case "Junho":
            case "Janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês letivo");
                break;
        }
    }

    public static void  diaDaSemana() {
        int dia = 1;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
    }
}
