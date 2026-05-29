import java.util.Scanner;

public class PosicaoMaiorNumero {

    /*Leia 10 números e mostre o maior valor e a posição
    (index) dele.
     */


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior){
                maior = numeros[i];
                index = i;
            }
        }

        System.out.println("O MAIOR VALOR DIGITADO FOI: " + maior);
        System.out.println("A POSIÇÃO QUE ESSE VALOR OCUPA NO ARRAY É A POSIÇÃO: " + index);

        leitor.close();

    }


}
