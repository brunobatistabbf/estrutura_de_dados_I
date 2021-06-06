import java.util.Scanner;

public class respostaDo {
    public static void main(String[] args) {
        
        float num;
        int i = 1;
        Scanner sc = new Scanner(System.in);
        
        
        do {
            System.out.println("---------------Descubra o quadrado do numero ======================------");
            System.out.println("Insira um numero: ");
            num = sc.nextInt();
            System.out.println("Numero ao quadrado: ");
            System.out.println(num * num);
            i++;

        } while (i <= 5);
        sc.close();

    }
}
