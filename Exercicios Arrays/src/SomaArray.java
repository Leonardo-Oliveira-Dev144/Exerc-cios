import java.util.Scanner;

public class SomaArray {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double[] numeros = new double[5];
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextDouble();
            soma += numeros[i];
        }

        System.out.println("A SOMA DESSES VALORES É IGUAL À: " + soma);

    }
}
