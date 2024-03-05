import java.util.Scanner;

public class Questao_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        int numero = scanner.nextInt();
        int nEsimoFibonacci = fibonacci(numero);

        if (numero == nEsimoFibonacci) {
            System.out.printf("O número %d pertence à sequência de Fibonacci.\n", numero);
        } else {
            System.out.printf("O número %d não pertence à sequência de Fibonacci.\n", numero);
        }

        scanner.close();
    }

    private static int fibonacci(int n) {
        if (n <= 1) { 
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
