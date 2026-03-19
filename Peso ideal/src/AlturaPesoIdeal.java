import java.util.Scanner;

public class AlturaPesoIdeal {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE SUA ALTURA:");

        //(72.7*altura) - 58
        double altura = leitor.nextDouble();
        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("SEU PESO IDEAL É: " + pesoIdeal + "kg");

        leitor.close();



    }






}
