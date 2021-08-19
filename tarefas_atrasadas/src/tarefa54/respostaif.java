import java.util.Scanner;

public class respostaif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, area;
        if(true){
        System.out.println("Entre com a base: ");
        a = sc.nextInt();

        System.out.println("Entre com a altura do Triangulo: ");
        b = sc.nextInt();

        area =(a*b)/2;
        System.out.println("A area do triangulo é: " + area);
     }
        sc.close();

    }
}
