import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double[] vetor_1 = new Double[10];
        Double[] vetor_2 = new Double[10];
        Double[] vetorSoma = new Double[10];

        vetor_1 = preencheVetor(vetor_1, sc);
        vetor_2 = preencheVetor(vetor_2, sc);

        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = vetor_1[i] + vetor_2[i];
        }

        // Exibindo os vetores
        System.out.println("\nVetor 1:");
        for (Double v : vetor_1) {
            System.out.print(v + " ");
        }

        System.out.println("\n\nVetor 2:");
        for (Double v : vetor_2) {
            System.out.print(v + " ");
        }

        System.out.println("\n\nVetor Soma:");
        for (Double v : vetorSoma) {
            System.out.print(v + " ");
        }

        sc.close();
    }

    public static Double[] preencheVetor (Double[] vetor, Scanner sc) {
        System.out.println("Insira os valores para o Vetor:");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }

        return vetor;
    }

}
