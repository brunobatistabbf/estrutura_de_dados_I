public class lista_encadeada {

    Now incial = null;
    int tamanho = 0;

    public void inseririncial(int nro, String numerome, String telefone, String endereco, String cpf){
        Now now = new Now(nro, numerome, telefone, endereco, cpf);
        now.proximo = incial;
        incial = now;
        tamanho++;
    }

    public lista_encadeada(Now incial) {
        this.incial = incial;
    }

    public lista_encadeada() {
    }

    public String retirarincial(){
        if (incial == null) {
            return null;
        }
        String dados = "Now:"+ incial.nro +", nome: "+incial.nome +" retirado";
        incial = incial.proximo;
        tamanho--;
        return dados;
    }

    public void inserirFim(int nro, String numerome, String telefone, String endereco, String cpf){
        Now now = new Now(nro, numerome, telefone, endereco, cpf);
        if (incial == null) {
            now.proximo = null;
            incial = now;
        }else{
            Now local = incial;
            while (local.proximo != null) {
                local = local.proximo;
            }
            local.proximo = now;
            now.proximo = null;
        }
        tamanho++;
    }

    public String retirarFim(){
        if (incial == null) {
            return null;
        }
        Now local = incial;
        while (local.proximo != null){
            Now aux = local;
            local = local.proximo;
            if (local.proximo == null) {
                aux.proximo = null;
                tamanho--;
                return "Now:"+ local.nro +", nome: "+local.nome +" retirado";
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
            Now local = incial;
            for (int i = 0; i < indice - 1; i++) {
                local = local.proximo;
            }
            Now now  = new Now(nro, numerome, telefone, endereco, cpf);
            now.proximo = local.proximo;
            local.proximo = now;
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
        Now local = incial;
        for (int i = 0; i < indice-1; i++) {
            local = local.proximo;
        }
        String info = "Now:"+ local.proximo.nro +", nome: "+local.proximo.nome +" retirado";
        local.proximo = local.proximo.proximo;
        tamanho--;
        return info;
    }
    public String toString(){
        String str = "";
        Now local  = incial;
        while (local != null) {
            str += local.nro+ ": "+ local.nome +", cpf: "+local.cpf+", endereço: "+ local.endereco+ "\n";
            local = local.proximo; 
        }
        return str;
    }
    
    
}