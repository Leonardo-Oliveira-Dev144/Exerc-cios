import java.util.Scanner;

public class SegundoMaiorNumero {

    /*Leia 5 números e encontre o segundo maior valor
     */
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] numeros = new int[5];
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextInt();

            if (numeros[i] > maior){
                segundoMaior = maior;
                maior = numeros[i];
            } else if (numeros[i] < maior && numeros[i] > segundoMaior) {
                segundoMaior = numeros[i];
            }

        }

        System.out.println("O SEGUNDO MAIOR NÚMERO DIGITADO FOI: " +segundoMaior);

        leitor.close();


    }

}
