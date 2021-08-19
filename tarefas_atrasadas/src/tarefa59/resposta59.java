import java.util.Scanner;

public class resposta59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        float b = 0;
        float c = 0;
        System.out.println("Entre com o primeiro cateto ");
        b = sc.nextInt();
        System.out.println("Entre com o segundo cateto");
        c = sc.nextInt();
        
        if (c >= 0 && b >= 0) {
             a = (int) Math.sqrt(Math.pow(c, 2)+ Math.pow(b, 2));  
             System.out.println(a);
        } else {
        System.out.println("Insira um valor valido;");    
        }
        a = 0;
        System.out.println("Com SWITCH");
        System.out.println("Entre com o primeiro cateto ");
        b = sc.nextInt();
        System.out.println("Entre com o segundo cateto");
        c = sc.nextInt();

        switch (a) {
            case 0:
            a = (int) Math.sqrt(Math.pow(c, 2)+ Math.pow(b, 2));  
            System.out.println(a);
                break;
        
            default:
            System.out.println("Insira um valor valido;"); 
                break;
        }
        sc.close();


    }
}
