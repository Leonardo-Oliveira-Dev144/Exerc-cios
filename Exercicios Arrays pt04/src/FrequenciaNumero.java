import java.util.Scanner;

public class FrequenciaNumero {

    /*Leia 5 números e peça um valor ao usuário.
    Informe quantas vezes ele aparece no array.
     */


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] numeros = new int[5];
        int contador = 0;
        int numero;

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextInt();

        }

        System.out.println("DIGITE UM NÚMERO QUE ESTEJA NO ARRAY:");
        numero = leitor.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]){
                contador++;
            }



        }

        System.out.println("ESSE NÚMERO APARECE " + contador + " VEZES NO ARRAY");

        leitor.close();

    }





}
