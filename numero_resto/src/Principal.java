import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int numero ;

        Scanner input = new Scanner(System.in);
      
        Stack par = new Stack();
        Stack impar = new Stack();
    
         
        while(true){
          System.out.println("Digite um numero entre -127 e 128 (0 para finalizar):");
          numero = input.nextByte();
          if (numero == 0) {
            break;
          }else if(numero % 2 == 0){
            par.push(numero);
          }else{
            impar.push(numero);
          }
        }
    
        while(true){
          if(!impar.isEmpyt())
          {
            impar.pop();
          }
          else if(!par.isEmpyt())
          {
            par.pop();
          }
          else {
            break;
          }
        }
        
        
        if (!impar.isEmpyt()) {

          System.out.println("Impares "+ impar.tamanho());
          while(!impar.isEmpyt()){
            impar.pop();
          }
        }else if (!par.isEmpyt()){

          System.out.println("Pares"+ par.tamanho());
          while(!par.isEmpyt()){ 
            par.pop();
        }
      }
      
      
      
    }    
}
