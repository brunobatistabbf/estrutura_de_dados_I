import java.util.Scanner;

public class respostafor412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[5][5];
        int  l, c, t;
    for ( l = 0; l < 5 ;l++) {
        for ( c = 0; c < 5;c++) {
            System.out.println("Digite elemento: " + (l + 1) + " - " + (c + 1) + " : " );
            n[l][c] = sc.nextInt();
        }
    }
    System.out.println("Toda Matriz\n");
    for ( l = 0; l < 5; l++) 
    {
        for ( c = 0; c < 5; c++) {
            System.out.print(n[l][c] + "\t");
            System.out.println();
        }    
    }
    System.out.println("So os elementos nas posicoes cuja linha + coluna dão um numero par" + "\n" );
    for ( l = 0; l < 5; l++) {
        for ( c = 0; c < 5; c++) {
            System.out.print("\t");
            if ((l + c) % 2 == 0) {
                System.out.print(n[l][c]);
            }
            System.out.print("\t");
        System.out.println();
        }
       
    }
    sc.close();

    }
}
