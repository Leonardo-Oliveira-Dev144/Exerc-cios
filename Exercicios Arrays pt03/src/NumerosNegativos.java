import java.util.Scanner;

public class NumerosNegativos {

    /*Leia 10 números e mostre apenas os negativos
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] <0) {
                System.out.println(numeros[i]);
            }

        }

        leitor.close();
    }
}
