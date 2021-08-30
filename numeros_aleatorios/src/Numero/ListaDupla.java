import java.util.Arrays; 
import java.util.Random;

public class ListaDupla {
    Parte primeira;
    Parte ultima;
    int total = 0;

    /*Criar uma aplicação para gerar 1000
     números aleatórios de -9999 a 9999 e armazená-los  num vetor. 
     Faça a impressão desses números na sua ordem de geração. Crie uma
      lista duplamente encadeada inserido os números em ordem crescente 
      na lista e imprima na ordem crescente e na ordem decrescente. Criar um 
    vídeo de 5 a 10 min explicando o código e apresentando a execução do programa */

    boolean posicaop(int posicao){

        return (posicao >= 0) && (posicao < this.total);
    }

    Parte chamaPart(int posicao){
        if (!posicaop(posicao)) {
            throw new IllegalArgumentException("Não encontrado!");
        }else{
            Parte atual = primeira;
            
            for (int i = 0; i < posicao; i++) {
              
                atual = atual.getProxima();
            }
            
            return atual;
        }
    }

    
    Object chama(int posicao)
    {
        return chamaPart(posicao).getElemento();
    }

    
    void AdicionarComeco(Object elemento){
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
            AdicionarComeco(elemento);
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
            AdicionarComeco(elemento);
        }else if(posicao == total){
            Adiciona(elemento);
        }else{
            Parte anterior = chamaPart(posicao-1);
            Parte proxima =  anterior.getProxima();
         
            Parte nova = new Parte(anterior.getProxima(), elemento);
           
            nova.setAnterior(anterior);
            anterior.setProxima(nova);
            proxima.setAnterior(nova);
            
            total++;
        }
    }

    void RemoverComeco(){
        if (!posicaop(0)) {
            throw new IllegalArgumentException("Posição inexistente!");
        }else{
            primeira = primeira.getProxima();
            total--;
        }
        if (total == 0) {
            ultima = null;
        }
    }

    void RemoverFim(){
        if (!posicaop(total-1)) {
            throw new IllegalArgumentException("Posição inexistente");
        }else{
            if (total == 1) {
                RemoverComeco();
            }else{

                Parte penultima = ultima.getAnterior();
                penultima.setProxima(null);
                ultima = penultima;
                total--;
            }
        }
    }

    void Remover(int posicao){
        if (!posicaop(posicao)) {
            throw new IllegalArgumentException("Posição inexistente");
        }else{
            if (posicao == 0) {
                RemoverComeco();
            }else if(posicao == total-1){
                RemoverFim();
            }else{

                Parte anterior = chamaPart(posicao - 1);
                Parte atual = anterior.getProxima();
                Parte proxima = atual.getProxima();

                anterior.setProxima(proxima);
                proxima.setAnterior(anterior);
                
                total--;
            }
        }
    }

    boolean Contem(Object elemento){
        Parte atual = primeira;
        while (atual != null) {
           if (atual.getElemento().equals(elemento)) {
               return true;
           }
           atual = atual.getProxima(); 
        }
        return false;
    }

    int Tamanho(){
        return total;
    }

    void EsvaziaLista(){
        primeira = null;
        ultima = null;
        total = 0;
    }


    String Imprimir(){
        if (total == 0) {
            return "vazio";

        }else{
           
            Parte atual = primeira;

            for (int i = 0; i < total - 1; i++) {
                System.out.print(" " + atual.getElemento());
                
                atual = atual.getProxima();
            }
            
            return "";
        
        }
    }
    String ImprimirContrario(){
        if (total == 0) {
            return "Vazio";
        }else{
            
            Parte atual = ultima;
            
            for (int i = 999; i > 0; i--) {
               
                System.out.print(" " + atual.getElemento());
                atual = atual.getAnterior();
            }
            
            return "";
        }
    }










    public static void main(String[] args) {
        
        ListaDupla numerosaleatorios = new ListaDupla();

        int No[] = new int[1000];
        
        Random gerador = new Random();
        
        for (int i = 0; i < 1000; i++) {
            int num = gerador.nextInt(19999)-9999;
            No[i] = num;
        }
        System.out.println("Ordem gerada: \n");
        
        for (int i : No) {
            System.out.print(i+",");
        }

        Arrays.sort(No);
        System.out.println("Numeros ordenados: \n");

        for (int i : No) {
            System.out.print(i+",");
        }
        
        for (int i : No) {
            numerosaleatorios.Adiciona(numerosaleatorios.total, i);
        }

        System.out.println("\nOrdenada \n"+numerosaleatorios.Imprimir());
        
        System.out.println("\nTras pra frente \n"+numerosaleatorios.ImprimirContrario());
    }    
}
