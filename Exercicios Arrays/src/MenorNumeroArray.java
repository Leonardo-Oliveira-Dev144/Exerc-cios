import java.util.Scanner;

public class MenorNumeroArray {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextInt();
            if (numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println("O MENOR VALOR DIGITADO FOI: " + menor);

    }

}
