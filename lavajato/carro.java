
public class carro {
    
    String nroIden;
    String proprietario;
    String cor;
    
    public carro(String nroIden, String proprietario, String cor){
      this.nroIden = nroIden;
      this.proprietario = proprietario;
      this.cor = cor;
    }

    public carro(){};

    public void getCar(){
      System.out.println("Numero de identificação: "+ this.nroIden);
      System.out.println("Proprietario: "+ this.proprietario);
      System.out.println("Cor:"+ this.cor);
    }

    public String getnroIden(){
      return this.nroIden; 
    }
}
