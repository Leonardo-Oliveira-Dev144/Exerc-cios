import java.util.Scanner;

public class PositivoOuNegativo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE UM VALOR:");

        double numero = leitor.nextDouble();

        if (numero > 0) {
            System.out.println("O NÚMERO: " + numero + " É POSITIVO");
        } else {
            System.out.println("O NÚMERO: " + numero + " É NEGATIVO");
        }

    }

}
