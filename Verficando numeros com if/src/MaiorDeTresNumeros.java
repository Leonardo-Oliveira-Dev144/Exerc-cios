import java.util.Scanner;

public class MaiorDeTresNumeros {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE 3 NÚMEROS:");

        double numero1 = leitor.nextDouble();
        double numero2 = leitor.nextDouble();
        double numero3 = leitor.nextDouble();

        if (numero1 > numero2 && numero1 > numero3){
            System.out.println("O NÚMERO MAIOR É: " + numero1);

        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O NÚMERO MAIOR É: " + numero2);
        } else {
            System.out.println("O NÚMERO MAIOR É: " + numero3);
        }


    }

}
