import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE O RAIO DO CÍRCULO:");


        //A = π × r²
        double raio = leitor.nextDouble();
        double pi = Math.PI;
        double area = pi * (raio * raio);

        System.out.println("A área do círculo é: " + area);


        leitor.close();







    }












}
