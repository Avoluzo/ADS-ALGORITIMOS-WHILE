import java.util.Scanner;

public class Exercico3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int nota = 0;
        int nota2 = 0;
        int nota3 = 0;

        System.out.println("Digite o codigo : ");
        int code = scanner.nextInt();

        while (code == 0) ;
        {

            System.out.println("Digite sua nota: ");
            nota = scanner.nextInt();
            System.out.println("Digite sua nota: ");
            nota2 = scanner.nextInt();
            System.out.println("Digite sua nota: ");
            nota3 = scanner.nextInt();
            int media = (nota + nota2 + nota3 / 3);
            System.out.println("sua média é de : " + media);
        }

        System.out.println("digite seu codigo");
        code = scanner.nextInt();


    }


}
