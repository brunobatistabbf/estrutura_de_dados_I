
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        fila sujos = new fila();
        fila lavados = new fila();
        int option;
       
        do{
          System.out.println("<<=== Bem vindo a operação Lava Jato ===>>");
          System.out.println("1- Adicionar carro a fila");
          System.out.println("2- Imprimir carros lavados");
          System.out.println("3- Ordenar fila dos carros lavados");
          System.out.println("4- Finalizar");
          option = sc.nextInt();
    
          if (option == 1) {
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
          }else if (option == 2) {
            lavados.listar();
          }else if(option == 3){
            lavados.ordenar();
          }else{
            break;
          }
        }while(true);
       
    }

}
