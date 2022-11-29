import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message = "\n\ndigite 1 para votar no candidato 1: \ndigite 2 para votar no candidato 2: \ndigite 3 para votar no candidato 3:\ndigite 4 para votar no candidato 4:\ndigite 5 para votar nulo:\ndigite 6 para votar em branco:\n ";

        System.out.println("Digite um numero ");
        int option = scanner.nextInt();

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;



        while (option != 0) {

            System.out.println(message);

            switch (option) {
                case 1:
                    System.out.println("voce votou no canditado 1");
                    count1++;
                    break;
                case 2:
                    System.out.println("voce votou no canditado 2");
                    count2++;
                    break;
                case 3:
                    System.out.println("voce votou no canditado 3");
                    count3++;
                    break;
                case 4:
                    System.out.println("voce votou no canditado 4");
                    count4++;
                    break;
                case 5:
                    System.out.println("voce votou nulo");
                    count5++;
                    break;
                case 6:
                    System.out.println("voce votou em branco");
                    count6++;
                    break;

            }

            System.out.println(message);
            option = scanner.nextInt();

        }

        System.out.println("O total de votos do candidato 1 foi de : " +count1 );
        System.out.println("O total de votos do candidato 2 foi de : " +count2 );
        System.out.println("O total de votos do candidato 3 foi de : " +count3 );
        System.out.println("O total de votos do candidato 4 foi de : " +count4 );
        System.out.println("O total de votos nulos foi de : " +count5 );
        System.out.println("O total de votos em branco foi de : " +count6 );


    }
}
