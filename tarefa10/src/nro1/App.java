import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String [] args){
        Random gerador = new Random();

        lista_encadeada roda = new lista_encadeada();
        
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Alberto");
        nomes.add("Douglas");
        nomes.add("Jesmmer");
        nomes.add("Cristina");
        nomes.add("Ana");
        nomes.add("Jorge");
        nomes.add("Jaqueline");
        nomes.add("Lara");
        nomes.add("Laura");
        nomes.add("Aura");
        nomes.add("Henrique");
        nomes.add("Bruno");
        nomes.add("Bruno");
        nomes.add("Thiago");
        nomes.add("Fernando");
        nomes.add("Beatriz");
        nomes.add("Clara");
        nomes.add("Ruby");
        nomes.add("Daniela");
        nomes.add("Dayane");

        ArrayList<String> enderecos = new ArrayList<String>();
        enderecos.add("Rua lopez");
        enderecos.add("Rua 2");
        enderecos.add("Rua Cara");
        enderecos.add("Rua a ");
        enderecos.add("Rua Cara");
        enderecos.add("Rua 25 de março");
        enderecos.add("Rua tiete");
        enderecos.add("Avenida lopez 2");
        enderecos.add("Avenida margelho");
        enderecos.add("Centro de idosos");
        enderecos.add("casa das flores");
        enderecos.add("Rua do abc");
        enderecos.add("Comunidade cruz");
        enderecos.add("igreja valdemore");
        enderecos.add("GUIa do instrutor");
        enderecos.add("Rua oliver");
        enderecos.add("Oliveira de almeida residencial");
        enderecos.add("GRande oliver");
        enderecos.add("Pequeno oliver");
        enderecos.add("Avenida Augusta");
        enderecos.add("Avenida Brasil");
        enderecos.add("Avenida Paulista");
        
       
        ArrayList<String> cpfs = new ArrayList<String>();
        cpfs.add("111.111.111-34");
        cpfs.add("222.222.222-22");
        cpfs.add("333.333.333-33");
        cpfs.add("444.444.444-44");
        cpfs.add("555.555.555-43");
        cpfs.add("666.666.666-66");
        cpfs.add("777.777.777-77");
        cpfs.add("888.888.888-88");
        cpfs.add("999.999.999-99");
        cpfs.add("121.121.121-11");
        cpfs.add("343.343.343-33");
        cpfs.add("454.454.454-44");
        cpfs.add("787.787.787-77");
        cpfs.add("121.121.121-22");
        cpfs.add("767.676.676-66");
        cpfs.add("343.343.343-54");
        cpfs.add("655.566.556-52");
        cpfs.add("121.344.544-44");
        cpfs.add("676.777.454-98");
        cpfs.add("323.232.766-26");
        
        ArrayList<String> telefones = new ArrayList<>();
        telefones.add("0000000000");
        telefones.add("1111111111");
        telefones.add("2222222222");
        telefones.add("1154541111");
        telefones.add("2333332222");
        telefones.add("0000111100");
        telefones.add("11767667111");
        telefones.add("2222999922");
        telefones.add("1154541111");
        telefones.add("2333332222");
        telefones.add("0023232000");
        telefones.add("1111545411");
        telefones.add("22223422222");
        telefones.add("1154541111");
        telefones.add("2333332222");
        telefones.add("043243000");
        telefones.add("1111154511");
        telefones.add("22222254422");
        telefones.add("1154541111");
        telefones.add("2333332222");


        for (int i = 1; i <= 20; i++) {
            int num = gerador.nextInt(6);
            String nome = nomes.get(num);
            num = gerador.nextInt(3);
            String telefone = telefones.get(num);
            num = gerador.nextInt(4);
            String endereco = enderecos.get(num);
            num = gerador.nextInt(4);
            String cpf = cpfs.get(num);
            
            roda.inseririncial(i, nome, telefone, endereco, cpf);

        }
       
        System.out.println(roda);
       
        for (int i = 0; i < 19; i++) {
           int num = gerador.nextInt(roda.tamanho);
           roda.retirarIndice(num);
        }
        
        System.out.println(roda.incial.nro +": "+ roda.incial.nome);
    }
}
