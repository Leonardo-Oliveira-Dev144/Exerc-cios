import java.util.Scanner;

public class DescontoLitro {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE QUAL O COMBUSTÍVEL (G - GASOLINA) (A - ÁLCOOL)");

        String combustivel = leitor.nextLine();

        System.out.println("DIGITE A QUANTIDADE DE LITROS");

        double precoCombustivel;

        if (combustivel.equals("G")){
            precoCombustivel = 6.50;
        } else {
            precoCombustivel = 4.50;
        }

        double litros = leitor.nextInt();
        double percentual;

        if (combustivel.equals("G") && litros <= 20){
            percentual = 0.04;
        } else if (combustivel.equals("G") && litros > 20) {
            percentual = 0.06;
        } else {
            if (litros <=20){
                percentual = 0.03;
            } else {
                percentual = 0.05;
            }
        }

        double totalPagar = (precoCombustivel -(precoCombustivel * percentual)) * litros;

        System.out.println("COMBUSTÍVEL ESCOLHIDO: " + combustivel);
        System.out.println("LITROS: " + litros + "L");
        System.out.println("VALOR DO LITRO: " + precoCombustivel + " REAIS");
        System.out.println("DESCONTO: " + (percentual * 100) + "%");
        System.out.println("VALOR À PAGAR COM DESCONTO: " + totalPagar + " REAIS");

        leitor.close();

    }





}
