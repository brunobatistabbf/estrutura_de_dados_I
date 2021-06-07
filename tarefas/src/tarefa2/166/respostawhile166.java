public class respostawhile166 {
    public static void main(String[] args) {
        int c = 1;
        int l = 1;
        System.out.println(" TODOS ");
        while (l <= 10) {
            while (c <= 10) {
                System.out.print(l + "-" + c + "\t");
                c++;
            }
            System.out.println();
            l++;
            c = 1;
        }
        System.out.println();
    }
}
