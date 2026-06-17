public class ImprimirArrayMultidimensional {


    /*Crie uma matriz 3x3 e imprima todos os valores
     */

    public static void main(String[] args) {

        int [][] arrayMulti = new int[3][3];

        arrayMulti[0][0] = 1;
        arrayMulti[0][1] = 2;
        arrayMulti[0][2] = 3;

        arrayMulti[1][0] = 4;
        arrayMulti[1][1] = 5;
        arrayMulti[1][2] = 6;

        arrayMulti[2][0] = 7;
        arrayMulti[2][1] = 8;
        arrayMulti[2][2] = 9;


        for (int i = 0; i < arrayMulti.length; i++) {


            for (int j = 0; j < arrayMulti.length; j++) {

                System.out.print(arrayMulti[i][j] + " ");


            }

        }




    }


}
