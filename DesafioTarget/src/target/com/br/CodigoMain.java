package target.com.br;

import java.util.Scanner;

public class CodigoMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Verificar se um número pertence à sequência de Fibonacci");
            System.out.println("2. Contar quantas vezes a letra 'a' aparece em uma string");
            System.out.println("3. Calcular o valor da variável SOMA");
            System.out.println("4. Completar as sequências lógicas");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    sequenciaFibonacci(scanner);
                    break;
                case 2:
                    contarLetraA(scanner);
                    break;
                case 3:
                    calcularSoma();
                    break;
                case 4:
                    completarSequencias();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (option != 5);

        scanner.close();
    }

    // 1 - 
    public static void sequenciaFibonacci(Scanner scanner) {
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        if (pertenceFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int numero) {
        int a = 0,
        b = 1;
        while (b < numero) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == numero || a == numero;
    }

    // 2 - 
    public static void contarLetraA(Scanner scanner) {
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();
        int contador = contarLetraA(texto);
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' não aparece no texto.");
        }
    }

    public static int contarLetraA(String texto) {
        int contador = 0;
        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }
        return contador;
    }

    // 3. -
    public static void calcularSoma() {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor de SOMA é: " + SOMA);  
    }

    // 4 - 
    public static void completarSequencias() {
        System.out.println("a) 1, 3, 5, 7, ");
        System.out.println("   Próximo número: 9");

        System.out.println("b) 2, 4, 8, 16, 32, 64, ");
        System.out.println("   Próximo número: 128");

        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, ");
        System.out.println("   Próximo número: 49");

        System.out.println("d) 4, 16, 36, 64, ");
        System.out.println("   Próximo número: 100");

        System.out.println("e) 1, 1, 2, 3, 5, 8, ");
        System.out.println("   Próximo número: 13");

        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, ");
        System.out.println("   Próximo número: 20");
    }

}
