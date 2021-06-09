import java.util.Scanner;
public class respostawhile369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lugares, codigo, lugmesa, a;
        int[] mesa = new int[30];
        int[] qtde = new int[30]; 
        a = 0;

        while (a < 30) {
        mesa[a] = 100 + a;
        qtde[a] = 5;
        a++;
        }
        lugares = 150;

        System.out.println("Entre com codigo (100 - 129) ou O para terminar: ");
        codigo = sc.nextInt();

        while ( codigo > 0 && lugares != 0) {
            int i = 0;
            while (codigo != mesa[i] && i < 29) {
                i++;
            }
            if (codigo == mesa[a]) {
                System.out.print("Quantos lugares você quer reservar? ");
                lugmesa = sc.nextInt();
        
                if (qtde[a] >= lugmesa) {
                  qtde[a] -= lugmesa;
                  lugares -= lugmesa;
                } else {
                  System.out.println("Não há lugares para reservar.");
                }
        
              } else {
                System.out.println("Código de mesa inválido.");
        
              }
            }

            System.out.print("Entre com um codigo entre 100-129 ou 0 para desligar o programa: ");
            codigo = sc.nextInt();
      
          if (lugares == 0) {
            System.out.println("Lotação esgotada.");
          } else {
      
            System.out.println("Lugares Vagos");
      
            while (a < 30) {
      
              if (qtde[a] != 0) {
                System.out.println("Mesa: " + mesa[a] + "\t" + "Total de Lugares:" + qtde[a]);
              }
              a++;
            }
        }

    }

}
