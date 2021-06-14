import java.util.Scanner;

public class respostafor398 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k, codi, codigo = 1;
        int  t, i, quantidade, aux, auxcodigo, total = 0;
        float venda, geral, auxp, totalpreco = 0;

        int[] cod = new int[50];
        int[] quant = new int[50];
        float[] preco = new float[50];
        k = 0;
        geral = 0;

        System.out.println("Digite o codigo do produto ou 0 para encerrar: ");
        codi = sc.nextInt();
        for ( k = 0; k < 50 && codi != 0 && codi > 0; k++) {
            cod[k] = codi;
            System.out.println("Digite a quantidade de produtos: ");
            quant[k] = sc.nextInt();
            System.out.println("Digite o preço do produto: ");
            preco[k] = sc.nextFloat();
            System.out.println("Digite o codigo do produto ou 0 para encerrar: ");
            codi = sc.nextInt();
        }

        System.out.println("Sistema de compras:  ");
        codigo = 1;
        for ( int z = 0; z < cod.length && codigo > 0; z++) {
            System.out.println("Digite o codigo do produto a ser comprado ou 0 pra encerrar: ");
            codigo =  sc.nextInt();

            if(codigo == 0)break;   


          if (codigo == cod[z]) {
                System.out.println(" Qual a quantidade que gostaria de comprar: ");
                quantidade = sc.nextInt();
             if (quantidade <= quant[z] ) {
                 quant[z] -= quantidade;
                 total += quantidade;
                 totalpreco += quantidade * preco[z];
             } else {
                 System.out.println("!!! Estoque insuficiente !!!");
             }

             } else {
                System.out.println(" Produto não cadastrado! ");
            }

        }

        for (int j = 0; j < cod.length; j++) {
            for (int j2 = 0; j2 < cod.length; j2++) {
                if (quant[j] < quant[j2]) {
                    aux = quant[j];
                    quant[j2] = quant[j];
                    quant[j2] = aux;

                    auxp = preco[j];
                    preco[j] = preco[j2];
                    preco[j2] = auxp;
                    
                    auxcodigo = cod[j];
                    cod[j] = cod[j2];
                    cod[j2] = auxcodigo;

                }

            }
        }

     for (int j = 0; j < cod.length; j++) {
       System.out.println("Codigo: " + cod[j] + "  " + "Preço: " +preco[j]+ "  " + "Quantidade: " + quant[j]);
        }
       System.out.println("Total  vendido: " + totalpreco);
       System.out.println("Total de quantidade" + total);


    sc.close();
    }
}
