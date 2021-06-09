import java.util.Scanner;

public class respostafor369 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int lugares, codigo, lugmesa, a;
     int[] mesa = new int[30];
     int[] qtde = new int[30];

    for ( a = 0; a < 30; a++) {
        mesa[a] = 100 + a;
        qtde[a] = 5;
    }
    lugares = 150;

    System.out.println("Entre com codigo (100 - 129) ou O para terminar: ");
    codigo = sc.nextInt();
    
    for (; codigo > 0 && lugares != 0;) {
       int i;
        for (i = 0; codigo != mesa[i] && i < 29; i++) {
        }

        if (codigo == mesa[i]) {
            System.out.print("Quantidade de lugares a  reservar? ");
            lugmesa = sc.nextInt();
    
            if (qtde[i] >= lugmesa) {
              qtde[i] -= lugmesa;
              lugares -= lugmesa;
            } else {
              System.out.println("Não há lugares para reservar.");
              break;
            }
    
          } else {
            System.out.println("Código de mesa inválido.");
            System.out.print("Entre com um codigo entre 100-129 ou 0 para desligar o programa: ");
            codigo = sc.nextInt();
          }
    
          if (lugares == 0) {
            System.out.println("Lotação esgotada.");
          } else {
            System.out.println("Lugares Vagos");
            for (i = 0; i < 30; i++) {
              if (qtde[i] != 0) {
                System.out.println("Mesa: " + mesa[i] + "\t" + "Total de Lugares:" + qtde[i]);
              }
            }
          }
        }
        
      


    }
}
