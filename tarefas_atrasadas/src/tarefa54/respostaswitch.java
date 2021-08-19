import java.util.Scanner;

public class respostaswitch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int apoio = 0 ;
    int a, b, area;
    System.out.println("Com Switch");
    
    switch (apoio) {
        case  0 :
            System.out.println("Entre com a base: ");
            a = sc.nextInt();

            System.out.println("Entre com a altura do Triangulo: ");
            b = sc.nextInt();

            area =(a*b)/2;
            System.out.println("A area do triangulo é: " + area);             

            break;
    
        default:
            break;
    }
    sc.close();
    }
}
