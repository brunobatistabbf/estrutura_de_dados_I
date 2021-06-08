
import java.util.Scanner;

public class respostafor356 {
    public static void main(String[] args) {
        int l, c, t;
        Scanner sc = new Scanner(System.in);
        int[] media = new int[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        
        String[] nomes = new String[15];
        String[] sit = new String[15];
        //entrada de 15 nomes 
        for ( l  = 0; l <= 14; l++) 
        {
         System.out.print("\n Digite " + (l+1)+ " nomes:");  
            nomes[l] = sc.next();
            while ((nomes[l].length()) > 30) {
                System.out.println("Nomes com até 30 caracteres");
                System.out.println("\n Digite" + (l+1) + " nome:");
                nomes[l] = sc.next();
            }
        
        //trecho que garante todos os nomes com 30 caracteres para fazer tabulacao
        t = 30 - nomes[l].length();
        for (c = 1; c <= t; c++) 
            {nomes[l] = nomes[l].concat("" );} 
        System.out.println("Digite a primeira nota: ");
            pr1[l] =  sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
            pr2[l] = sc.nextDouble();
        media[l] = (int)((pr1[l] + pr2[l])/2);


        System.out.println(media[l]);
        if (media[l] > 5) {
            sit[l] = "AP";
        } else {
            sit[l] = "RP"; 
        }
         
        }
    //fim do trecho de entrada
    //trecho de saida
    System.out.println("RELAÇÃO FINAL");
        for ( l = 0; l <= 14; l++) {
            System.out.println((l + 1) + " - " + nomes[l] + "\t" + pr1[l] + "\t" + pr2[l] + "\t" + media[l] + "\t" + sit[l]);
        }
    }
}
