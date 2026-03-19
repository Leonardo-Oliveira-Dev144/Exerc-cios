import java.util.Scanner;

public class ConverterTemperaturaEmCelsius {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE A TEMPERATURA EM GRAUS FARENHEIT:");

        double farenheit = leitor.nextDouble();

        // C = (F − 32) × 5/9
        double celsius = (farenheit - 32) * 5/9;

        System.out.println("ESSA TEMPERATURA EM CELSIUS É IGUAL A: " + celsius + "ºC");

        leitor.close();





    }





}
