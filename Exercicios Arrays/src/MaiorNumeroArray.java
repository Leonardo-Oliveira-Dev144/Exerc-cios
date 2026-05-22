import java.util.Scanner;

public class MaiorNumeroArray {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextInt();
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }

        System.out.println("O MAIOR VALOR DIGITADO FOI: " + maior);

    }



}
