import java.util.Scanner;
public class respostawhile418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4];
        int[][] b = new int[4][4];
        int[][] soma = new int[4][4];
        int l = 0;
        int c = 0;

        while (l < 4) {
            while (c < 4) {
                System.out.print("Digite o elemento de A[ " + (l + 1) + " ][ " + (c+1)+" ] : ");
                a[l][c]  = sc.nextInt();
                c++;
            }
            l++;
            c = 0;
        }
        //
        l = 0;
        while (l < 4) {
          while (c < 4) {
            System.out.print("Digite o elemento de B[ " + (l + 1) + " ][ " + (c+1)+" ] : ");
             b[l][c] = sc.nextInt();
             soma[l][c] = a[l][c] + b[l][c];
             c++;  
          }
            l++;
            c = 0;   
        }
        System.out.println("\t Matriz Soma \n");
        l = 0;
        while (l < 4) {
            while (c < 4) {
                System.out.print("\t " + soma[l][c]);
                System.out.println();
                c++; 
            }
            l++;
            c = 0;
        }
        System.out.println();
        
    }
}
