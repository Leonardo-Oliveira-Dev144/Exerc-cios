import java.util.Scanner;

public class InverterArray {

    /*Leia 8 números e imprima eles na ordem inversa.

     */
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextInt();

        }

        System.out.println("-----------------------------------");


        for (int i = numeros.length -1; i >= 0 ; --i) {
            System.out.println(numeros[i]);
        }

        leitor.close();
    }
}
