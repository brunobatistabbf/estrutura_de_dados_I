public class respostado166 {
    public static void main(String[] args) {
       int l = 1;
       int  c = 1;
       System.out.println(" TODOS ");

       do {

         do {
             System.out.print(l + "-" + c + "\t");
             c++; 
         } while (c <= 10);
         System.out.println();
         l++;
         c = 1;
       } while (l <= 10); 
    }
}
