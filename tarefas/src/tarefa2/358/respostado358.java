import java.util.Scanner;
public class respostado358 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalLucroMenor10 = 0;
        int totalLucroMenor20 = 0;
        int totalLucroMaior20 = 0;
        float lucro;
        float[] precoCompra = new float[100];
        float[] precoVenda = new float [100];
        int a = 0;

        do {
         System.out.println("Preço compra: ");
            precoCompra[a] = sc.nextFloat();
         System.out.println("Preço venda: ");
            precoVenda[a] = sc.nextFloat();  
         a++;
        } while (a < 100);
        a = 0;
        do {
        lucro = precoVenda[a] - precoCompra[a];
        if (lucro < 0.1 * precoCompra[a]) {
              totalLucroMenor10++;
        } else if (lucro <= 0.2 * precoCompra[a]) {
              totalLucroMenor20++;
        } else {
              totalLucroMaior20++;
            }
        a++;
        } while (a < 100);
        System.out.println("total de mercadorias com lucro < 10%:" + totalLucroMenor10);
        System.out.println("total de mercadorias com 10% <= lucro <= 20%: " + totalLucroMenor20);
        System.out.println("total de mercadorias com lucro > 20%: "+totalLucroMaior20);
        System.out.println();

    }
}
