import java.util.Scanner;

public class ConverterTemperaturaEmFarenheit {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE A TEMPERATURA EM CELSIUS PARA SER CONVERTIDA");

        double celsius = leitor.nextDouble();

        //°F = (°C x 9/5) + 32
        double farenheit = (celsius * 9/5) + 32;

        System.out.println("ESSA TEMPERATURA EM FARENHEIT É IGUAL A: " + farenheit + "ºF");

        leitor.close();





    }





}
