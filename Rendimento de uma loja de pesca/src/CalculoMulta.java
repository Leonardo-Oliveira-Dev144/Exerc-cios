import java.util.Scanner;

public class CalculoMulta {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE QUANTOS KG DE PEIXE FORAM PESCADOS ");

        double pesoPeixes = leitor.nextDouble();

        double multa = (pesoPeixes - 50) * 4;

        double kilosExcedentes = pesoPeixes - 50;

        System.out.println("PESO DA QUANTIDADE DE PEIXES PESCADOS: " + pesoPeixes + "kg");
        System.out.println("QUILOS EXCEDENTES: " + kilosExcedentes + "kg");
        System.out.println("MULTA À PAGAR: " + multa + " REAIS");

        leitor.close();



    }






}
