public class respostafor167 {
    public static void main(String[] args) {
        int l, c, t;

        System.out.println("ACIMA DIAGONAL PRINCIPAL");
        for ( l = 1; l <= 10; l++) 
        {
            for (c =  l + 1; c <=10 ; c++) {
                System.out.println("\t" + l + '-' + c);
                System.out.println();
                
                for (t = 1; t <= l; t++) {
                    System.out.print("\t");
                    
                }
            }
        }
        System.out.println();
    }
}
