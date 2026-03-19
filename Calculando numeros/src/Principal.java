import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE 3 NÚMEROS:");

        double num1 = leitor.nextDouble();
        double num2 = leitor.nextDouble();
        double num3 = leitor.nextDouble();

        //Calculando o resultado1 (o produto do dobro do primeiro numero com a metade do segundo)
        double resultado1 = (num1 * 2) * (num2 / 2);

        //Calculando o resultado2 (a soma do triplo do primeiro numero com o terceiro)
        double resultado2 = (num1 * 3) + num3;

        //Calculando o resultado3 (o terceiro numero elevado a 3)
        double resultado3 = Math.pow(num3 , 3.0);

        System.out.println("O produto do dobro do primeiro numero com a metade do segundo é: " + resultado1);
        System.out.println("A soma do triplo do primeiro numero com o terceiro é: " + resultado2);
        System.out.println("O terceiro numero elevado a 3 é igual a: " + resultado3);

        leitor.close();



    }










}
