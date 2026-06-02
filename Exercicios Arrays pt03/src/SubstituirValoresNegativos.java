import java.util.Scanner;

public class SubstituirValoresNegativos {

    /*Leia 10 números. Todo valor negativo deve ser substituido por 0
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
                numeros[i] = 0;
            }

            System.out.println(numeros[i]);

        }

        leitor.close();




    }




}
