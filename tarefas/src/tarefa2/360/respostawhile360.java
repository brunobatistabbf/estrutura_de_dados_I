import java.util.Scanner;
public class respostawhile360 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int dia, data,  mes;
     int i = 0;
     int[] ultdia = new int[12];
     String[] signo = new String[12];   
     
     while(i < 12){
     System.out.println("Digite signo");
     signo[i] = sc.next();
     System.out.println("Digite ultimo dia: ");
     ultdia[i] = sc.nextInt();
      i++;
     }
     System.out.println("Digite data no formato ddmm ou 9999 para terminar: ");
     data =  sc.nextInt();
     
     while (data != 9999) {
        dia = data/100;
        mes = data % 100;
        mes--;

        if (dia > ultdia[mes]) {
            mes = (mes + 1) % 12;
        }
        System.out.println("Signos : " + signo[mes] + "\n");
        System.out.println("Digite data formato ddmm ou 9999 para terminar: ");
        data = sc.nextInt();
     }

    }
}
