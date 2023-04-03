import java.util.Scanner;

public class AlunoMedia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();

        System.out.print("Digite a primeira nota: ");
        double n1 = input.nextDouble();

        System.out.print("Digite a segunda  nota: ");
        double n2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = input.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double n4 = input.nextDouble();

        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 *1)/10;
        
        System.out.printf("Media: %.1f\n", media);
        
        if (media >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (media > 5.0) {
            System.out.println("Aluno reprovado");
        }else {
            System.out.println("Aluno em exame.");

            System.out.print("Digite a nota do exame: ");
            double exame = input.nextDouble();

            media = (media + exame) / 2;

            System.out.printf("Nota do exame: %.1f\n", exame);

            if (media>= 5.0){
                System.out.println("Aluno aprovado");
            }else{
                System.out.println("Aluno reprovado");
            }

            System.out.printf("Media final: %.1f\n", media);

        }
    }
}
