import java.util.Scanner;
public class respostawhile404 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] N = new int[10][10];
        int L, c, t;
        L = 0;
        c = 0;
        while (L <= 9) {
            while (c <= 9) {
                System.out.println("Entre com o elemento linha: " + (L + 1) + " Coluna: " +(c + 1));
                N[L][c] = sc.nextInt();
                c++;
            }
            c = 0;
            L++;
        }
        System.out.println("Acima da diagonal principal");
        L = 0 ;
        t = 0;
        while (L <= 8) {
           while (c <= 9) {
            System.out.print("\t" + N[L][c]);
            c++;
           }
           System.out.println();
           while (t <= L) {
            System.out.print("\t");
            t++;
           }
               
           L++;   
           c = L+1;
        }

        System.out.println();
    }
}
