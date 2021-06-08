import java.util.Scanner;
public class respostawhile356 {
    public static void main(String[] args) {
        int l =0;
        int c = 1;
        int  t = 0;
        
     Scanner sc = new Scanner(System.in);

     int[] media = new int[15];
     double[] pr1 = new double[15];
     double[] pr2 = new double[15];
    
     String[] nomes = new String[15];
     String[] sit = new String[15];
     //entrada de 15 nomes 
     while (l <= 14) {
        
        System.out.print("\n Digite " + (l+1)+ " nomes:");  
        nomes[l] = sc.next();
        while ((nomes[l].length()) > 30) {
            System.out.println("Nomes com até 30 caracteres");
            System.out.println("\n Digite" + (l+1) + " nome:");
            nomes[l] = sc.next();
        }

        //trecho que garante todos os nomes com 30 caracteres para fazer tabulacao
        t = 30 - nomes[l].length();
        while (c <= t) {
          nomes[l] = nomes[l].concat(" ");
          c++;
        }
        c = 0;
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

        l++;
      }

     //fim do trecho de entrada
     //trecho de saida
     System.out.println("RELAÇÃO FINAL");
     l = 0;
     while (l <= 14) {
        System.out.println((l + 1) + " - " + nomes[l] + "\t" + pr1[l] + "\t" + pr2[l] + "\t" + media[l] + "\t" + sit[l]);
        l++;
     }
    }

}