import java.util.Scanner;
public class respostafor418 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] a = new int[4][4];
    int[][] b = new int[4][4];
    int[][] soma = new int[4][4];
    int l;
    int c;
    for ( l = 0; l < 4; l++) {
        for ( c = 0; c < 4; c++) {
            System.out.print("Digite o elemento de A[ " + (l + 1) + " ][ " + (c+1)+" ] : ");
            a[l][c]  = sc.nextInt();
        }
    }    
    ///------------------------
    for ( l = 0; l < 4; l++) {
        for ( c = 0; c < 4 ; c++) {
            System.out.print("Digite o elemento de B[ " + (l + 1) + " ][ " + (c+1)+" ] : ");
            b[l][c] = sc.nextInt();
            soma[l][c] = a[l][c] + b[l][c];
        }
    }
    System.out.println("\t Matriz Soma \n");
    for ( l = 0; l < 4; l++) {
        for ( c = 0; c < 4; c++) {
            System.out.print("\t " + soma[l][c]);
            System.out.println();
        }
    }
    System.out.println();

    }
}
