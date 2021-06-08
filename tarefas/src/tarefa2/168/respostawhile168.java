public class respostawhile168 {
    public static void main(String[] args) {
        int l = 1;
        int t = 1;    
        System.out.println("DIAGONAL PRINCIPAL");

        while (l <= 10) {
            System.out.println(l + "-" + l);
            while (t <= l) {
                System.out.print("\t");
                t++;
            }
            l++;
            t = 1;

        }
        System.out.println();
    }
}
