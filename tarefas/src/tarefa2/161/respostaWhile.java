import java.util.Scanner;

public class respostaWhile {
    public static void main(String[] args) {
        float num;
        int i = 1;
        Scanner sc = new Scanner(System.in);

        while (i <= 5) {
            System.out.println("--------------Calcule o QUADRADO--------------------");
            System.out.println("Insira um numero: ");
            num = sc.nextInt();
            System.out.println("Numero ao quadrado: ");
            System.out.println(num * num);
            i++;    
        }

    }
}
