import java.util.Scanner;

public class respostafor404 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int[][] N = new int[10][10];
        int L, c, t;
       
        for (L = 0; L <= 9 ; L++) {
            for ( c = 0; c <= 9; c++) {
                System.out.println("Entre com o elemento linha: " + (L + 1) + " Coluna: " +(c + 1));
                N[L][c] = sc.nextInt();
            }
        }
        System.out.println("Acima da diagonal principal");
        for ( L = 0; L <= 8; L++) {
            
            for ( c = L+1; c <= 9 ;c++) {
                System.out.print("\t" + N[L][c]);
            }

            System.out.println();

         for ( t = 0; t <= L; t++) {
            System.out.print("\t");
           }
        }

        System.out.println();
    }

}
