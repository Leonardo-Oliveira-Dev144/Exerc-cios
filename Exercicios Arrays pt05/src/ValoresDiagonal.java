import java.util.Scanner;

public class ValoresDiagonal {

    /*Leia uma matriz 3x3 e mostre os valores da diagonal principal
     */
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("DIGITE NÚMEROS:");
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = leitor.nextInt();

            }
        }

        for (int i = 0; i < matriz.length; i++) {

            System.out.println(matriz[i][i]);

        }

        leitor.close();


    }



}
