import java.util.Scanner;

public class RemoverDuplicados {

    /*Leia 5 números e mostre apenas os valores sem repetição
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5];
        int numero;
        boolean existe;

        for (int i = 0; i < numeros.length; i++) {
            existe = false;
            System.out.println("DIGITE UM NÚMERO:");
            numero = leitor.nextInt();

            for (int j = 0; j < i; j++) {
                if (numero == numeros[j]){
                    existe = true;
                    break;
                }

            }
            if (!existe){
                numeros[i] = numero;
            }


        }


        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

        }

        leitor.close();
    }



}
