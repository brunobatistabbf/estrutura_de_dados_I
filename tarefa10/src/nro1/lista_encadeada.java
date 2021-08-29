public class lista_encadeada {

    numero incial = null;
    int tamanho = 0;

    public void inseririncial(int nro, String numerome, String telefone, String endereco, String cpf){
        numero numero = new numero(nro, numerome, telefone, endereco, cpf);
        numero.proximo = incial;
        incial = numero;
        tamanho++;
    }

    public String retirarincial(){
        if (incial == null) {
            return null;
        }
        String dados = "Numero:"+ incial.nro +", nome: "+incial.nome +" retirado";
        incial = incial.proximo;
        tamanho--;
        return dados;
    }

    public void inserirFim(int nro, String numerome, String telefone, String endereco, String cpf){
        numero numero = new numero(nro, numerome, telefone, endereco, cpf);
        if (incial == null) {
            numero.proximo = null;
            incial = numero;
        }else{
            numero local = incial;
            while (local.proximo != null) {
                local = local.proximo;
            }
            local.proximo = numero;
            numero.proximo = null;
        }
        tamanho++;
    }

    public String retirarFim(){
        if (incial == null) {
            return null;
        }
        numero local = incial;
        while (local.proximo != null){
            numero aux = local;
            local = local.proximo;
            if (local.proximo == null) {
                aux.proximo = null;
                tamanho--;
                return "Numero:"+ local.nro +", nome: "+local.nome +" retirado";
            }
        }
        incial = null;
        tamanho--;
        return null;
    }

    public void inserirIndice(int indice, int nro, String numerome, String telefone, String endereco, String cpf){
        if (indice <= 0) {
            inseririncial(nro, numerome, telefone, endereco, cpf);
        }else if(indice >= tamanho){
            inserirFim(nro, numerome, telefone, endereco, cpf);
        }else{
            numero local = incial;
            for (int i = 0; i < indice - 1; i++) {
                local = local.proximo;
            }
            numero numero  = new numero(nro, numerome, telefone, endereco, cpf);
            numero.proximo = local.proximo;
            local.proximo = numero;
            tamanho++;
        }
    }

    public String retirarIndice(int indice){
        if (indice < 0 || indice >= tamanho || incial == null){
            return null;
        }else if (indice == 0) {
            return retirarincial();
        }else if(indice == tamanho -1){
            return retirarFim();
        }
        numero local = incial;
        for (int i = 0; i < indice-1; i++) {
            local = local.proximo;
        }
        String info = "Numero:"+ local.proximo.nro +", nome: "+local.proximo.nome +" retirado";
        local.proximo = local.proximo.proximo;
        tamanho--;
        return info;
    }
    public String toString(){
        String str = "";
        numero local  = incial;
        while (local != null) {
            str += local.nro+ ": "+ local.nome +", cpf: "+local.cpf+", endereço: "+ local.endereco+ "\n";
            local = local.proximo; 
        }
        return str;
    }
    
    
}