import java.util.Scanner;

public class DiadaSemana {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.print("Digite um numero de entre 1 a 7");
            int num = input.nextInt();

            switch (num){
                case 1:
                    System.out.println("Domingo");
                    break;
                case 2:
                    System.out.println("Segunda");
                    break;
                case 3:
                    System.out.println("Terca");
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
                    System.out.println("Sabado");
                    break;
                default:
                    System.out.println("Numero invalido");
                    break;
            }
    }
}
