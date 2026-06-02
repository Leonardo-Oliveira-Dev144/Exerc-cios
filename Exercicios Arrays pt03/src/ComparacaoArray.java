import java.util.Scanner;

public class ComparacaoArray {

    /*Crie dois arrays com 5 posições. Informe quantas posições
    possuem valores iguais.
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] array1 = {1, 3, 5, 8, 5};
        int [] array2 = {1, 2, 5, 8, 9};
        int contador = 0;

        for (int i = 0; i < array1.length ; i++) {

            if (array1[i] == array2[i]){
                contador++;
            }
        }

        System.out.println(contador + " POSIÇÕES POSSUEM VALORES IGUAIS.");

        leitor.close();
    }

}
