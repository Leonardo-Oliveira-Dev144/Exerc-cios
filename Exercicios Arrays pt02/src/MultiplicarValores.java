import java.util.Scanner;

public class MultiplicarValores {

    /*Leia 5 números e crie outro array contendo o dobro de cada valor
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] numeros = new int[5];
        int [] produtoNumeros = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextInt();
            produtoNumeros[i] = numeros[i] * 2;
        }
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("DOBRO DOS VALORES PRESENTES NO ARRAY: " + produtoNumeros[i]);

        }

        leitor.close();

    }




}
