import java.util.Scanner;

public class OrdenarArray {


    /*Leia 5 números e mostre-os em ordem crescente
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5];
        int temp = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextInt();
        }


        for (int i = 0; i < numeros.length ; i++) {

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[i] > numeros[j]){
                    temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
            System.out.print(numeros[i] + " ");
        }

        leitor.close();

    }
}
