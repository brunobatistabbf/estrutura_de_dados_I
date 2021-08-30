public class Pilha {
   
  Parte topo;

    public void push(char parentese){
      Parte Nparte = new Parte();
      Nparte.setDado(parentese);
      Nparte.setAnterior(this.topo);
      topo = Nparte;
    }
    
    public void pop(){
      if(!isEmpyt()){
        System.out.println("Retirando elemento da pilha"+ topo.GetDado());
        topo = topo.getAnterior();
      }else{
        System.out.println("Pilha vazia!!");
      }
    }
    public boolean isEmpyt(){
      if (topo == null) {
        return true;
      }else{
        return false;
      }
    }
    public int sizePilha(){
      Parte p;
      p = topo;
      int cont = 0;
      
      while(p!= null){
        p = p.getAnterior();
        cont++;
      }
      return cont;
    }

    public Parte topo(){
      if (isEmpyt()) {
        System.out.println("Pilha vazia!!");
        return null;
      }else{
        System.out.println("Topo da pilha: " +topo.GetDado());
        return topo;
      }
    }
    public void imprimir(){
      Parte p;
      p = topo;
      if (isEmpyt()) {
        System.out.println("Pilha vazia!!!");
      }else{
        while (p != null) {
          System.out.print(p.GetDado()+ " ");
          p = p.getAnterior();
        }
      }
    }
}
