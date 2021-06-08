public class respostado169 {
    public static void main(String[] args) {
       int c = 1, l = 1, t;
       System.out.println("ABAIXO DA DIAGONAL PRINCIPAL ");

        do {
            System.out.println();
            do {
                System.out.print(l + "-" + c + "\t");
                c++;
            } while (c < l);
            l++;
            c = 1;
        } while (l <= 10);
        System.out.println();
    }
}
