public class respostawhile167 {
    public static void main(String[] args) {
        
        int l = 1;
        int c =1;
        int t = 1;

        System.out.println("ACIMA DIAGONAL PRINCIPAL");
        
        while (1 <= 9) {
            while (c <= 10) {
             System.out.println("\t" + l + "-" + c);   
             c++;
            }

            c = l + 1;
            System.out.println();
            
            while (t <= l) {
            System.out.print("\t");
               t++;
        }
          t = 1;
          l++;
        }

    }
}
