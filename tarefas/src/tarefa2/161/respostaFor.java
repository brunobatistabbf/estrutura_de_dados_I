import java.util.Scanner;

public class respostaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num;

        for (int i = 1; i <= 5; i++) {
            System.out.println("CALCULE O QUADRADO--------------");
            System.out.println("Insira o numero: ");
            num = sc.nextInt();
            System.out.println("Numero ao QUADRADO: ");
            System.out.println(num * num);


        }

    }
}
