
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        fila sujos = new fila();
        fila lavados = new fila();
        int opcao;
       
        do{
          System.out.println("----- LAVA JATO DO ZECÃO ----------=====>");
          System.out.println("1  Adicionar carro na fila");
          System.out.println("2  Imprimir lavados");
          System.out.println("3  Ordenar lavados");
          System.out.println("4  Sair");
          opcao = sc.nextInt();
    
          if (opcao == 1) {
            System.out.println("Insira o numero de identificação: ");
            String nro = sc.next();
            System.out.println("Insira o nome do dono: ");
            String nome = sc.next();
            System.out.println("Insira a cor do carro: ");
            String cor = sc.next();
            if (sujos.tamanho() == 3) {
              lavados.insere(sujos.remove());
              sujos.insere(new carro(nro, nome, cor));
            }else{
              sujos.insere(new carro(nro, nome, cor));
            }
          }else if (opcao == 2) {
            lavados.listar();
          }else if(opcao == 3){
            lavados.ordenar();
          }else{
            break;
          }

        }while(true);
       sc.close();
    }

}
