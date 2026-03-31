import java.util.Scanner;

public class EquacaoSegundoGrau {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE O VALOR DE A (X²):");

        double a = leitor.nextDouble();

        if (a == 0){
            System.out.println("O VALOR DE A NÃO PODE SER IGUAL A ZERO");
            return;
        }

        System.out.println("DIGITE O VALOR DE B (X):");

        double b = leitor.nextDouble();

        System.out.println("DIGITE O VALOR DE C:");

        double c = leitor.nextDouble();

        double delta = (b * b) - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if (delta < 0){
            System.out.println("Δ= " + delta);
            System.out.println("DELTA É NEGATIVO. A EQUAÇÃO NÃO POSSUÍ RAÍZES REAIS");
            return;
        } else if (delta == 0){
            System.out.println("Δ= " + delta);
            System.out.println("SÓ HÁ UMA RAIZ REAL PARA ESSA EQUAÇÃO.");
            System.out.println("X= " + x1);
            return;
        } else {
            System.out.println("Δ= " + delta);
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }

        leitor.close();
    }




}
