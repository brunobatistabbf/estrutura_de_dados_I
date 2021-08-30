
public class Parte {
    char parentese;
    Parte anterior;
  
    public Parte(){

    }
   
    public Parte(char parentese, Parte anterior){
      this.parentese = parentese;
      this.anterior = anterior;
    }
  
    public char GetDado(){
      return this.parentese;
    }
  
    public void setDado(char parentese){
      this.parentese = parentese;
    }
    
    public Parte getAnterior(){
      return (this.anterior);
    }
  
    public void setAnterior(Parte anterior){
      this.anterior = anterior;
    }
}
