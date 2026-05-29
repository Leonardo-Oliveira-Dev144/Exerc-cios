import java.util.Scanner;

public class CopiarArray {


    /*Crie um array e copie seus valores para outro array
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] numeros = new int[4];
        int [] copiaNumeros = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("PASSE OS NÚMEROS PARA UM ARRAY:");
            numeros[i] = leitor.nextInt();
            copiaNumeros[i] = numeros[i];
        }

        for (int copiaNumero : copiaNumeros) {
            System.out.println("CÓPIA DO PRIMEIRO ARRAY: " + copiaNumero);
        }
        leitor.close();

    }










}
