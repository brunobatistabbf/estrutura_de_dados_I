import java.util.Scanner;

/*A confederação brasileira de natação irá promover eliminatórias para o próximo
mundial Fazer um algoritmo que receba a idade de um nadador e imprimir a sua
categoria segundo a tabela a seguir:*/
public class resposta134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Entre com sua idade: ");
        idade =  sc.nextInt();

        if (idade < 5) {
            System.out.println("Não pode ser cadastrado");
        }if (idade<= 7 ) {
            System.out.println("Categoria Infantil A");
        } if (idade <= 10) {
            System.out.println("Categoria infantil B");
        }if (idade <= 13) {
            System.out.println("Categoria Juvenil A");
        }
        if (idade == 14) {
            System.out.println("Categoria Juvenil B");
        }
        if (idade == 15) {
            System.out.println("Categoria Juvenil B");
        }
        if (idade == 16) {
            System.out.println("Categoria Juvenil B");
        }
        if (idade == 17) {
            System.out.println("Categoria Juvenil B");
        }
        if(idade >= 18) {
         System.out.println("Categoria Senior");   
        }
        System.out.println(); 
        System.out.println("Com SWITCH");
        System.out.println("Entre com sua idade: ");
        idade =  sc.nextInt();

        switch (idade) {
            case 1:
            System.out.println("Não pode ser cadastrado");
                break;
            case 2:
             System.out.println("Não pode ser cadastrado");
                break;
            case 3:
            System.out.println("Não pode ser cadastrado");
             break;
            case 4:
              System.out.println("Não pode ser cadastrado");
                break;
            case 5:
            System.out.println("Categoria Infantil A");
                break;
            case 6:
            System.out.println("Categoria Infantil A");
                 break;
            case 7:
            System.out.println("Categoria Infantil A");
                    break;
            case 8:
            System.out.println("Categoria infantil B");
                    break;   
            case 9:
                System.out.println("Categoria infantil B");
                break;       
            case 10:
              System.out.println("Categoria infantil B");
                break;
            case 11:
            System.out.println("Categoria Juvenil A");
                        break;   
            case 12:
            System.out.println("Categoria Juvenil A");
                    break;       
            case 13:
            System.out.println("Categoria Juvenil A");
                    break;
             case 14:
             System.out.println("Categoria Juvenil B");
                      break;
            case 15:
            System.out.println("Categoria Juvenil B");
                              break;   
            case 16:
            System.out.println("Categoria Juvenil B");
                          break;       
            case 17:
            System.out.println("Categoria Juvenil B");
                          break;
                                    
            default:
                System.out.println("Classe Senior ");
                break;
     
       }
       System.out.println();
    }
}
