public class Hu {
  int numero;
  Hu anterior;

  public Hu(){

  }
 
  public Hu(int numero, Hu anterior){
    this.numero = numero;
    this.anterior = anterior;
  }

  public int GetDado(){
    return this.numero;
  }

  public void setDado(int numero){
    this.numero = numero;
  }
  
  public Hu getAnterior(){
    return (this.anterior);
  }

  public void setAnterior(Hu anterior){
    this.anterior = anterior;
  }
}
