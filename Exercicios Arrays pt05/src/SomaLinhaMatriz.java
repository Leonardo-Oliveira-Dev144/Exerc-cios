import java.util.Scanner;

public class SomaLinhaMatriz {

    /*Leia uma matriz 3x3 e mostre a soma de cada linha separadamente
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma;



        for (int i = 0; i < matriz.length; i++) {
            soma = 0;
            System.out.println("DIGITE NÚMEROS:");
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = leitor.nextInt();
                soma += matriz[i][j];
            }
            System.out.println("SOMA DESSA LINHA: " + soma);
        }


    }

}
