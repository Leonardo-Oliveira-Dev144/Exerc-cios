import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE A QUAL O TAMANHO DO LADO DO QUADRADO:");

        double lado = leitor.nextDouble();
        double area = lado * lado;

        System.out.println("A ÁREA DO QUADRADO É: " + area + "cm²");


        leitor.close();



    }






}
