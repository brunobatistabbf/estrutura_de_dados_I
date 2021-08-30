
public class Pessoa {
  
    int id;
    String sexo;
    int idade;
    boolean gestante;
    boolean lactante;
    boolean necessidadeEspecial;
    int prioridade =  0;
   

    public Pessoa(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial, int prioridade) {
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
        this.prioridade = prioridade;
    }

    public Pessoa(int prioridade, int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial){
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
        this.prioridade = prioridade;
    }

    public Pessoa() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isGestante() {
        return this.gestante;
    }

    public boolean getGestante() {
        return this.gestante;
    }

    public void setGestante(boolean gestante) {
        this.gestante = gestante;
    }

    public boolean isLactante() {
        return this.lactante;
    }

    public boolean getLactante() {
        return this.lactante;
    }

    public void setLactante(boolean lactante) {
        this.lactante = lactante;
    }

    public boolean isNecessidadeEspecial() {
        return this.necessidadeEspecial;
    }

    public boolean getNecessidadeEspecial() {
        return this.necessidadeEspecial;
    }

    public void setNecessidadeEspecial(boolean necessidadeEspecial) {
        this.necessidadeEspecial = necessidadeEspecial;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
   
    public String toString() {
        return "\nID: "+ this.id +"\n Prioridade: "+ this.prioridade;
    }
}

