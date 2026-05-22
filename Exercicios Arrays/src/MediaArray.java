import java.util.Scanner;

public class MediaArray {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double[] numeros = new double[8];
        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextDouble();
            soma += numeros[i];
        }

        double media = soma / numeros.length;

        System.out.println("A MÉDIA DESSES VALORES É IGUAL À: " + media);

    }
}
