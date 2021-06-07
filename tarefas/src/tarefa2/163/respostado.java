

public class respostado {
    public static void main(String[] args) {
        int voltas = 1; 
        int abdominais = 1;
        
        do {
            System.out.println(voltas + " voltas na lagoa");
            do {
                System.out.println(abdominais + " abdominais");
                abdominais++;
            } while (abdominais <= 5);
        
        
        voltas++;
        abdominais = 1;    
        } while (voltas <= 3);
    }
}
