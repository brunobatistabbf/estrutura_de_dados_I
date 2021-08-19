import java.util.Scanner;

//Entrar com a sigla do estado de uma pessoa e imprimir uma das mensagens:
//carioca
//paulista
//mineiro
//outros estados

public class resposta105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sigla;
        System.out.println("Digite a sigla do seu  estado:");
        System.out.println("Priorizados MG, SP, RJ");
        sigla = sc.next();

        if (sigla == "RJ" || sigla == "rj") {
            System.out.println("Carioca");
        }
        if (sigla == "SP" || sigla == "sp"){
            System.out.println("Paulista");
        }if (sigla == "mg" ||sigla == "MG") {
            System.out.println("Mineiro");
        } 
        else {
            System.out.println("Pertecente a outros estados");
        }
        System.out.println("");
        //Switch
        System.out.println("Com Switch");
        System.out.println("Digite a sigla do seu  estado:");
        System.out.println("Priorizados MG, SP, RJ");
        sigla = sc.next();

        switch (sigla) {
            case "RJ":
             System.out.println("Carioca");
                break;

            case "rj":
             System.out.println("Carioca");
                break;
            case "sp":
              System.out.println("Paulista");
                break;
            case "SP":
             System.out.println("Paulista");
                break;
            case "mg":
             System.out.println("Mineiro");
                break;
            case "MG":
             System.out.println("Mineiro");
                break;
           
            default:
             System.out.println("Pertecente a outros estados");
                break;
        }
        sc.close();

    }
}
