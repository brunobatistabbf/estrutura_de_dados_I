public class programa {
    public static void main(String[] args) {
        Pilha pilhaberta = new Pilha();
        Pilha pilhafechada = new Pilha();
       
        int aberto = 0;
        int fechado = 0;
        String certo = "";

        String parenteses = " (  (  )  )  –  (  (  ) (  )  )  –  (  )  (  )";
        
        int tamanho = parenteses.length();
        
        for (int i = 0; i < tamanho; i++) {
          if(parenteses.charAt(i) == '('){
          
            pilhaberta.push('(');
            aberto++;
        
        }else if(parenteses.charAt(i) == ')'){
            pilhafechada.push(')');
            fechado++;
        
        }
          if (aberto >= fechado) {
            certo = "Correto\n";
          }else{
            certo = "Errado \n";
            break;
          }
    
        }
    
        if (aberto > fechado) {
          certo = "Errado\n";
        }
      
        System.out.print(certo + parenteses);
        
      }
}
