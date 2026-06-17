import java.util.Scanner;

public class SomaArrayMulti {

    /*Leia uma matriz 3x3 e calcule a soma de todos os elementos
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("DIGITE NÚMEROS:");

            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = leitor.nextInt();
                soma += matriz[i][j];
            }

        }
        System.out.println("TOTAL: " + soma);
        leitor.close();
    }



}
