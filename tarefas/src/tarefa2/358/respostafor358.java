import java.util.Scanner;
public class respostafor358 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int totalLucroMenor10 = 0;
        int totalLucroMenor20 = 0;
        int totalLucroMaior20 = 0;
        float lucro;
        float[] precoCompra = new float[100];
        float[] precoVenda = new float [100];
        
        for (int a = 0; a < 100; a++) 
        {
        System.out.println("Preço compra: ");
        precoCompra[a] = sc.nextFloat();
        System.out.println("Preço venda: ");
        precoVenda[a] = sc.nextFloat();    
        }
        for (int a = 0; a < 100; a++) {
            lucro = precoVenda[a] - precoCompra[a];

            if (lucro < 10.0) {
                totalLucroMenor10++;
            }  else{ 

                if (lucro <= 20.0) {
                 totalLucroMenor20++;
                }  
                else {
                 totalLucroMaior20++;
             }

            }            
        }
       System.out.println("total de mercadorias com lucro < 10%:" + totalLucroMenor10);
       System.out.println("total de mercadorias com 10% <= lucro <= 20%: " + totalLucroMenor20);
       System.out.println("total de mercadorias com lucro > 20%: "+totalLucroMaior20);
       System.out.println();
        
    
    }
     
        



}

