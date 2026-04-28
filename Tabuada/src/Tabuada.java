import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE UM NÚMERO:");

        int num = leitor.nextInt();

        for (int i = 1; i <= 10 ; i++) {

            int resultado = (num * i);
            System.out.println(num + "x" + i + "=" + resultado);

        }


    }



}
