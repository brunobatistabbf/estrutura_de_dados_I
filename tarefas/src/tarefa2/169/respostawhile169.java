public class respostawhile169 {
    public static void main(String[] args) {
        int l = 1;
        int c = 1;
        System.out.println("ABAIXO DA DIAGONAL PRINCIPAL ");

        while (l <= 10) {
            System.out.println();
        
            while (c < l) {
                System.out.print(l + "-" + c + "\t");
                c++;
            }
            l++;
            c = 1 ;
        }
    System.out.println();
    }

}
