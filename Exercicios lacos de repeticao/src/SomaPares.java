import java.util.Scanner;

public class SomaPares {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE UM NÚMERO INTEIRO POSITIVO:");

        int numero = leitor.nextInt();
        int soma = 0;
        int par = 0;

        for (int i = 1; i <= numero ; i++) {

            if (i % 2 == 0){
                par = i;
                soma += par;
            }

        }

        System.out.println("SOMA DOS PARES DESSE NÚMERO: " + soma);

        leitor.close();


    }



}
