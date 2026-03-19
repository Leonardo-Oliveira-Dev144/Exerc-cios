import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE QUANTOS METROS VOCÊ DESEJA CONVERTER PARA CENTÍMETROS:");

        double metros = leitor.nextDouble();
        double centimetros = metros * 100;

        System.out.println(centimetros + "cm");

        leitor.close();











    }



}
