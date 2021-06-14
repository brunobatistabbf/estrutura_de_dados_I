import java.util.Scanner;
public class respostawhile412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] n = new int[5][5];
        int  l = 0;
        int c = 0;
        int  t = 0;

        while (l < 5) {
            while (c < 5) {
               System.out.println("Digite elemento: " + (l + 1) + " - " + (c + 1) + " : " );
               n[l][c] = sc.nextInt();
               c++;  
            }   
         l++;
         c=0;
        }
        System.out.println("Toda Matriz\n");
        l = 0;
        while (l < 5) {
            
            while (c < 5) {
                System.out.print(n[l][c] + "\t");
                System.out.println();
                c++;  
            }
            l++;
            c = 0;
        }
        System.out.println("So os elementos nas posicoes cuja linha + coluna dão um numero par" + "\n" );
        l = 0;
        while (l < 5) {
            while (c < 5) {
                System.out.print("\t");
                if ((l + c) % 2 == 0) {
                System.out.print(n[l][c]);
                 }
                System.out.print("\t");
                System.out.println();
                c++; 
            }
            
            l++;
            c = 0; 
        }
        sc.close();






    }
}
