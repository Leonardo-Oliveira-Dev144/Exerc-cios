import java.util.Scanner;

public class GeneroAlturaPesoIdeal {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE SUA ALTURA E GÊNERO:");

        double altura = leitor.nextDouble();
        String genero = leitor.nextLine();
        double pesoIdealHomem = (72.7 * altura) - 58;
        double pesoIdealMulher = (62.1 * altura) - 44.7;

        System.out.println("SEU PESO IDEAL DE HOMEM É: " + pesoIdealHomem + "kg");
        System.out.println("SEU PESO IDEAL DE MULHER É: " + pesoIdealMulher + "kg");

        leitor.close();





    }









}
