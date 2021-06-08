public class respostafor169 {
    public static void main(String[] args) {
        int l, c, t ;
        System.out.println("ABAIXO DA DIAGONAL PRINCIPAL ");

        for ( l = 2; l <= 10; l++) {
            System.out.println();
            for ( c = 1; c < l; c++) {
                System.out.print(l + "-" + c + "\t");
            }
        }
        System.out.println();
    }
}
