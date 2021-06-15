import java.util.Scanner;

public class respostafor425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l;
        int c;
        int d;
        int[][] qtde = new int[50][3];
        String[] nome = new String[50];

        for ( l = 0; l < 50; l++) {
            System.out.println("\n DIgite o nome da " + (l+1) + " planta: " );
            nome[l] = sc.next();
            System.out.println("\ndigite quantidade em estoque: ");
            qtde[l][0] = sc.nextInt();
            System.out.println("\ndigite qunatidade ideal: ");
            qtde[l][1] = sc.nextInt();

            if (qtde[l][0] < qtde[l][1]) 
                { qtde[l] [2] = qtde[l] [1] - qtde[l] [0] ;}
             else {
                qtde[l][2] = 0;
            }

        }

        System.out.println("\nTotal de compras\n");
        for ( l = 0; l < 5; l++) {
            System.out.println( nome[l] + " - " + qtde[l][2] );
        }
        System.out.println();
    }
}
