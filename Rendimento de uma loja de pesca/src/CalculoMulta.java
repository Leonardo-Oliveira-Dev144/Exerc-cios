import java.util.Scanner;

public class CalculoMulta {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE QUANTOS KG DE PEIXE FORAM PESCADOS:");

        double pesoPeixes = leitor.nextDouble();
        double kilosExcedentes = pesoPeixes - 50;
        double multa = (pesoPeixes - 50) * 4;

        if (pesoPeixes > 50){
            System.out.println("QUANTIDADE DE PEIXES PESCADOS: " + pesoPeixes + "kg");
            System.out.println("KG EXCEDENTES: " + kilosExcedentes + "kg");
            System.out.println("MULTA À PAGAR: " + multa + " REAIS");
        }
        else {
            System.out.println("QUANTIDADE DE PEIXES PESCADOS: " + pesoPeixes + "kg");
        }

        leitor.close();



    }






}
