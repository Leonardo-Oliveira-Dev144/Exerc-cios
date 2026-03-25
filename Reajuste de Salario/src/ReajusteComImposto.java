import java.util.Scanner;

public class ReajusteComImposto {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIGITE QUANTO O FUNCIONÁRIO GANHA POR HORA:");

        double salarioHora = leitor.nextDouble();

        System.out.println("DIGITE QUANTAS HORAS O FUNCIONÁRIO TRABALHA NO MÊS:");

        double horasTrabalho = leitor.nextDouble();

        double salarioBruto = (salarioHora * horasTrabalho);

        double inss = (salarioBruto * 0.10);

        double fgts = (salarioBruto * 0.11);

        double ir;

        if (salarioBruto < 900){
            ir = 0;
        } else if (salarioBruto < 1500) {
            ir = 0.05;
        } else if (salarioBruto < 2500) {
            ir = 0.10;
        } else {
            ir = 0.20;
        }
        double totalDescontos = (salarioBruto * ir) + inss;

        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("SALÁRIO BRUTO: " + salarioBruto + " REAIS POR MÊS");
        System.out.println("IMPOSTO DE RENDA: " + (ir * 100) + "%: " + (salarioBruto * ir) + "REAIS");
        System.out.println("INSS: " + (0.10 * 100) + "%: " + inss + " REAIS");
        System.out.println("FGTS: " + (0.11 * 100) + "%: " + fgts + " REAIS");
        System.out.println("TOTAL DE DESCONTOS: " + totalDescontos + " REAIS");
        System.out.println("SALÁRIO LÍQUIDO: " + salarioLiquido + " REAIS");

        leitor.close();

    }



}
