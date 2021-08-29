import java.util.ArrayList;
import java.util.Random;

public class Lista {
    Numero inicial = null;
    int tamanho = 0;


    public void inserirInicio(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade){
        
        Numero Numero = new Numero(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
        Numero.proximo = inicial;
        inicial = Numero;
        tamanho++;
    }

    public Numero retirarInicio(){
      
        if (inicial == null) {
            return null;
        }

        Numero aux = inicial;
        inicial = inicial.proximo;
        tamanho--;
       
        return aux;
    }

    public void inserirFim(int id, String sexo, int idade,  boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade){
        Numero Numero = new Numero(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
      
        if (inicial == null) {
            Numero.proximo = null;
            inicial = Numero;
        }else{
            Numero local = inicial;
            
            while (local.proximo != null) {
                local = local.proximo;
            }
            local.proximo = Numero;
            Numero.proximo = null;
        }

        tamanho++;
    }

    public Numero retirarFim(){
       
        if (inicial == null) {
            return null;
        }
      
        Numero local = inicial;
       
        while (local.proximo != null){
            Numero aux = local;
            local = local.proximo;
            if (local.proximo == null) {
                aux.proximo = null;
                tamanho--;
                return local;
            }
        }

        inicial = null;
        tamanho--;
        return null;
    }

    public void inserirIndice(int indice, int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade){
      
        if (indice <= 0) {
            inserirInicio(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
        }else if(indice >= tamanho){
            inserirFim(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
        }else{
            Numero local = inicial;
            for (int i = 0; i < indice - 1; i++) {
                local = local.proximo;
            }
            Numero Numero  = new Numero(id, sexo, idade,  gestante, lactante, necessidadeEspecial, prioridade);
            Numero.proximo = local.proximo;
            local.proximo = Numero;
            tamanho++;
        }
    }

    public Numero selecionarIndice(int indice){
       
        Numero local = inicial;

        for (int i = 0; i < indice - 1; i++) {
            local = local.proximo;
        }

        return local;
    }

    public Numero retirarIndice(int indice){
       
        if (indice < 0 || indice >= tamanho || inicial == null){
            return null;
        }else if (indice == 0) {
            return retirarInicio();
        }else if(indice == tamanho -1){
            return retirarFim();
        }
      
        Numero local = inicial;
       
        for (int i = 0; i < indice-1; i++) {
            local = local.proximo;
        }

        local.proximo = local.proximo.proximo;
       
        return local;
    }

    public String toString(){
        String str = "";
        Numero local  = inicial;
        while (local != null) {

            str = str +  "\nID: "+ local.id + "\nNivel de prioridade: "+ local.prioridade;
            local = local.proximo; 
        }
        return str;
    }



    public static void main(String [] args){
        
        Lista natendidos = new Lista();
        Lista atendidos = new Lista();
        Random gerador = new Random();
        
        ArrayList<String> sexos = new ArrayList<String>();
        sexos.add("Masculino");
        sexos.add("Feminino");
       
        int id = 1;
       
        for (int i = 0; i < 10; i++) {
              
            for(int h = 0; h < 5; h++){
                    String sexo = sexos.get(gerador.nextInt(2));
                    int idade = gerador.nextInt(59)+1;
                    natendidos.inserirInicio(id, sexo, idade, false, false, false, 0);
                    id++;
                }
            
            for(int h = 0; h < 3; h++){
                    String sexo = sexos.get(gerador.nextInt(2));
                    int idade = gerador.nextInt(60)+60;
                    natendidos.inserirInicio(id, sexo, idade, false, false, false, 1);
                    id++;
                }
            
            String sexo = sexos.get(gerador.nextInt(2));
            int idade = gerador.nextInt(59)+1;
            natendidos.inserirInicio(id, sexo, idade, false, false, true, 2);
            id++;

            sexo = sexos.get(1);
            idade = gerador.nextInt(41)+8;
            natendidos.inserirInicio(id, sexo, idade, true, true, false, 3);
            id++;

            natendidos = ordenar(natendidos);
                for (int f = 0; f <= i ; f++) {
                    Numero atendido = natendidos.retirarInicio();
                    atendidos.inserirFim(atendido.id, atendido.sexo, atendido.idade, atendido.gestante, atendido.lactante, atendido.necessidadeEspecial, atendido.prioridade);
                }
            } 
            
          System.out.println("Atendidas: =========="+ atendidos); 
          System.out.println("Não atendidas: =============="+ natendidos);     
    }



    public static Lista ordenar(Lista natendidos){
        if (natendidos.tamanho > 1) {
           
            for (int k = 1; k < natendidos.tamanho; k++) {
               
                if (natendidos.selecionarIndice(k).prioridade > natendidos.selecionarIndice(k - 1).prioridade ) {
                    Numero aux = new Numero();
                    Numero aux2 = new Numero();
                
                    aux = natendidos.selecionarIndice(k-1);
                    aux2 = natendidos.selecionarIndice(k);
                
                    natendidos.inserirIndice(k-1, aux2.id, aux2.sexo, aux2.idade, aux2.gestante, aux2.lactante, aux2.necessidadeEspecial, aux2.prioridade);
                    natendidos.inserirIndice(k, aux.id, aux.sexo, aux.idade, aux.gestante, aux.lactante, aux.necessidadeEspecial, aux.prioridade);
                    natendidos.retirarIndice(k-1);
                    natendidos.retirarIndice(k-1);
               
                    return natendidos;
                }
            }
        }
        return natendidos;
    }
}