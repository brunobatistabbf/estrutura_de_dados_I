public class respostado168 {
    public static void main(String[] args) {
        int l = 1;
        int t = 1;
        System.out.println("DIAGONAL PRINCIPAL");
        do {
            System.out.println(l + "-" + l);
            do {
                System.out.print("\t");
                t++;
            } while (t <= l);
            l++;
            t = 1;
        } while (l <= 10);
        System.out.println();

    }
}
