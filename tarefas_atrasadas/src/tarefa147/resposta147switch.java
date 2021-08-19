import java.util.Scanner;
public class resposta147switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op, os, ob, calorias;
        calorias = 0;
        System.out.println("Digite\n 1- Vegetariano\n 2- Peixe\n 3- Frango\n 4- Carne\n");
        op = sc.nextInt();
        switch (op) {
            case 1:
            calorias = calorias + 180;
                break;
            case 2:
            calorias = calorias + 230;
                break;
            case 3:
            calorias = calorias + 250; 
                break;
            case 4:
            calorias = calorias + 350;
                break;
            default:
            System.out.println("Insira uma opção valida;");
                break;
        }
        System.out.println("Digite\n 1- Abacaxi\n 2- Sorvete Diet\n 3- Suco Melão\n 4- Refrigerante Diet");
        op = sc.nextInt();
        switch (op) {
            case 1:
            calorias = calorias + 75;
                break;
            case 2:
            calorias = calorias + 110;
                break;
            case 3:
            calorias = calorias + 170; 
                break;
            case 4:
            calorias = calorias + 200;
                break;
            default:
            System.out.println("Insira uma opção valida;");
                break;
        }
        System.out.println("Digite\n 1- Cha\n 2- Suco de Laranja\n 3- Mousse Diet\n 4- Mousse de Chocolate");
        op = sc.nextInt();
        switch (op) {
            case 1:
            calorias = calorias + 20;
                break;
            case 2:
            calorias = calorias + 70;
                break;
            case 3:
            calorias = calorias + 100; 
                break;
            case 4:
            calorias = calorias + 65;
                break;
            default:
            System.out.println("Insira uma opção valida;");
                break;
        }

        System.out.println("Total de Calorias: "+calorias);
        System.out.println();
        sc.close();
    }
}
