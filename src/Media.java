import java.util.Scanner;

public class Media {
        public static void main(String[] args) {

            String nome;
            int media =0;

            Aluno op = new Aluno();

            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite o nome do aluno: ");
            nome = teclado.nextLine();

            System.out.println("Digite a primeira nota: " );
            op.nota1 = teclado.nextInt();
            System.out.println("Digite a segunda nota: ");
            op.nota2 = teclado.nextInt();
            System.out.println("Digite a terceira nota: ");
            op.nota3 = teclado.nextInt();
            media = (op.nota1+op.nota2+op.nota3) / 3;

            System.out.println("A média do aluno " + nome + " é " + media + ", portanto: ");

            if (media >= 70 && media <= 100) {
                System.out.println("Está aprovado");
            }
            else if ( media >=1 && media <=40){
                System.out.println("Está reprovado");
            }
            else {
                System.out.println("Está na final");
            }

        }
    }

