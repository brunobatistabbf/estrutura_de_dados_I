
public class numero {
    int nro;
    String nome;
    String telefone;
    String endereco;
    String cpf;
    numero proximo;
    public numero(){
        this.nome = null;
        this.cpf = null;
    }
 
    public numero(int numero, String nome, String telefone, String endereco, String cpf){
        this.nro = numero;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }
}
