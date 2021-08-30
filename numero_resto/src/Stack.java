public class Stack {
    private Hu top;

  public void push(int parentese){
    Hu Huparte = new Hu();
    Huparte.setDado(parentese);
    Huparte.setAnterior(top);
    this.top = Huparte;
  }
  
  public void pop(){
    if(!isEmpyt()){
        System.out.println(top.GetDado());
        top = top.getAnterior();
    }else{
      System.out.println("Pilha vazia!!");
    }
  }

  public boolean isEmpyt(){
    if (top == null) {
        System.out.println("Vazia");
        return true;
    
    }else{
        System.out.println("Há elementos");
        return false;
    }
  }
 
  public int tamanho(){
    Hu j;
    j = top;
    int contador = 0;
    
    while(j!= null){
      j = j.getAnterior();
      contador++;
    }
    return contador;
  }

  public Hu top(){
    if (isEmpyt()) {
      System.out.println("Pilha vazia!!");
      return null;
    }else{
      System.out.println("Topo da pilha: " +top.GetDado());
      return top;
    }
  }

  public void imprimir(){
    Hu j;
    j = top;
    if (isEmpyt()) {
      System.out.println("Pilha vazia!!!");
    }else{
      while (j != null) {
        System.out.print(j.GetDado()+ " ");
        j = j.getAnterior();
      }
    }
   }
}
