
public class Dupla {
    Parte primeira;
    Parte ultima;
    int total = 0;

    boolean PosicaoOcupada(int posicao){
        return (posicao >= 0) && (posicao < total);
    }

    Parte pegaPart(int posicao){
        if (!this.PosicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inexistente");
        
        }else{
        
            Parte atual = primeira;
            for (int i = 0; i < posicao; i++) {
                atual = atual.getProxima();
            }
            return atual;
        }
    }

    Object Pega(int posicao){
        return pegaPart(posicao).getElemento();
    }

    void Comeco(Object elemento){
      
        if (total == 0) {
            Parte nova = new Parte(elemento);
            primeira = nova;
            ultima = nova;
        }else{
            Parte nova =  new Parte(primeira, elemento);
            primeira.setAnterior(nova);
            primeira = nova;
        }
       
        total++;
    }

    void Adiciona(Object elemento){
        if (total == 0) {
            Comeco(elemento);
        }else{
            Parte nova = new Parte(elemento);
            ultima.setProxima(nova);
            nova.setAnterior(ultima);
            ultima = nova;
            total++;
        }
    }
    void Adiciona(int posicao, Object elemento){
        if (posicao == 0) {
            Comeco(elemento);
        }else if(posicao == total){
            this.Adiciona(elemento);
        }else{
            Parte anterior = this.pegaPart(posicao-1);
            Parte proxima =  anterior.getProxima();
            Parte nova = new Parte(anterior.getProxima(), elemento);
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            total++;
        }
    }

    void RemoveComeco(){
        if (!PosicaoOcupada(0)) {
            throw new IllegalArgumentException("Posição inexistente!");
        }else{
            primeira = this.primeira.getProxima();
            total--;
        }
        if (total == 0) {
            ultima = null;
        }
    }

    void RemoveFim(){
        if (!PosicaoOcupada(total-1)) {
            throw new IllegalArgumentException("Posição inexistente");
        }else{
            if (total == 1) {
                RemoveComeco();
            }else{
                Parte penultima = ultima.getAnterior();
                penultima.setProxima(null);
                ultima = penultima;
                total--;
            }
        }
    }

    void Remove(int posicao){
        if (!this.PosicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inexistente");
        }else{
            if (posicao == 0) {
                this.RemoveComeco();
            }else if(posicao == total-1){
                this.RemoveFim();
            }else{
                Parte anterior = pegaPart(posicao - 1);
                Parte atual = anterior.getProxima();
                Parte proxima = atual.getProxima();
                anterior.setProxima(proxima);
                proxima.setAnterior(anterior);
                total--;
            }
        }
    }

    boolean Contem(Object elemento){
        Parte atual = this.primeira;
        while (atual != null) {
           if (atual.getElemento().equals(elemento)) {
               return true;
           }
           atual = atual.getProxima(); 
        }
        return false;
    }

    int Tamanho(){
        return this.total;
    }

    void EsvaziaLista(){
        this.primeira = null;
        this.ultima = null;
        this.total = 0;
    }

    String Imprimir(){
        if (this.total == 0) {
            return "Zerado";
        }else{
           
            Parte atual = this.primeira;
            for (int i = 0; i < this.total - 1; i++) {
               
                System.out.print( "\n " + atual.getElemento());
                atual = atual.getProxima();
            
            }
            
    
            return "\n "  ;
        }
    }  












    public static void main(String[] args) {
        Dupla lista = new Dupla();
        //Adicione Homer e Marge na lista e depois imprima o resultado.
        lista.Adiciona("Homer");
        lista.Adiciona("Marge");
        System.out.println(lista.Imprimir());
        
        //Esvazie a lista e imprima.
        lista.EsvaziaLista();
        System.out.println(lista.Imprimir());
      
        //Adicione Homer na lista. Depois adicione Bart na posição 0 e Moe na posição 1 e imprima a lista
        lista.Adiciona("Homer");
        lista.Adiciona(0, "Bart");
        lista.Adiciona(1, "Moe");
        System.out.println(lista.Imprimir());

        //Esvazie a lista.
        lista.EsvaziaLista();

        //Adicione Homer e Bart na lista e depois Adicione Lisa no início da lista. Imprima o resultado e o tamanho da lista.
        lista.Adiciona("Homer");
        lista.Adiciona("Bart");
        lista.Comeco("Lisa");
        System.out.println(lista.Imprimir());
        System.out.println(lista.Tamanho());
        
        //Esvazie a lista e imprima.
        lista.EsvaziaLista();
     
        //Adicione Homer, Maggie na lista. Depois adicione Bart na posição 0 e Marge na posição 1 e imprima a lista. Verifique se Lisa está na lista.
        lista.Adiciona("Homer");
        lista.Adiciona("Maggie");
        lista.Adiciona(0, "Bart");
        lista.Adiciona(1, "Marge");
        System.out.println(lista.Imprimir());
        System.out.println(lista.Contem("lisa"));
        
        //Esvazie a lista.
        lista.EsvaziaLista();
        
        //Adicione Homer e Bart na lista e depois imprima o resultado e o tamanho da lista.
        lista.Adiciona("Homer");
        lista.Adiciona("Bart");
        System.out.println(lista.Imprimir());
        System.out.println(lista.Tamanho());
        
        //Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println(lista.Contem("Marge"));
        System.out.println(lista.Contem("Homer"));
        System.out.println(lista.Contem("Bart"));
        System.out.println(lista.Contem("Maggie"));
        System.out.println(lista.Tamanho());
        
        //Esvazie a lista.
        lista.EsvaziaLista();
        
        //Adicione Homer e Bart no começo da lista. Depois
        //adicione Marge, e depois Maggie na posição 1 e depois
        //Ned Flanders no Começo da lista e Sr. Burns no Final
        //da lista imprima a lista
        lista.Comeco("Homer");
        lista.Comeco("Bart");
        lista.Adiciona("Marge");
        lista.Adiciona(1, "Maggie");
        lista.Comeco("Ned Flanders");
        lista.Adiciona(lista.total, "Sr. Burns");
        System.out.println(lista.Imprimir());
        
        //Remova do fim da lista e imprima a lista.
        lista.RemoveFim();
        System.out.println(lista.Imprimir());
      
        //Remova a posição 1, depois imprima a lista e o tamanho da lista.
        lista.Remove(1);
        System.out.println(lista.Imprimir());
        System.out.println(lista.Tamanho());
      
        //Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println(lista.Contem("Marge"));
        System.out.println(lista.Contem("Homer"));
        System.out.println(lista.Contem("Bart"));
        System.out.println(lista.Contem("Maggie"));
        System.out.println(lista.Tamanho());
        
        //16) Remova do começo da lista, depois imprima a lista e o tamanho da lista.
        lista.RemoveComeco();
        System.out.println(lista.Imprimir());
        System.out.println(lista.Tamanho());
       
        //Verifique se Marge, Homer, Bart e Maggie na lista e depois imprima o resultado e o tamanho da lista.
        System.out.println(lista.Contem("Marge"));
        System.out.println(lista.Contem("Homer"));
        System.out.println(lista.Contem("Bart"));
        System.out.println(lista.Contem("Maggie"));
        System.out.println(lista.Tamanho());
      
        //Esvazie a lista e imprima.
        lista.EsvaziaLista();
        System.out.println(lista.Imprimir());
    }

}
