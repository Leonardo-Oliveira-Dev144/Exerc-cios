import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String condicaoTriangulo = "";

        System.out.println("DIGITE O LADO (A) DO TRIÂNGULO:");

        double ladoA = leitor.nextDouble();

        System.out.println("DIGITE O LADO (B) DO TRIÂNGULO:");

        double ladoB = leitor.nextDouble();

        System.out.println("DIGITE O LADO (C) DO TRIÂNGULO");

        double ladoC = leitor.nextDouble();

        if (ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB)){
            System.out.println("ISSO É UM TRIÂNGULO");
        } else {
            System.out.println("ISSO NÃO É UM TRIÂNGULO (SÓ É CONSIDERADO UM TRIÂNGULO QUANDO A SOMA DOS DOIS LADOS É MAIOR QUE O TERCEIRO LADO)");
            return;
        }

        double semiPerimetro = (ladoA + ladoB + ladoC) / 2;
        double areaTriangulo = Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));

        if (ladoA == ladoB && ladoA == ladoC){
            condicaoTriangulo = "EQUILÁTERO";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC){
            condicaoTriangulo = "ISÓSCELES";
        } else {
            condicaoTriangulo = "ESCALENO";
        }

        System.out.println("ESSE TRIÂNGULO É: " + condicaoTriangulo);
        System.out.println("O SEMIPERÍMETRO DESSE TRIÂNGULO É: " + semiPerimetro);
        System.out.println("A ÁREA DESSE TRIÂNGULO É: " + areaTriangulo);


        leitor.close();

    }



}
