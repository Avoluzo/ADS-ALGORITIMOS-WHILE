import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");
        int value = sc.nextInt();

        int total = 0;
        int count = 0;

        while (value >= 0) {

            count++;
            total = value + total;
            System.out.println("Digite um valor");
            value = sc.nextInt();


        }

        if (count > 0) {

            int media = (total / count);
            System.out.println("Sua média corresponde a : " + media);

        }

    }
}
