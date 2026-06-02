import java.util.Scanner;

public class UniaoArrays {

    /*Crie dois arrays com 5 números cada e junte todos
    em um terceiro array.
     */

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] array1 = {1, 2, 3, 4, 5};
        int [] array2 = {6, 7, 8, 9, 10};
        int[] array3 = new int[10];

        for (int i = 0; i < 5; i++) {

            array3[i] = array1[i];
            array3[i + 5] = array2[i];
        }

        for (int i = 0; i < array3.length; i++) {

            System.out.println(array3[i]);
        }

        leitor.close();
    }



}
