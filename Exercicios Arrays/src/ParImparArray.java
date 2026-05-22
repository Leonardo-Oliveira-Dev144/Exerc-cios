import java.util.Scanner;

public class ParImparArray {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);


        int[] numeros = new int[10];
        int par = 0;
        int impar = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIGITE UM NÚMERO:");
            numeros[i] = leitor.nextInt();

            if (numeros[i] % 2 == 0){
                par++;
            } else {
                impar++;
            }

        }

        System.out.println("FORAM DIGITADOS " + par + " NÚMEROS PARES");
        System.out.println("FORAM DIGITADOS " + impar + " NÚMEROS ÍMPARES");

        leitor.close();
    }

}
