import java.util.Scanner;

public class MaiorNumeroMatriz {
    /*Leia uma matriz 4x4 e encontre o maior número
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("DIGITE NÚMEROS:");
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = leitor.nextInt();

                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }

            }


        }

        System.out.println("MAIOR NÚMERO DIGITADO: " + maior);

        leitor.close();
    }

}
