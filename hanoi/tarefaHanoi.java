import java.util.Scanner;

public class tarefaHanoi {

    private static void mover(int O, int D) {
		System.out.println(O + " -> " + D);
	}


    static void hanoi(int n, int O, int D, int T) {

		if (n > 0) {
			hanoi(n - 1, O, T, D);
			mover(O, D);
			hanoi(n - 1, T, D, O);
		}

	}
    

    public static void main(String[] args) {
        long tempoInicio = System.currentTimeMillis();

        int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de discos: ");
		n = sc.nextInt();
		
		tarefaHanoi.hanoi(n, 1, 3, 2);
        System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio));

    }
}
