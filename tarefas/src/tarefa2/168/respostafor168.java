public class respostafor168 {
    public static void main(String[] args) {
        int L;
        int c;
        int t;

        System.out.println("DIAGONAL PRINCIPAL");

        for ( L = 1 ; L <=10; L++) 
        {
            System.out.print(L + "-" + L + "\n");
            for ( t = 1; t <= L; t++) {
              System.out.print("\t");  
            }
        }
        System.out.println();
    }

}
