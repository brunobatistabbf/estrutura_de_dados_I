public class respostawhile {
    public static void main(String[] args) {
        int voltas = 1;
        int abdominais = 1;
        
        
        while (voltas <= 3) {
            System.out.println(voltas + " voltas na lagoa.");
           
            while (abdominais <= 5 ) {
             System.out.println(abdominais + " abdominais");
             abdominais++;
            }
        
            voltas++;
            abdominais = 1;
        }
    }
}
